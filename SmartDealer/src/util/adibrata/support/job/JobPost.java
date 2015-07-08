/**
 * 
 */
package util.adibrata.support.job;

import java.text.DateFormat;
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
	private static DateFormat dateFormat = new SimpleDateFormat(
			"yyyy/MM/dd HH:mm:ss");
	private static Calendar dtmupd = Calendar.getInstance();
	static Session session;

	public JobPost() {
		session = HibernateHelper.getSessionFactory().openSession();
	}

	public JobPost(Session session) {
		this.session = session;
	}

	public enum JobCode {
		accountpayable("APD"), advancerequest("ADV"), advancereturn("ADR"), danatunai(
				"DTN"), entrustout("ENTO"), entrustreceive("ENTR"), otherdisburse(
				"OTD"), otherreceive("OTR"), paymentrequest("PYR"), paymentvoucher(
				"PVD"), pettycashcorretion("PCO"), pettycashreimburse("PCR"), pettycashtransaction(
				"PCT"), prepaidreceive("PRV"), purchaseinvoice("PRI"), purchaseorder(
				"PRO"), purchasereturn("PRR"), salesorder("SAO"), salesorderreturn(
				"SAR"), service("SVC");

		private String statusCode;

		private JobCode(String s) {
			statusCode = s;
		}

		public String getJobCode() {
			return statusCode;
		}

	}

	public static TransJob JobSave(Session session, String partnercode,
			long officeid, JobCode jobcode, String coaSchemeCode,
			Date valueDate, Date postingDate, String userCrt) {

		TransJob transjob = new TransJob();
		Partner partner = new Partner();
		TrxConfigHdr trxconfighdr = new TrxConfigHdr();

		String transno = GetTransNo.GenerateTransactionNo(session, partnercode,
				officeid, "JOB", postingDate);

		partner.setPartnerCode(partnercode);
		transjob.setPartner(partner);
		transjob.setOfficeId(officeid);

		transjob.setJobNo(transno);
		transjob.setCoaSchmCode(coaSchemeCode);
		transjob.setJobDate(valueDate);
		transjob.setJobPost(postingDate);

		transjob.setJobStatus("NE");
		transjob.setUsrUpd(userCrt);
		transjob.setUsrCrt(userCrt);
		transjob.setTrxConfigCode(jobcode.getJobCode());
		transjob.setDtmCrt(dtmupd.getTime());
		transjob.setDtmUpd(dtmupd.getTime());

		session.getTransaction().begin();
		try {
			session.save(transjob);
			session.getTransaction().commit();
		} catch (Exception exp) {
			session.getTransaction().rollback();
		}
		return transjob;
	}
}
