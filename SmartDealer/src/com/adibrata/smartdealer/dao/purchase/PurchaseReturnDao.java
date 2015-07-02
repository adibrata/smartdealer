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
public class PurchaseReturnDao implements PurchaseReturnService{
	String userupd; 
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();

	public PurchaseReturnDao() {
		// TODO Auto-generated constructor stub
		session = HibernateHelper.getSessionFactory().openSession();
		
	}

	/* (non-Javadoc)
	 * @see com.adibrata.smartdealer.service.purchase.PurchaseOrder#Save()
	 */
	@Override
	public void Save(ReturPurchaseHdr returPurchaseHdr, List<ReturPurchaseDtl> returPurchaseDtl) {
		// TODO Auto-generated method stub
	
	
		String retpurchaseno;
		session.getTransaction().begin();
		try {
			retpurchaseno = GetTransNo.GenerateTransactionNo(session,returPurchaseHdr.getPartner().getPartnerCode(),
					returPurchaseHdr.getOffice().getId(), "REP", dtmupd.getTime());

			returPurchaseHdr.setReturPurchaseNo(retpurchaseno);
			
			returPurchaseHdr.setDtmCrt(dtmupd.getTime());
			returPurchaseHdr.setDtmUpd(dtmupd.getTime());
		
			session.save(returPurchaseHdr);

			for (ReturPurchaseDtl arow : returPurchaseDtl) {
				// 1.No Impact Asset Master
				// 2. Save Stock update Status
				// 3. Save purchase order detail
			

				Stock stock = new Stock();
				stock.setPartner(returPurchaseHdr.getPartner());
				stock.setOffice(returPurchaseHdr.getOffice());
				stock.setId(arow.getStock().getId());
				
				stock.setStockStatus("RET");
				stock.setSupplier(returPurchaseHdr.getSupplier());
				stock.setDtmCrt(dtmupd.getTime());
				stock.setDtmUpd(dtmupd.getTime());
				stock.setUsrCrt(returPurchaseHdr.getUsrCrt());
				stock.setUsrUpd(returPurchaseHdr.getUsrUpd());
				session.save(stock);

				ReturPurchaseDtl returpurchasedtl = new ReturPurchaseDtl();
				returpurchasedtl = arow;
				returpurchasedtl.setReturPurchaseHdr(returPurchaseHdr);
				returpurchasedtl.setDtmCrt(dtmupd.getTime());
				returpurchasedtl.setDtmUpd(dtmupd.getTime());
				session.save(returpurchasedtl);
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

	/* (non-Javadoc)
	 * @see com.adibrata.smartdealer.service.purchase.PurchaseOrder#Paging(int, java.lang.String, java.lang.String)
	 */
	@Override
	public List Paging(int CurrentPage, String WhereCond, String SortBy) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.adibrata.smartdealer.service.purchase.PurchaseOrder#TotalRecord(java.lang.String)
	 */
	@Override
	public long TotalRecord(String WherCond) {
		// TODO Auto-generated method stub
		return 0;
	}

}
