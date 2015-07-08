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

import com.adibrata.smartdealer.dao.DaoBase;
import com.adibrata.smartdealer.dao.DaoBase.TransactionType;
import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.othertransactions.*;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;
import util.adibrata.support.transno.GetTransNo;
public class OtherReceiveDao extends DaoBase implements OtherReceiveService{
	String userupd; 
	Session session;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Calendar dtmupd = Calendar.getInstance();
	String strStatement;
	StringBuilder hql = new StringBuilder();
	int pagesize;
	public OtherReceiveDao() {
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

	/* (non-Javadoc)
	 * @see com.adibrata.smartdealer.service.othertransactions.OtherReceive#Save(com.adibrata.smartdealer.model.OtherRcvHdr, com.adibrata.smartdealer.model.OtherRcvDtl)
	 */
	@Override
	public void Save(OtherRcvHdr otherRcvHdr, List<OtherRcvDtl> lstotherRcvDtl) {
		// TODO Auto-generated method stub
		session.getTransaction().begin();
		try {
			String transno = TransactionNo(session, TransactionType.otherreceive, otherRcvHdr
					.getPartner().getPartnerCode(), otherRcvHdr.getOffice()
					.getId());
			otherRcvHdr.setOtherRcvNo(transno);
			otherRcvHdr.setDtmCrt(dtmupd.getTime());
			otherRcvHdr.setDtmUpd(dtmupd.getTime());
			session.save(otherRcvHdr);
			for (OtherRcvDtl arow : lstotherRcvDtl) {
				OtherRcvDtl otherRcvDtl = new OtherRcvDtl();
				otherRcvDtl.setDtmCrt(dtmupd.getTime());
				otherRcvDtl.setDtmUpd(dtmupd.getTime());
				
				session.save(otherRcvDtl);	
			}
			
			
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
	public List<OtherRcvHdr> Paging(int CurrentPage, String WhereCond, String SortBy) {
		// TODO Auto-generated method stub
		return null;
	}

}
