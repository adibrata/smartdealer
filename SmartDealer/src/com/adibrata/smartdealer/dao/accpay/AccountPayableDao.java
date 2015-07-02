/**
 * 
 */
package com.adibrata.smartdealer.dao.accpay;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;
import util.adibrata.support.transno.GetTransNo;

import com.adibrata.smartdealer.service.accpay.*;

import org.hibernate.Query;
import org.hibernate.Session;

import com.adibrata.smartdealer.model.*;
/**
 * @author Henry
 *
 */
public class AccountPayableDao implements SelectionService{


	String userupd; 
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	

	public AccountPayableDao(String userupd) {
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
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.adibrata.smartdealer.service.accpay.Selection#Save(com.adibrata.smartdealer.model.Customer)
	 */
	@Override
	public void Save(AccountPayable accountPayable) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			accountPayable.setDtmCrt(dtmupd.getTime());
			accountPayable.setDtmUpd(dtmupd.getTime());
			session.save(accountPayable);
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
	 * @see com.adibrata.smartdealer.service.accpay.Selection#Paging(int, java.lang.String, java.lang.String)
	 */
	@Override
	public List<AccountPayable>  Paging(int CurrentPage, String WhereCond, String SortBy) {
		// 		TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<AccountPayable> list = null;
		try {
			hql.append(strStatement);
			if (WhereCond != "")
				hql.append(WhereCond);

			Query selectQuery = session.createQuery(hql.toString());
			selectQuery.setFirstResult((CurrentPage - 1) * pagesize);
			selectQuery.setMaxResults(pagesize);
			list = selectQuery.list();

		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return list;
	}

	/* (non-Javadoc)
	 * @see com.adibrata.smartdealer.service.accpay.Selection#TotalRecord(java.lang.String)
	 */
	@Override
	public long TotalRecord(String WherCond) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public AccountPayable View(long id) {
		// TODO Auto-generated method stub
		AccountPayable accountPayable = null;
		try {
			accountPayable =  (AccountPayable) session.get(AccountPayable.class, id);
			
		} catch (Exception exp) {
			
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return accountPayable;
	}

}
