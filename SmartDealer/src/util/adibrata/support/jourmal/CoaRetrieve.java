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

	
}
