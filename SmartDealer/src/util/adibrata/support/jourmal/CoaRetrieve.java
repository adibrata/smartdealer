/**
 * 
 */
package util.adibrata.support.jourmal;

import util.adibrata.framework.dataaccess.HibernateHelper;
import org.hibernate.Session;

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
		session = HibernateHelper.getSessionFactory().openSession();
	}

	public enum CoaType
	{
		CoaSchm, CoaBank, CoaInsur, CoaFunding
	}
	
	public static String CoaCode(CoaType coatype, String coaname)
	{
		String coacode = "";
		switch (coatype) {
		case CoaSchm:
			break;
		case CoaBank:
			break;
		default:
			break;
		}
		return coacode;
	}
	
	private static String CoaCodeScheme()
	{
		return null;
		
	}
	
}
