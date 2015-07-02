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
import com.adibrata.smartdealer.service.setting.AssetMasterService;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;
import util.adibrata.support.transno.GetTransNo;
public class AssetMasterDao implements AssetMasterService{
	String userupd; 
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;
	
	public AssetMasterDao() {
		// TODO Auto-generated constructor stub
		session = HibernateHelper.getSessionFactory().openSession();

	}

	/* (non-Javadoc)
	 * @see com.adibrata.smartdealer.service.setting.AssetMaster#Save(com.adibrata.smartdealer.service.setting.AssetMaster)
	 */
	

	/* (non-Javadoc)
	 * @see com.adibrata.smartdealer.service.setting.AssetMaster#Paging(int, java.lang.String, java.lang.String)
	 */
	@Override
	public List<AssetMaster> Paging(int CurrentPage, String WhereCond, String SortBy) {
		// TODO Auto-generated method stub
		StringBuilder hql = new StringBuilder();
		List<AssetMaster> list = null;
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

	/* (non-Javadoc)
	 * @see com.adibrata.smartdealer.service.setting.AssetMaster#TotalRecord(java.lang.String)
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

	/* (non-Javadoc)
	 * @see com.adibrata.smartdealer.service.setting.AssetMaster#SaveAdd(com.adibrata.smartdealer.service.setting.AssetMaster)
	 */
	@Override
	public void SaveAdd(AssetMaster assetMaster) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			assetMaster.setDtmCrt(dtmupd.getTime());
			assetMaster.setDtmUpd(dtmupd.getTime());
			session.save(assetMaster);
			
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
	 * @see com.adibrata.smartdealer.service.setting.AssetMaster#SaveEdit(com.adibrata.smartdealer.service.setting.AssetMaster)
	 */
	@Override
	public void SaveEdit(AssetMaster assetMaster) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			
			assetMaster.setDtmUpd(dtmupd.getTime());
			session.update(assetMaster);
			
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
	 * @see com.adibrata.smartdealer.service.setting.AssetMaster#Savedel(com.adibrata.smartdealer.service.setting.AssetMaster)
	 */
	@Override
	public void Savedel(AssetMaster assetMaster) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {

			session.delete(assetMaster);
			
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
	public AssetMaster View(long id) {
		// TODO Auto-generated method stub
		AssetMaster assetmaster = null;
		try {
			assetmaster =  (AssetMaster) session.get(AssetMaster.class, id);
			
		} catch (Exception exp) {
			
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1].getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return assetmaster;
	}

}
