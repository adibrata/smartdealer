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
import com.adibrata.smartdealer.service.cashtransactions.AdvanceCashService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;
import util.adibrata.support.transno.GetTransNo;
public class AdvanceCashDao implements AdvanceCashService {
	String userupd; 
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;
	public AdvanceCashDao ()
	{
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
	 * @see com.adibrata.smartdealer.service.cashtransactions.AdvanceCashService#Save(com.adibrata.smartdealer.model.AdvanceCash)
	 */
	@Override
	public void Save(AdvanceCash advancecash) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			advancecash.setDtmCrt(dtmupd.getTime());
			advancecash.setDtmUpd(dtmupd.getTime());
			session.save(advancecash);
			
			
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
	 * @see com.adibrata.smartdealer.service.cashtransactions.AdvanceCashService#Paging(int, java.lang.String, java.lang.String)
	 */
	@Override
	public List Paging(int CurrentPage, String WhereCond, String SortBy) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.adibrata.smartdealer.service.cashtransactions.AdvanceCashService#TotalRecord(java.lang.String)
	 */
	@Override
	public long TotalRecord(String WherCond) {
		// TODO Auto-generated method stub
		long countResults = 0;
		try {
			String countQ = "Select count (id) " + strStatement;
			Query countQuery = session.createQuery(countQ);
			countResults = (long) countQuery.uniqueResult();

		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return countResults;
	}

	@Override
	public List<Object[]> View(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
