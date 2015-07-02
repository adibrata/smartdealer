/**
 * 
 */
package com.adibrata.smartdealer.dao.customer;

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
import util.adibrata.support.common.*;
import util.adibrata.support.transno.GetTransNo;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.customer.*;

public class CustomerDao implements CustomerMaintService {
	String userupd;
	Session session;

	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;

	public CustomerDao() {

		// TODO Auto-generated constructor stub
		try {
			session = HibernateHelper.getSessionFactory().openSession();
			pagesize = HibernateHelper.getPagesize();
			strStatement = " from Office ";

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
	 * com.adibrata.smartdealer.service.customer.CustomerMaintenance#Save(com
	 * .adibrata.smartdealer.model.Customer)
	 */
	@Override
	public void Save(Customer customer) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			customer.setDtmCrt(dtmupd.getTime());
			customer.setDtmUpd(dtmupd.getTime());
			session.save(customer);

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
	 * com.adibrata.smartdealer.service.customer.CustomerMaintenance#Paging(int,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public List<Customer> Paging(int CurrentPage, String WhereCond,
			String SortBy) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.adibrata.smartdealer.service.customer.CustomerMaintenance#TotalRecord
	 * (java.lang.String)
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
	public Customer View(long id) {
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

}
