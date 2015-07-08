/**
 * 
 */
package com.adibrata.smartdealer.dao.entrust;

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

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.transno.GetTransNo;

import com.adibrata.smartdealer.service.entrust.EntrustService;

public class EntrustTransactionsDao extends DaoBase implements EntrustService {
	String userupd;
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;

	public EntrustTransactionsDao() {
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
	 * @see com.adibrata.smartdealer.service.entrust.EntrustTransactions#Save()
	 */
	@Override
	public void Save(EntrustHdr entrustHdr, List<EntrustDtl> lstentrustDtl) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();

		try {
			String transno = GetTransNo.GenerateTransactionNo(session, entrustHdr
					.getPartner().getPartnerCode(), entrustHdr.getOffice()
					.getId(), "ENTO", dtmupd.getTime());
			entrustHdr.setEntrustNo(transno);
			entrustHdr.setDtmCrt(dtmupd.getTime());
			entrustHdr.setDtmUpd(dtmupd.getTime());
			session.save(entrustHdr);
			for (EntrustDtl arow : lstentrustDtl) {
				EntrustDtl entrustDtl = new EntrustDtl();
				entrustDtl = arow;
				entrustDtl.setEntrustHdr(entrustHdr);
				entrustDtl.setDtmCrt(dtmupd.getTime());
				entrustDtl.setDtmUpd(dtmupd.getTime());
				session.save(entrustDtl);
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
	 * @see
	 * com.adibrata.smartdealer.service.entrust.EntrustTransactions#Paging(int,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public List<Supplier> Paging(int CurrentPage, String WhereCond,
			String SortBy) {
		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<Supplier> list = null;
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
	public EntrustHdr viewEntrusHdr(long id) {
		// TODO Auto-generated method stub
		EntrustHdr entrustHdr = null;
		try {
			entrustHdr = (EntrustHdr) session.get(EntrustHdr.class, id);

		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return entrustHdr;
	}

	@Override
	public List<EntrustDtl> viewEntrusDtl(EntrustHdr entrustHdr) {
		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<EntrustDtl> list = null;
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

}
