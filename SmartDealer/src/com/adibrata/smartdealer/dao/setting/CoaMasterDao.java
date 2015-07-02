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

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.setting.COAMasterService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;
import util.adibrata.support.transno.GetTransNo;

public class CoaMasterDao implements COAMasterService {
	String userupd; 
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;
	public CoaMasterDao() {
		// TODO Auto-generated constructor stub
		session = HibernateHelper.getSessionFactory().openSession();
		this.userupd = userupd;
	}

	/* (non-Javadoc)
	 * @see com.adibrata.smartdealer.service.setting.COAMaster#Save(com.adibrata.smartdealer.model.Coamaster)
	 */


	/* (non-Javadoc)
	 * @see com.adibrata.smartdealer.service.setting.COAMaster#Paging(int, java.lang.String, java.lang.String)
	 */
	@Override
	public List<Coamaster> Paging(int CurrentPage, String WhereCond, String SortBy) {
		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<Coamaster> list = null;
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
	 * @see com.adibrata.smartdealer.service.setting.COAMaster#TotalRecord(java.lang.String)
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

	/* (non-Javadoc)
	 * @see com.adibrata.smartdealer.service.setting.COAMaster#SaveAdd(com.adibrata.smartdealer.model.Coamaster)
	 */
	@Override
	public void SaveAdd(Coamaster coamaster) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			coamaster.setDtmCrt(dtmupd.getTime());
			coamaster.setDtmUpd(dtmupd.getTime());
			session.save(coamaster);
					
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
	 * @see com.adibrata.smartdealer.service.setting.COAMaster#SaveEdit(com.adibrata.smartdealer.model.Coamaster)
	 */
	@Override
	public void SaveEdit(Coamaster coamaster) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			
			coamaster.setDtmUpd(dtmupd.getTime());
			session.update(coamaster);
					
			session.getTransaction().commit();

		} catch (Exception exp) {
			session.getTransaction().rollback();
		}
	}

	/* (non-Javadoc)
	 * @see com.adibrata.smartdealer.service.setting.COAMaster#Savedel(com.adibrata.smartdealer.model.Coamaster)
	 */
	@Override
	public void Savedel(Coamaster coamaster) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {

			session.del(coamaster);
					
			session.getTransaction().commit();

		} catch (Exception exp) {
			session.getTransaction().rollback();
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
	}

	@Override
	public Coamaster View(long id) {
		// TODO Auto-generated method stub
		Coamaster coamaster = null;
		try {
			coamaster =  (Coamaster) session.get(Coamaster.class, id);
			
		} catch (Exception exp) {
			
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return coamaster;
	}

}
