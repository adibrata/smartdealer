/**
 * 
 */
package com.adibrata.smartdealer.dao.entrust;

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

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;
import util.adibrata.support.transno.GetTransNo;

import com.adibrata.smartdealer.service.entrust.EntrustService;

public class EntrustTransactionsDao implements EntrustService {
	String userupd;
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;

	public EntrustTransactionsDao() {
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.adibrata.smartdealer.service.entrust.EntrustTransactions#Save()
	 */
	@Override
	public void Save(EntrustHdr entrustHdr, EntrustDtl entrustDtl) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			entrustHdr.setDtmCrt(dtmupd.getTime());
			entrustHdr.setDtmUpd(dtmupd.getTime());
			entrustDtl.setDtmCrt(dtmupd.getTime());
			entrustDtl.setDtmUpd(dtmupd.getTime());
			session.save(entrustHdr);
			session.save(entrustDtl);

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
	 * @see
	 * com.adibrata.smartdealer.service.entrust.EntrustTransactions#Paging(int,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public List<Object[]> Paging(int CurrentPage, String WhereCond,
			String SortBy) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.adibrata.smartdealer.service.entrust.EntrustTransactions#TotalRecord
	 * (java.lang.String)
	 */
	@Override
	public long TotalRecord(String WherCond) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Object[]> View(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
