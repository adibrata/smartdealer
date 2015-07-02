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

	public SalesOrderDao() {
		// TODO Auto-generated constructor stub
		session = HibernateHelper.getSessionFactory().openSession();
		this.userupd = userupd;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.adibrata.smartdealer.service.sales.SalesTransactions#Save()
	 */
	@Override
	public void Save(SalesOrderHdr salesOrderHdr, SalesOrderDtl salesOrderDtl) {
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
			salesOrderDtl.setDtmCrt(dtmupd.getTime());
			salesOrderDtl.setDtmUpd(dtmupd.getTime());
			session.save(salesOrderHdr);
			session.save(salesOrderDtl);
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
	public List Paging(int CurrentPage, String WhereCond, String SortBy) {
		// TODO Auto-generated method stub
		return null;
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
		return 0;
	}

}
