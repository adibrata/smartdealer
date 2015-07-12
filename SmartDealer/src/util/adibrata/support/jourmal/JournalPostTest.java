package util.adibrata.support.jourmal;



import org.hibernate.Session;

import util.adibrata.framework.dataaccess.HibernateHelper;

import com.adibrata.smartdealer.model.Office;
import com.adibrata.smartdealer.model.Partner;
import com.adibrata.smartdealer.model.TransJob;
import com.adibrata.smartdealer.model.TrxConfigDtl;
import com.adibrata.smartdealer.model.TrxConfigHdr;

public class JournalPostTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Session session;
		TransJob transjob = new TransJob();
		TrxConfigHdr trxConfigHdr = new TrxConfigHdr();
		TrxConfigDtl trxConfigDtl = new TrxConfigDtl();
		session = HibernateHelper.getSessionFactory().openSession();
		Office office = new Office();
		Partner partner = new Partner();
		partner.setPartnerCode("001");
		transjob.setTrxConfigCode("PRO");
		JournalPosting jp = new JournalPosting("Henry");
		/*System.out.print(CoaRetrieve.CoaCode(session, "001", "CoaMaster", "INSTALLRCV"));*/
		jp.JobPost();
	//	jp.GetConfHdrDtl(session, transjob, office, partner);
		
		
	}

}
