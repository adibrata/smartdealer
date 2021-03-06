/**
 * 
 */
package com.adibrata.smartdealer.dao.purchase;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.hibernate.Session;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.dao.DaoBase.TransactionType;
import com.adibrata.smartdealer.model.OtherDsbDtl;
import com.adibrata.smartdealer.model.PurchaseInvoice;
import com.adibrata.smartdealer.model.PurchaseOrderHdr;
import com.adibrata.smartdealer.model.SalesOrderHdr;
import com.adibrata.smartdealer.service.purchase.PurchaseInvoiceService;

/**
 * @author Henry
 *
 */
public class PuchaseInvoiceDao extends DaoBase implements PurchaseInvoiceService {

	/**
	 * 
	 */
	String userupd;
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;
	
	public PuchaseInvoiceDao() throws Exception {
		// TODO Auto-generated constructor stub
		try {
			session = HibernateHelper.getSessionFactory().openSession();
			pagesize = HibernateHelper.getPagesize();
			strStatement = " from Supplier ";

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

	@Override
	public void Save(String usrupd, PurchaseInvoice purchaseInvoice) throws Exception {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			String transno = TransactionNo(session, TransactionType.purchaseinvoice, purchaseInvoice
					.getPartner().getPartnerCode(), purchaseInvoice.getOffice()
					.getId());
			purchaseInvoice.setPoinvNo(transno);
			purchaseInvoice.setDtmCrt(dtmupd.getTime());
			purchaseInvoice.setDtmUpd(dtmupd.getTime());
			session.save(purchaseInvoice);

		
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


	@Override
	public PurchaseInvoice View(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SalesOrderHdr viewSalesOrderHdr(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
