/**
 * 
 */
package com.adibrata.smartdealer.dao.cashtransactions;

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
import com.adibrata.smartdealer.service.cashtransactions.PaymentRequestService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;
import util.adibrata.support.transno.GetTransNo;

public class PaymentRequestDao implements PaymentRequestService {
	String userupd;
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;

	public PaymentRequestDao() {

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
	 * com.adibrata.smartdealer.service.cashtransactions.PaymentRequestService
	 * #SavePaymentRequest(com.adibrata.smartdealer.model.PayReqHdr,
	 * com.adibrata.smartdealer.model.PayReqDtl)
	 */

	@Override
	public void SavePaymentRequest(PayReqHdr payReqHdr, PayReqDtl payReqDtl) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			payReqHdr.setDtmCrt(dtmupd.getTime());
			payReqHdr.setDtmUpd(dtmupd.getTime());
			payReqDtl.setDtmCrt(dtmupd.getTime());
			payReqDtl.setDtmUpd(dtmupd.getTime());
			session.save(payReqHdr);

			session.save(payReqDtl);
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
	 * com.adibrata.smartdealer.service.cashtransactions.PaymentRequestService
	 * #PurchaseInvoicePaging(int, java.lang.String, java.lang.String)
	 */
	@Override
	public List PurchaseInvoicePaging(int CurrentPage, String WhereCond,
			String SortBy) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.adibrata.smartdealer.service.cashtransactions.PaymentRequestService
	 * #PurchaseInvoicePagingTotalRecord(java.lang.String)
	 */
	@Override
	public double PurchaseInvoicePagingTotalRecord(String WherCond) {
		// TODO Auto-generated method stub
		return 0;
	}

}
