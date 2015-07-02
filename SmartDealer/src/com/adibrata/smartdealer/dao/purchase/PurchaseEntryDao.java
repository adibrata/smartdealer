/**
 * 
 */
package com.adibrata.smartdealer.dao.purchase;

/**
 * @author Henry
 *
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.purchase.*;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;
import util.adibrata.support.transno.GetTransNo;

public class PurchaseEntryDao implements PurchaseOrderService {
	String userupd;
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();

	public PurchaseEntryDao() {
		// TODO Auto-generated constructor stub
		session = HibernateHelper.getSessionFactory().openSession();
		this.userupd = userupd;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.adibrata.smartdealer.service.purchase.PurchaseOrder#Save()
	 */
	@Override
	public void Save(PurchaseOrderHdr purchaseOrderHdr,
			List<PurchaseOrderDtl> lstpurchaseOrderDtl) {
		// TODO Auto-generated method stub
		StringBuilder assetcode = new StringBuilder();
		String pono;
		session.getTransaction().begin();
		try {
			pono = GetTransNo.GenerateTransactionNo(session,purchaseOrderHdr.getPartner().getPartnerCode(),
					purchaseOrderHdr.getOffice().getId(), "PO", dtmupd.getTime());
			purchaseOrderHdr.setPono(pono);
			purchaseOrderHdr.setDtmCrt(dtmupd.getTime());
			purchaseOrderHdr.setDtmUpd(dtmupd.getTime());
			session.save(purchaseOrderHdr);

			for (PurchaseOrderDtl arow : lstpurchaseOrderDtl) {
				// 1. Save Asset Master
				// 2. Save Stock
				// 3. Save purchase order detail
				AssetMaster assetmaster = new AssetMaster();
				assetmaster.setPartner(purchaseOrderHdr.getPartner());
				assetmaster.setAssetBrand(arow.getAssetBrand());
				assetmaster.setAssetType(arow.getAssetType());
				assetmaster.setAssetModel(arow.getAssetModel());
				assetmaster.setAssetLevel((int) 3);
				assetcode.append(arow.getAssetBrand());
				assetcode.append(",");
				assetcode.append(arow.getAssetType());
				assetcode.append(",");
				assetcode.append(arow.getAssetModel());
				assetmaster.setDtmCrt(dtmupd.getTime());
				assetmaster.setDtmUpd(dtmupd.getTime());
				assetmaster.setUsrCrt(purchaseOrderHdr.getUsrCrt());
				assetmaster.setUsrUpd(purchaseOrderHdr.getUsrUpd());

				assetmaster.setAssetCode(assetcode.toString());
				session.save(assetmaster);

				Stock stock = new Stock();
				stock.setPartner(purchaseOrderHdr.getPartner());
				stock.setOffice(purchaseOrderHdr.getOffice());
				stock.setAssetMaster(assetmaster);
				stock.setAssetBrand(arow.getAssetBrand());
				stock.setAssetType(arow.getAssetType());
				stock.setAssetModel(arow.getAssetModel());
				stock.setAssetCode(assetmaster.getAssetCode());
				stock.setBpkbno(arow.getBpkbno());
				stock.setBpkbname(arow.getBpkbname());
				stock.setBpkbaddress(arow.getBpkbaddress());
				stock.setVehicleColor(arow.getVehicleColor());
				stock.setMachineNo(arow.getMachineNo());
				stock.setChasisNo(arow.getChasisNo());
				stock.setCylinder(arow.getCylinder());
				stock.setLicensePlate(arow.getLicensePlate());
				stock.setManufacturingMonth(arow.getManufacturingMonth());
				stock.setManufacturingYear(arow.getManufacturingYear());
				stock.setPurchasePrice(arow.getAssetPrice());
				stock.setPurchaseDate(purchaseOrderHdr.getPodate());
				stock.setStockStatus("NEW");
				stock.setSupplier(purchaseOrderHdr.getSupplier());
				stock.setDtmCrt(dtmupd.getTime());
				stock.setDtmUpd(dtmupd.getTime());
				stock.setUsrCrt(purchaseOrderHdr.getUsrCrt());
				stock.setUsrUpd(purchaseOrderHdr.getUsrUpd());
				session.save(stock);

				PurchaseOrderDtl purchsaeorderdtl = new PurchaseOrderDtl();
				purchsaeorderdtl = arow;
				purchsaeorderdtl.setPurchaseOrderHdr(purchaseOrderHdr);
				purchsaeorderdtl.setDtmCrt(dtmupd.getTime());
				purchsaeorderdtl.setDtmUpd(dtmupd.getTime());
				session.save(purchsaeorderdtl);
			}

			session.getTransaction().commit();

		} catch (Exception exp) {
			session.getTransaction().rollback();
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.adibrata.smartdealer.service.purchase.PurchaseOrder#Paging(int,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public List Paging(int CurrentPage, String WhereCond, String SortBy) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.adibrata.smartdealer.service.purchase.PurchaseOrder#TotalRecord(java
	 * .lang.String)
	 */
	@Override
	public long TotalRecord(String WherCond) {
		// TODO Auto-generated method stub
		return 0;
	}

}
