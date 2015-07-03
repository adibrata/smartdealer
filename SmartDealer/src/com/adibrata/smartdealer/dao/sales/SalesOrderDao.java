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
public class SalesOrderDao implements SalesOrderService {
	String userupd;
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;

	public SalesOrderDao() {
		// TODO Auto-generated constructor stub
		try {
			session = HibernateHelper.getSessionFactory().openSession();
			pagesize = HibernateHelper.getPagesize();
			strStatement = " from Customer ";

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
	 * @see com.adibrata.smartdealer.service.sales.SalesTransactions#Save()
	 */
	@Override
	public void Save(SalesOrderHdr salesOrderHdr,
			List<SalesOrderDtl> lstsalesOrderDtl) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		String transno = "";
		try {
			transno = GetTransNo.GenerateTransactionNo(session, salesOrderHdr
					.getPartner().getPartnerCode(), salesOrderHdr.getOffice()
					.getId(), "SOR", dtmupd.getTime());
			salesOrderHdr.setSono(transno);
			salesOrderHdr.setDtmCrt(dtmupd.getTime());
			salesOrderHdr.setDtmUpd(dtmupd.getTime());
			session.save(salesOrderHdr);
			for (SalesOrderDtl arow : lstsalesOrderDtl) {
				SalesOrderDtl salesOrderDtl = new SalesOrderDtl();
				salesOrderDtl = arow;
				salesOrderDtl.setDtmCrt(dtmupd.getTime());
				salesOrderDtl.setDtmUpd(dtmupd.getTime());
				session.save(salesOrderDtl);
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.adibrata.smartdealer.service.sales.SalesTransactions#Paging(int,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public List<Customer> Paging(int CurrentPage, String WhereCond,
			String SortBy) {
		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<Customer> list = null;
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
	 * com.adibrata.smartdealer.service.sales.SalesTransactions#TotalRecord(
	 * java.lang.String)
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
	public SalesOrderHdr viewSalesOrderHdr(long id) {
		// TODO Auto-generated method stub
		SalesOrderHdr salesOrderHdr = null;
		try {
			salesOrderHdr = (SalesOrderHdr) session
					.get(SalesOrderHdr.class, id);

		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return salesOrderHdr;
	}

	@Override
	public Customer viewCustomer(long id) {
		// TODO Auto-generated method stub
		Customer customer = null;
		try {
			customer = (Customer) session.get(Customer.class, id);

		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return customer;
	}

	@Override
	public List<SalesOrderDtl> viewSalesOrderDtls(SalesOrderHdr salesOrderHdr) {
		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<SalesOrderDtl> list = null;
		try {
			hql.append(strStatement);
			Query selectQuery = session.createQuery(hql.toString());

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
