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
import util.adibrata.support.job.JobPost;
import util.adibrata.support.transno.GetTransNo;

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.dao.DaoBase.TransactionType;
import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.sales.*;

;
/**
 * @author Henry
 *
 */
public class SalesOrderDao extends DaoBase implements SalesOrderService {
	String userupd;
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;

	public SalesOrderDao() throws Exception {
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
	 * @see com.adibrata.smartdealer.service.sales.SalesTransactions#Save()
	 */
	@Override
	public void Save(String usrupd, SalesOrderHdr salesOrderHdr,
			List<SalesOrderDtl> lstsalesOrderDtl) throws Exception {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		Partner partner = salesOrderHdr.getPartner();
		Office office = salesOrderHdr.getOffice();
		long jobid = 0;

		try {
			jobid = JobPost.JobSave(session, partner.getPartnerCode(), 
					office.getId(),
					JobPost.JobCode.salesorder, salesOrderHdr.getCoaSchmHdr().getCoaSchmCode(),
					salesOrderHdr.getValueDate(),
					salesOrderHdr.getPostingDate(), salesOrderHdr.getUsrCrt()).getId();

			salesOrderHdr.setJobId(jobid);
			String transno = TransactionNo(session, TransactionType.salesorder,
					partner.getPartnerCode(), office.getId());
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
			String SortBy) throws Exception {
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

	@Override
	public SalesOrderHdr viewSalesOrderHdr(long id) throws Exception {
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
	public Customer viewCustomer(long id) throws Exception {
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
	public List<SalesOrderDtl> viewSalesOrderDtls(SalesOrderHdr salesOrderHdr) throws Exception {
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

	@Override
	public List<Customer> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) throws Exception {
		// / TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<Customer> list = null;

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
