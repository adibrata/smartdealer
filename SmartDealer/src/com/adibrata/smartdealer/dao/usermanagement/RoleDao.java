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
import com.adibrata.smartdealer.service.usermanagement.RoleService;

public class RoleDao implements RoleService {
	String userupd;
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;

	public RoleDao() {
		// TODO Auto-generated constructor stub
		try {
			session = HibernateHelper.getSessionFactory().openSession();
			pagesize = HibernateHelper.getPagesize();
			strStatement = " from MsRole ";

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
	 * com.adibrata.smartdealer.service.usermanagement.RoleService#SaveAdd(com
	 * .adibrata.smartdealer.model.MsRole)
	 */
	@Override
	public void SaveAdd(MsRole msRole) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			msRole.setDtmCrt(dtmupd.getTime());
			msRole.setDtmUpd(dtmupd.getTime());
			session.save(msRole);

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
	 * com.adibrata.smartdealer.service.usermanagement.RoleService#SaveEdit(
	 * com.adibrata.smartdealer.model.MsRole)
	 */
	@Override
	public void SaveEdit(MsRole msRole) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {

			msRole.setDtmUpd(dtmupd.getTime());
			session.update(msRole);

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
	 * com.adibrata.smartdealer.service.usermanagement.RoleService#SaveDel(com
	 * .adibrata.smartdealer.model.MsRole)
	 */
	@Override
	public void SaveDel(MsRole msRole) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {

			session.delete(msRole);

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
	 * com.adibrata.smartdealer.service.usermanagement.RoleService#Paging(int,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public List<MsRole> Paging(int CurrentPage, String WhereCond, String SortBy) {
		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<MsRole> list = null;
		try {
			hql.append(strStatement);
			if (WhereCond != "") {
				hql.append(" where ");
				hql.append(WhereCond);
			}

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
	 * com.adibrata.smartdealer.service.usermanagement.RoleService#TotalRecord
	 * (java.lang.String)
	 */
	@Override
	public long TotalRecord(String WherCond) {
		// TODO Auto-generated method stub
		long countResults = 0;
		try {
			String countQ = "Select count (id) " + strStatement;
			if (WherCond != "") {
				hql.append(" where ");
				hql.append(WherCond);
			}
			countQ = countQ + hql.toString();
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
	public MsRole View(long Id) {
		// TODO Auto-generated method stub
		MsRole msRole = null;
		try {
			msRole = (MsRole) session.get(MsRole.class, Id);

		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return msRole;
	}

	@Override
	public List<MsRole> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) {
		// TODO Auto-generated method stub
				StringBuilder hql = new StringBuilder();
				List<MsRole> list = null;
				try {
					hql.append(strStatement);
					if (WhereCond != "") {
						hql.append(" where ");
						hql.append(WhereCond);
					}

					Query selectQuery = session.createQuery(hql.toString());
					long totalrecord = TotalRecord(WhereCond);
					selectQuery.setFirstResult((int) ((totalrecord - 1) * pagesize));
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

}
