/**
 * 
 */
package com.adibrata.smartdealer.dao;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.hibernate.Query;
import org.hibernate.Session;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.transno.GetTransNo;

import com.adibrata.smartdealer.service.SeviceBase;

/**
 * @author Henry
 *
 */
public class DaoBase implements SeviceBase {
	String userupd;
	Session session;

	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	static Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;

	/**
	 * 
	 */
	public DaoBase() {
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

	public enum TransactionType {
		accountpayable, advancerequest, advancereturn, danatunai, 
		entrustout, entrustreceive, otherdisburse, otherreceive, paymentrequest, 
		paymentvoucher, pettycashcorretion, pettycashreimburse, pettycashtransaction, prepaidreceive, purchaseinvoice, purchaseorder, purchasereturn, 
		salesorder, salesorderreturn, service
	}

	public static String TransactionNo(Session session, TransactionType trans,
			String partnercode, long officeid) {
		String transno = "";

		switch (trans) {
		case accountpayable:
			transno = GetTransNo.GenerateTransactionNo(session, partnercode,
					officeid, "APD", dtmupd.getTime());
			break;
		case advancerequest:
			transno = GetTransNo.GenerateTransactionNo(session, partnercode,
					officeid, "ADV", dtmupd.getTime());
			break;
		case advancereturn:
			transno = GetTransNo.GenerateTransactionNo(session, partnercode,
					officeid, "ADR", dtmupd.getTime());
			break;
		case danatunai:
			transno = GetTransNo.GenerateTransactionNo(session, partnercode,
					officeid, "DTN", dtmupd.getTime());
			break;
		case entrustout:
			transno = GetTransNo.GenerateTransactionNo(session, partnercode,
					officeid, "ENTO", dtmupd.getTime());
			break;

		case entrustreceive:
			transno = GetTransNo.GenerateTransactionNo(session, partnercode,
					officeid, "ENTR", dtmupd.getTime());
			break;
		case otherdisburse:
			transno = GetTransNo.GenerateTransactionNo(session, partnercode,
					officeid, "OTD", dtmupd.getTime());
			break;

		case otherreceive:
			transno = GetTransNo.GenerateTransactionNo(session, partnercode,
					officeid, "OTR", dtmupd.getTime());
			break;
		case paymentrequest:
			transno = GetTransNo.GenerateTransactionNo(session, partnercode,
					officeid, "PYR", dtmupd.getTime());
			break;
		case paymentvoucher:
			transno = GetTransNo.GenerateTransactionNo(session, partnercode,
					officeid, "PVD", dtmupd.getTime());
			break;
		case pettycashcorretion:
			transno = GetTransNo.GenerateTransactionNo(session, partnercode,
					officeid, "PCO", dtmupd.getTime());
			break;
		case pettycashreimburse:
			transno = GetTransNo.GenerateTransactionNo(session, partnercode,
					officeid, "PCR", dtmupd.getTime());
			break;

		case pettycashtransaction:
			transno = GetTransNo.GenerateTransactionNo(session, partnercode,
					officeid, "PCT", dtmupd.getTime());
			break;
		case prepaidreceive:
			transno = GetTransNo.GenerateTransactionNo(session, partnercode,
					officeid, "PRV", dtmupd.getTime());
			break;
		case purchaseinvoice:
			transno = GetTransNo.GenerateTransactionNo(session, partnercode,
					officeid, "PRI", dtmupd.getTime());
			break;
		case purchaseorder:
			transno = GetTransNo.GenerateTransactionNo(session, partnercode,
					officeid, "PRO", dtmupd.getTime());
			break;
		case purchasereturn:
			transno = GetTransNo.GenerateTransactionNo(session, partnercode,
					officeid, "PRR", dtmupd.getTime());
			break;
		case salesorder:
			transno = GetTransNo.GenerateTransactionNo(session, partnercode,
					officeid, "SAO", dtmupd.getTime());
			break;
		case salesorderreturn:
			transno = GetTransNo.GenerateTransactionNo(session, partnercode,
					officeid, "SAR", dtmupd.getTime());
			break;
		case service:
			transno = GetTransNo.GenerateTransactionNo(session, partnercode,
					officeid, "SVC", dtmupd.getTime());
			break;
		default:
			break;
		}
		return transno;
	}
}
