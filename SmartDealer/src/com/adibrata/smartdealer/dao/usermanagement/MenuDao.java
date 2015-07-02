/**
 * 
 */
package com.adibrata.smartdealer.dao.usermanagement;

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
import com.adibrata.smartdealer.service.usermanagement.MenuService;
public class MenuDao  implements MenuService{
	String userupd; 
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;
	public MenuDao() {
		// TODO Auto-generated constructor stub
		session = HibernateHelper.getSessionFactory().openSession();
		
	}
	/* (non-Javadoc)
	 * @see com.adibrata.smartdealer.service.usermanagement.MenuService#SaveAdd(com.adibrata.smartdealer.model.MsMenu)
	 */
	@Override
	public void SaveAdd(MsMenu msMenu) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			msMenu.setDtmCrt(dtmupd.getTime());
			msMenu.setDtmUpd(dtmupd.getTime());
			session.save(msMenu);
					
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
	 * @see com.adibrata.smartdealer.service.usermanagement.MenuService#SaveEdit(com.adibrata.smartdealer.model.MsMenu)
	 */
	@Override
	public void SaveEdit(MsMenu msMenu) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			msMenu.setDtmCrt(dtmupd.getTime());
			msMenu.setDtmUpd(dtmupd.getTime());
			session.update(msMenu);
					
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
	 * @see com.adibrata.smartdealer.service.usermanagement.MenuService#Savedel(com.adibrata.smartdealer.model.MsMenu)
	 */
	@Override
	public void Savedel(MsMenu msMenu) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			session.del(msMenu);
					
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
	 * @see com.adibrata.smartdealer.service.usermanagement.MenuService#Paging(int, java.lang.String, java.lang.String)
	 */
	@Override
	public  List<MsMenu> Paging(int CurrentPage, String WhereCond, String SortBy) {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see com.adibrata.smartdealer.service.usermanagement.MenuService#TotalRecord(java.lang.String)
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
	public String MenuRender() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
