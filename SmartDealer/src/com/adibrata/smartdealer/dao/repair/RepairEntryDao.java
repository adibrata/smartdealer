/**
 * 
 */
package com.adibrata.smartdealer.dao.repair;

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

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.purchase.*;
import com.adibrata.smartdealer.service.repair.RepairService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;
import util.adibrata.support.transno.GetTransNo;

public class RepairEntryDao  extends DaoBase implements RepairService {

	/**
	 * 
	 */
	String userupd;
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;

	public RepairEntryDao() {
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
	public void Save(ServiceHdr serviceHdr, List<ServiceDtl> lstserviceDtls) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			serviceHdr.setDtmCrt(dtmupd.getTime());
			serviceHdr.setDtmUpd(dtmupd.getTime());
			session.save(serviceHdr);
			for (ServiceDtl arow : lstserviceDtls) {
				ServiceDtl returSalesDtl = new ServiceDtl();
				returSalesDtl = arow;
				returSalesDtl.setDtmCrt(dtmupd.getTime());
				returSalesDtl.setDtmUpd(dtmupd.getTime());
				session.save(returSalesDtl);
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

	@Override
	public List Paging(int CurrentPage, String WhereCond, String SortBy) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ServiceHdr View(long id) {
		// TODO Auto-generated method stub
		ServiceHdr serviceHdr = null;
		try {
			serviceHdr = (ServiceHdr) session.get(ServiceHdr.class, id);

		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return serviceHdr;
	}

	@Override
	public List<Workshop> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) {
		/// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<Workshop> list = null;

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
