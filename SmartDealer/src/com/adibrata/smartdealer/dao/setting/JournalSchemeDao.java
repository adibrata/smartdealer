/**
 * 
 */
package com.adibrata.smartdealer.dao.setting;

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
import com.adibrata.smartdealer.service.setting.JournalSchemeService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;
import util.adibrata.support.transno.GetTransNo;

public class JournalSchemeDao implements JournalSchemeService {
	String userupd;
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;

	public JournalSchemeDao() {
		// TODO Auto-generated constructor stub
		try {
			session = HibernateHelper.getSessionFactory().openSession();
			pagesize = HibernateHelper.getPagesize();
			strStatement = " from CoaSchmHdr ";

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
	 * com.adibrata.smartdealer.service.setting.JournalScheme#SaveAdd(com.adibrata
	 * .smartdealer.service.setting.JournalScheme)
	 */
	@Override
	public void SaveAddHeader(CoaSchmHdr coaSchmHdr) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			coaSchmHdr.setDtmCrt(dtmupd.getTime());
			coaSchmHdr.setDtmUpd(dtmupd.getTime());
			session.save(coaSchmHdr);

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
	 * com.adibrata.smartdealer.service.setting.JournalScheme#SaveEdit(com.adibrata
	 * .smartdealer.service.setting.JournalScheme)
	 */
	@Override
	public void SaveEditHeader(CoaSchmHdr coaSchmHdr) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			coaSchmHdr.setDtmCrt(dtmupd.getTime());
			coaSchmHdr.setDtmUpd(dtmupd.getTime());
			session.update(coaSchmHdr);
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
	 * @see com.adibrata.smartdealer.service.setting.JournalScheme#SaveDel(com
	 * .adibrata.smartdealer.service.setting.JournalScheme)
	 */
	@Override
	public void SaveDelHeader(CoaSchmHdr coaSchmHdr) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			coaSchmHdr.setDtmCrt(dtmupd.getTime());
			coaSchmHdr.setDtmUpd(dtmupd.getTime());

			session.delete(coaSchmHdr);
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
	 * @see com.adibrata.smartdealer.service.setting.JournalScheme#Paging(int,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public List<CoaSchmHdr> PagingHeader(int CurrentPage, String WhereCond,
			String SortBy) {
		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<CoaSchmHdr> list = null;
		try {
			hql.append(strStatement);
			if (WhereCond != "") {
				hql.append(" where ");
				hql.append(WhereCond);
			}

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

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.adibrata.smartdealer.service.setting.JournalScheme#TotalRecord(java
	 * .lang.String)
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
	public CoaSchmHdr ViewHeader(long id) {
		// TODO Auto-generated method stub
		CoaSchmHdr coaSchmHdr = null;
		try {
			coaSchmHdr = (CoaSchmHdr) session.get(CoaSchmHdr.class, id);

		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return coaSchmHdr;
	}

	@Override
	public void SaveDetail(CoaSchmHdr coaSchmHdr, List<Coamaster> coamaster) {
		// TODO Auto-generated method stub
		try {
			for (Coamaster aRow : coamaster) {
				CoaSchmDtl coaschmdtl = new CoaSchmDtl();
				coaschmdtl.setCoacode(aRow.getCoacode());
				coaschmdtl.setCoaMasterId(aRow.getId());
				coaschmdtl.setCoaSchmHdr(coaSchmHdr);

				coaschmdtl.setUsrCrt(coaSchmHdr.getUsrCrt());
				coaschmdtl.setUsrUpd(coaSchmHdr.getUsrUpd());
				coaschmdtl.setDtmCrt(dtmupd.getTime());
				coaschmdtl.setDtmUpd(dtmupd.getTime());
				session.save(coaschmdtl);
				session.getTransaction().commit();
			}
		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
	}

	@Override
	public List<Coamaster> ListCoaMaster() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CoaSchmDtl> ViewDetail(CoaSchmHdr coaSchmHdr) {
		// TODO Auto-generated method stub
		return null;
	}

}
