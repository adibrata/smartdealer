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

import com.adibrata.smartdealer.model.OtherDsbDtl;
import com.adibrata.smartdealer.model.PurchaseInvoice;
import com.adibrata.smartdealer.model.PurchaseOrderHdr;
import com.adibrata.smartdealer.model.SalesOrderHdr;
import com.adibrata.smartdealer.service.purchase.PurchaseInvoiceService;

/**
 * @author Henry
 *
 */
public class PuchaseInvoiceDao implements PurchaseInvoiceService {

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
	
	public PuchaseInvoiceDao() {
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
	public void Save(PurchaseInvoice purchaseInvoice) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
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
	public List<PurchaseOrderHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long TotalRecord(String WherCond) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public PurchaseInvoice View(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PurchaseOrderHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SalesOrderHdr viewSalesOrderHdr(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
