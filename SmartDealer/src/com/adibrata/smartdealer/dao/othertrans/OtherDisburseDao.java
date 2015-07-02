/**
 * 
 */
package com.adibrata.smartdealer.dao.othertrans;

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

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;
import util.adibrata.support.transno.GetTransNo;

import com.adibrata.smartdealer.service.othertransactions.*;

public class OtherDisburseDao implements OtherDisburseService {
	String userupd;
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;

	public OtherDisburseDao() {
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
	 * com.adibrata.smartdealer.service.othertransactions.OtherDisburse#Save
	 * (com.adibrata.smartdealer.model.OtherDsbHdr,
	 * com.adibrata.smartdealer.model.OtherDsbDtl)
	 */
	@Override
	public void Save(OtherDsbHdr otherDsbHdr, OtherDsbDtl otherDsbDtl) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			otherDsbHdr.setDtmCrt(dtmupd.getTime());
			otherDsbHdr.setDtmUpd(dtmupd.getTime());
			otherDsbDtl.setDtmCrt(dtmupd.getTime());
			otherDsbDtl.setDtmUpd(dtmupd.getTime());
			session.save(otherDsbHdr);
			session.save(otherDsbDtl);

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
	 * com.adibrata.smartdealer.service.othertransactions.OtherDisburse#Paging
	 * (int, java.lang.String, java.lang.String)
	 */
	@Override
	public List Paging(int CurrentPage, String WhereCond, String SortBy) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.adibrata.smartdealer.service.othertransactions.OtherDisburse#
	 * PurchaseInvoicePagingTotalRecord(java.lang.String)
	 */
	@Override
	public double PurchaseInvoicePagingTotalRecord(String WherCond) {
		// TODO Auto-generated method stub
		return 0;
	}

}
