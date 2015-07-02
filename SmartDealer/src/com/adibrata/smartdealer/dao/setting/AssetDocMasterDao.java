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
import com.adibrata.smartdealer.service.setting.AssetDocMasterService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;
import util.adibrata.support.transno.GetTransNo;

public class AssetDocMasterDao implements AssetDocMasterService {
	String userupd;
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;
	
	public AssetDocMasterDao() {
		// TODO Auto-generated constructor stub
		session = HibernateHelper.getSessionFactory().openSession();
		
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.adibrata.smartdealer.service.setting.AssetDocument#Paging(int,
	 * java.lang.String, java.lang.String)
	 */
	@Override
	public List<AssetDocMaster> Paging(int CurrentPage, String WhereCond, String SortBy) {
		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<AssetDocMaster> list = null;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.adibrata.smartdealer.service.setting.AssetDocument#TotalRecord(java
	 * .lang.String)
	 */
	@Override
	public long TotalRecord(String WherCond) {
		// TODO Auto-generated method stub
		long countResults = 0 ;
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.adibrata.smartdealer.service.setting.AssetDocument#SaveAdd(com.adibrata
	 * .smartdealer.service.setting.AssetDocument)
	 */
	@Override
	public void SaveAdd(AssetDocMaster assetDocMaster) {
		// TODO Auto-generated method stub
		
		session.getTransaction().begin();
		try {
			assetDocMaster.setDtmCrt(dtmupd.getTime());
			assetDocMaster.setDtmUpd(dtmupd.getTime());
			session.save(assetDocMaster);

			session.getTransaction().commit();

		} catch (Exception exp) {
			session.getTransaction().rollback();
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.adibrata.smartdealer.service.setting.AssetDocument#SaveEdit(com.adibrata
	 * .smartdealer.service.setting.AssetDocument)
	 */
	@Override
	public void SaveEdit(AssetDocMaster assetDocMaster) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			
			assetDocMaster.setDtmUpd(dtmupd.getTime());
			session.update(assetDocMaster);

			session.getTransaction().commit();

		} catch (Exception exp) {
			session.getTransaction().rollback();
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.adibrata.smartdealer.service.setting.AssetDocument#Savedel(com
	 * .adibrata.smartdealer.service.setting.AssetDocument)
	 */
	@Override
	public void Savedel(AssetDocMaster assetDocMaster) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {

			session.delete(assetDocMaster);
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
	public AssetDocMaster View(long id) {
		AssetDocMaster assetDocMaster = null;
		try {
			assetDocMaster =  (AssetDocMaster) session.get(AssetDocMaster.class, id);
			
		} catch (Exception exp) {
			
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return assetDocMaster;
	}

}
