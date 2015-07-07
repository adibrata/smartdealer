/**
 * 
 */
package com.adibrata.smartdealer.dao.sales;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;
import util.adibrata.support.transno.GetTransNo;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.sales.*;

;
/**
 * @author Henry
 *
 */
public class SalesReturDao implements SalesReturnService {
	String userupd;
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;

	public SalesReturDao() {
		// TODO Auto-generated constructor stub
		try {
			session = HibernateHelper.getSessionFactory().openSession();
			pagesize = HibernateHelper.getPagesize();
			strStatement = " from SalesOrderHdr ";

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
	 * com.adibrata.smartdealer.service.sales.SalesReturn#TotalRecord(java.lang
	 * .String)
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
	public void Save(ReturSalesHdr returSalesHdr,
			List<ReturSalesDtl> lstreturSalesDtl) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			returSalesHdr.setDtmCrt(dtmupd.getTime());
			returSalesHdr.setDtmUpd(dtmupd.getTime());
			session.save(returSalesHdr);
			for (ReturSalesDtl arow : lstreturSalesDtl) {
				ReturSalesDtl  returSalesDtl = new ReturSalesDtl();
				returSalesDtl = arow;
				returSalesDtl.setDtmCrt(dtmupd.getTime());
				returSalesDtl.setDtmUpd(dtmupd.getTime());
				session.save(returSalesDtl);
			}
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
	public List<ReturSalesHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy) {
		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<ReturSalesHdr> list = null;
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



	@Override
	public List<ReturSalesHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) {
		// TODO Auto-generated method stub
				StringBuilder hql = new StringBuilder();
				List<ReturSalesHdr> list = null;

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
