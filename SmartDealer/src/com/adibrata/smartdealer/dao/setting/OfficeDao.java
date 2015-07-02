/**
 * 
 */
package com.adibrata.smartdealer.dao.setting;

/**
 * @author Henry
 *
 */
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.setting.OfficeService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;
import util.adibrata.support.transno.GetTransNo;

public class OfficeDao implements OfficeService {
	String userupd;
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;

	public OfficeDao() {
		// TODO Auto-generated constructor stub
		session = HibernateHelper.getSessionFactory().openSession();
		pagesize = HibernateHelper.getPagesize();
		strStatement = " from Office ";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.adibrata.smartdealer.service.setting.Office#Paging(int,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public List<Office> Paging(int CurrentPage, String WhereCond, String SortBy) {
		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<Office> list = null;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.adibrata.smartdealer.service.setting.Office#TotalRecord(java.lang
	 * .String)
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.adibrata.smartdealer.service.setting.OfficeService#SaveAdd(com.adibrata
	 * .smartdealer.model.Office)
	 */
	@Override
	public void SaveAdd(Office office) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			office.setDtmCrt(dtmupd.getTime());
			office.setDtmUpd(dtmupd.getTime());
			session.save(office);

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
	 * com.adibrata.smartdealer.service.setting.OfficeService#SaveEdit(com.adibrata
	 * .smartdealer.model.Office)
	 */
	@Override
	public void SaveEdit(Office office) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {

			office.setDtmUpd(dtmupd.getTime());
			session.update(office);

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
	 * com.adibrata.smartdealer.service.setting.OfficeService#Savedel(com
	 * .adibrata.smartdealer.model.Office)
	 */
	@Override
	public void Savedel(Office office) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {

			session.delete(office);

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
	public Office View(long id) {
		// TODO Auto-generated method stub
		Office office = null;
		try {
			office = (Office) session.get(Office.class, id);

		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return office;
	}

}
