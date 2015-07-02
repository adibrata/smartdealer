/**
 * 
 */
package com.adibrata.smartdealer.dao.setting;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.setting.DealerService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;
import util.adibrata.support.transno.GetTransNo;

/**
 * @author Henry
 *
 */
public class DealerDao implements DealerService{
	String userupd; 
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;
	/**
	 * 
	 */
	public DealerDao() {
		// TODO Auto-generated constructor stub
		session = HibernateHelper.getSessionFactory().openSession();
	}

	/* (non-Javadoc)
	 * @see com.adibrata.smartdealer.service.setting.DealerService#SaveAdd(com.adibrata.smartdealer.model.Supplier)
	 */
	@Override
	public void SaveAdd(Supplier supplier) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			supplier.setDtmCrt(dtmupd.getTime());
			supplier.setDtmUpd(dtmupd.getTime());
			session.save(supplier);
			
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
	 * @see com.adibrata.smartdealer.service.setting.DealerService#SaveEdit(com.adibrata.smartdealer.model.Supplier)
	 */
	@Override
	public void SaveEdit(Supplier supplier) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			
			supplier.setDtmUpd(dtmupd.getTime());
			session.update(supplier);
			
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
	 * @see com.adibrata.smartdealer.service.setting.DealerService#Savedel(com.adibrata.smartdealer.model.Supplier)
	 */
	
	@Override
	public void Savedel(Supplier supplier) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {

			session.delete(supplier);
			
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
	 * @see com.adibrata.smartdealer.service.setting.DealerService#Paging(int, java.lang.String, java.lang.String)
	 */
	@Override
	public  List<Supplier> Paging(int CurrentPage, String WhereCond, String SortBy) {
		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<Supplier> list = null;
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
	 * @see com.adibrata.smartdealer.service.setting.DealerService#TotalRecord(java.lang.String)
	 */
	@Override
	public long TotalRecord(String WherCond) {
		// TODO Auto-generated method stub
		long countResults = 0 ;
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
	public Supplier View(long id) {
		// TODO Auto-generated method stub
		Supplier supplier = null;
		try {
			supplier =  (Supplier) session.get(Supplier.class, id);
			
		} catch (Exception exp) {
			
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return supplier;
	}

}
