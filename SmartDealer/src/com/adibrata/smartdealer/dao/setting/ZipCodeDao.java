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
import com.adibrata.smartdealer.service.setting.ZipCodeService;

public class ZipCodeDao implements ZipCodeService {
	Session session;
	String userupd;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;

	public ZipCodeDao() {
		// TODO Auto-generated constructor stub
		try {
			session = HibernateHelper.getSessionFactory().openSession();
			pagesize = HibernateHelper.getPagesize();
			strStatement = " from ZipCode ";

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
	 * com.adibrata.smartdealer.service.setting.ZipCodeService#SaveAdd(com.adibrata
	 * .smartdealer.model.ZipCode)
	 */
	@Override
	public void SaveAdd(ZipCode zipcode) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			zipcode.setDtmCrt(dtmupd.getTime());
			zipcode.setDtmUpd(dtmupd.getTime());
			session.save(zipcode);

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
	 * com.adibrata.smartdealer.service.setting.ZipCodeService#SaveEdit(com.
	 * adibrata.smartdealer.model.ZipCode)
	 */
	@Override
	public void SaveEdit(ZipCode zipcode) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			zipcode.setDtmCrt(dtmupd.getTime());
			zipcode.setDtmUpd(dtmupd.getTime());
			session.update(zipcode);

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
	 * com.adibrata.smartdealer.service.setting.ZipCodeService#SaveDel(com.adibrata
	 * .smartdealer.model.ZipCode)
	 */
	@Override
	public void SaveDel(ZipCode zipcode) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {

			session.delete(zipcode);

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
	 * @see com.adibrata.smartdealer.service.setting.ZipCodeService#Paging(int,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public List<ZipCode> Paging(int CurrentPage, String WhereCond, String SortBy) {
		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<ZipCode> list = null;
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
	 * com.adibrata.smartdealer.service.setting.ZipCodeService#TotalRecord(java
	 * .lang.String)
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
	public ZipCode View(long id) {
		// TODO Auto-generated method stub
		ZipCode zipCode = null;
		try {
			zipCode = (ZipCode) session.get(ZipCode.class, id);

		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return zipCode;
	}

	@Override
	public List<ZipCode> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) {
		// TODO Auto-generated method stub
				StringBuilder hql = new StringBuilder();
				List<ZipCode> list = null;
				try {
					hql.append(strStatement);
					if (WhereCond != "") {
						hql.append(" where ");
						hql.append(WhereCond);
					}

					Query selectQuery = session.createQuery(hql.toString());
					long totalrecord = TotalRecord (WhereCond);
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
