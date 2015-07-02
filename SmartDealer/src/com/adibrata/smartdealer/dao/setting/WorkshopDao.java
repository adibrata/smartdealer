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

import org.hibernate.Query;
import org.hibernate.Session;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.setting.WorkshopService;
public class WorkshopDao implements WorkshopService{
	String userupd; 
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;
	public WorkshopDao() {
		// TODO Auto-generated constructor stub
		session = HibernateHelper.getSessionFactory().openSession();
	}
	/* (non-Javadoc)
	 * @see com.adibrata.smartdealer.service.setting.WorkshopService#SaveAdd(com.adibrata.smartdealer.model.Workshop)
	 */
	@Override
	public void SaveAdd(Workshop workshop) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			workshop.setDtmCrt(dtmupd.getTime());
			workshop.setDtmUpd(dtmupd.getTime());
			session.save(workshop);
			
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
	 * @see com.adibrata.smartdealer.service.setting.WorkshopService#SaveEdit(com.adibrata.smartdealer.model.Workshop)
	 */
	@Override
	public void SaveEdit(Workshop workshop) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			workshop.setDtmCrt(dtmupd.getTime());
			workshop.setDtmUpd(dtmupd.getTime());
			session.update(workshop);
			
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
	 * @see com.adibrata.smartdealer.service.setting.WorkshopService#Savedel(com.adibrata.smartdealer.model.Workshop)
	 */
	@Override
	public void Savedel(Workshop workshop) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			
			session.del(workshop);
			
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
	 * @see com.adibrata.smartdealer.service.setting.WorkshopService#Paging(int, java.lang.String, java.lang.String)
	 */
	@Override
	public List<Workshop> Paging(int CurrentPage, String WhereCond, String SortBy) {
		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<Workshop> list = null;
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
	 * @see com.adibrata.smartdealer.service.setting.WorkshopService#TotalRecord(java.lang.String)
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
	public Workshop View(long id) {
		// TODO Auto-generated method stub
		Workshop workshop = null;
		try {
			workshop =  (Workshop) session.get(Workshop.class, id);
			
		} catch (Exception exp) {
			
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return workshop;
	}

}
