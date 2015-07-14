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
	 * @throws Exception 
	 * 
	 */
	public DaoBase() throws Exception {
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
	public long TotalRecord(String WherCond) throws Exception {
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
		accountpayable("APD"), advancerequest("ADV"), advancereturn("ADR"), danatunai(
				"DTN"), entrustout("ENTO"), entrustreceive("ENTR"), otherdisburse(
				"OTD"), otherreceive("OTR"), paymentrequest("PYR"), paymentvoucher(
				"PVD"), pettycashcorretion("PCO"), pettycashreimburse("PCR"), pettycashtransaction(
				"PCT"), prepaidreceive("PRV"), purchaseinvoice("PRI"), purchaseorder(
				"PRO"), purchasereturn("PRR"), salesorder("SAO"), salesorderreturn(
				"SAR"), service("SVC");

		private String transactiontype;

		private TransactionType(String s) {
			transactiontype = s;
		}

		public String getTransactionType() {
			return transactiontype;
		}
	}

	public static String TransactionNo(Session session, TransactionType trans,
			String partnercode, long officeid) throws Exception {
		String transno = "";
		transno = GetTransNo.GenerateTransactionNo(session, partnercode,
				officeid, trans.getTransactionType(), dtmupd.getTime());
		return transno;
	}

}
