/**
 * 
 */
package com.adibrata.smartdealer.dao.sales;

import java.util.List;

import util.adibrata.framework.dataaccess.HibernateHelper;

import com.adibrata.smartdealer.service.sales.SalesInvoiceService;

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


/**
 * @author Henry
 *
 */
public class SelesInvoiceDao implements SalesInvoiceService {

	/**
	 * 
	 */
	String userupd; 
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	
	public SelesInvoiceDao() {
		// TODO Auto-generated constructor stub
		session = HibernateHelper.getSessionFactory().openSession();
	}

	@Override
	public void Save() {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			/*returSalesHdr.setDtmCrt(dtmupd.getTime());
			returSalesHdr.setDtmUpd(dtmupd.getTime());
			returSalesDtl .setDtmCrt(dtmupd.getTime());
			returSalesDtl.setDtmUpd(dtmupd.getTime());
			session.save(returSalesHdr);
			session.save(returSalesDtl);	*/
			session.getTransaction().commit();

		} catch (Exception exp) {
			session.getTransaction().rollback();
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
	}

	@Override
	public List Paging(int CurrentPage, String WhereCond, String SortBy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long TotalRecord(String WherCond) {
		// TODO Auto-generated method stub
		return 0;
	}

}
