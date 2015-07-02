/**
 * 
 */
package util.adibrata.support.job;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.hibernate.Query;
import org.hibernate.Session;

import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.TransJob;
import com.adibrata.smartdealer.model.TrxConfigHdr;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.support.common.GetCoaScheme;
import util.adibrata.support.common.GetOffice;
import util.adibrata.support.transno.GetTransNo;

/**
 * @author Henry
 *
 */
public class JobPost {

	static Session session;

	public JobPost() {
		session = HibernateHelper.getSessionFactory().openSession();
	}

	public JobPost(Session session) {
		this.session = session;
	}

	public String JobSave(String partnercode, long officeid,
			String configcode, String coaSchemeCode, Date valueDate,
			Date postingDate, String transCodeNo, // code yang digenerate dari
													// transaksi seperti PONo
			long transId, String userCrt// identity dari transaksi, seperti POID
	) {

		TransJob transjob = new TransJob();
		Partner partner = new Partner();
		TrxConfigHdr trxconfighdr = new TrxConfigHdr();
	
		String jobcode = GetTransNo.GenerateTransactionNo(session,
				partnercode, officeid, "JOB", postingDate);
		Date dtmUpd = Calendar.getInstance().getTime();
		
		partner.setPartnerCode(partnercode);
		transjob.setPartner(partner);
		transjob.setOfficeId(officeid);
		transjob.setCoaSchmCode(coaSchemeCode);
		transjob.setJobCode(jobcode);
		
		transjob.setJobDate(valueDate);
		transjob.setJobPost(postingDate);
		transjob.setTrxId(transId);
		transjob.setTransCodeNo(transCodeNo);
		transjob.setJobStatus("NE");
		transjob.setUsrUpd(userCrt);
		transjob.setUsrCrt(userCrt);
		transjob.setTrxConfigCode(configcode);
		transjob.setDtmCrt(dtmUpd);
		transjob.setDtmUpd(dtmUpd);
	
		session.getTransaction().begin();
		try {
			session.save(transjob);
			session.getTransaction().commit();
		} catch (Exception exp) {
			session.getTransaction().rollback();
		}
		return jobcode;
	}
}
