/**
 * 
 */
package com.adibrata.smartdealer.dao.OtherTransactions;

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
import com.adibrata.smartdealer.service.othertransactions.*;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;
import util.adibrata.support.transno.GetTransNo;
public class OtherReceiveDao implements OtherReceiveService{
	String userupd; 
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();

	public OtherReceiveDao() {
		// TODO Auto-generated constructor stub
		session = HibernateHelper.getSessionFactory().openSession();
		this.userupd = userupd;
	}

	/* (non-Javadoc)
	 * @see com.adibrata.smartdealer.service.othertransactions.OtherReceive#Save(com.adibrata.smartdealer.model.OtherRcvHdr, com.adibrata.smartdealer.model.OtherRcvDtl)
	 */
	@Override
	public void Save(OtherRcvHdr otherRcvHdr, OtherRcvDtl otherRcvDtl) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			otherRcvHdr.setDtmCrt(dtmupd.getTime());
			otherRcvHdr.setDtmUpd(dtmupd.getTime());
			otherRcvDtl .setDtmCrt(dtmupd.getTime());
			otherRcvDtl.setDtmUpd(dtmupd.getTime());
			session.save(otherRcvHdr);
			session.save(otherRcvDtl);
			
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
	 * @see com.adibrata.smartdealer.service.othertransactions.OtherReceive#Paging(int, java.lang.String, java.lang.String)
	 */
	@Override
	public List Paging(int CurrentPage, String WhereCond, String SortBy) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.adibrata.smartdealer.service.othertransactions.OtherReceive#PurchaseInvoicePagingTotalRecord(java.lang.String)
	 */
	@Override
	public double PurchaseInvoicePagingTotalRecord(String WherCond) {
		// TODO Auto-generated method stub
		return 0;
	}

}
