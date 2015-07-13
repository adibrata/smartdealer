/**
 * 
 */
package util.adibrata.support.jourmal;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;

import org.hibernate.Query;
import org.hibernate.Session;

import com.adibrata.smartdealer.model.Partner;

/**
 * @author Henry
 *
 */
public class CoaRetrieve {
	Session session;

	/**

	 * 
	 */
	public CoaRetrieve() {
		// TODO Auto-generated constructor stub

	}

	public enum CoaType {
		CoaSchm, CoaBank, CoaInsur, CoaFunding
	}

	public static String CoaCode(Session session, String partnercode,
			String coatype, String coaname) throws Exception {

		String coacode = "";
		switch (coatype.toLowerCase()) {
		case "coaschmhdr":
			break;
		case "coamaster":
			coacode = CoaCodeMaster(session, partnercode, coaname);
			break;
		case "coabank":
			break;
		default:
			break;
		}
		return coacode;
	}

	public static String CoaCode(Session session, String partnercode,
			String coatype, String Coaschm, String coaname) throws Exception {

		String coacode = "";
		try {
			switch (coatype) {
			case "CoaSchmHdr":
				break;
			case "CoaMaster":
				coacode = CoaCodeMaster(session, partnercode, coaname);
				break;
			case "CoaBank":
				break;
			default:
				break;
			}
		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return coacode;
	}

	private static String CoaCodeScheme() {
		return null;

	}

	private static String CoaCodeMaster(Session session, String partnercode,
			String coaname) throws Exception {
		String coacode = "";
		try {
			Query qrycoacode = session
					/*
					 * .createQuery(
					 * "Select a from  TrxSeqNo a inner join  Office b WITH " +
					 * " a.officeId = b.id " + "inner join " +
					 * " Partner c WITH a.partner = c.partnerCode and b.partner = c.partnerCode "
					 * );
					 */
					.createQuery(" Select coacode from  Coamaster "
							+ " Where partnercode = :partnercode and coaname = :coaname");
			qrycoacode.setParameter("partnercode", partnercode);
			qrycoacode.setParameter("coaname", coaname);

			coacode = (String) qrycoacode.uniqueResult();
		} catch (Exception exp) {

			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return coacode;

	}

}
