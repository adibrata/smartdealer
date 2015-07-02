/**
 * 
 */
package com.adibrata.smartdealer.dao.cashtransactions;

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
import com.adibrata.smartdealer.service.cashtransactions.PettyCashService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;
import util.adibrata.support.transno.GetTransNo;
public class PettyCashDao implements PettyCashService {
	String userupd; 
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;
	public PettyCashDao() {
		
		// TODO Auto-generated constructor stub
		try {
			session = HibernateHelper.getSessionFactory().openSession();
			pagesize = HibernateHelper.getPagesize();
			strStatement = " from Office ";

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
	 * @see com.adibrata.smartdealer.service.cashtransactions.PettyCashService#SavePettyCash(com.adibrata.smartdealer.model.PettyCashHdr, com.adibrata.smartdealer.model.PettyCashDtl)
	 */
	@Override
	public void SavePettyCash(PettyCashHdr pettycashhdr,
			PettyCashDtl pettycashdtl) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			pettycashhdr.setDtmCrt(dtmupd.getTime());
			pettycashhdr.setDtmUpd(dtmupd.getTime());
			pettycashdtl.setDtmCrt(dtmupd.getTime());
			pettycashdtl.setDtmUpd(dtmupd.getTime());
			session.save(pettycashhdr);
			
			session.save(pettycashdtl);
			session.getTransaction().commit();

		} catch (Exception exp) {
			session.getTransaction().rollback();
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
	}

	/* (non-Javadoc)
	 * @see com.adibrata.smartdealer.service.cashtransactions.PettyCashService#PurchaseInvoicePaging(int, java.lang.String, java.lang.String)
	 */
	@Override
	public List PurchaseInvoicePaging(int CurrentPage, String WhereCond,
			String SortBy) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.adibrata.smartdealer.service.cashtransactions.PettyCashService#PurchaseInvoicePagingTotalRecord(java.lang.String)
	 */
	@Override
	public double PurchaseInvoicePagingTotalRecord(String WherCond) {
		// TODO Auto-generated method stub
		return 0;
	}

}
