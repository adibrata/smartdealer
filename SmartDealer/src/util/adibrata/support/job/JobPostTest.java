/**
 * 
 */
package util.adibrata.support.job;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;

import util.adibrata.framework.dataaccess.HibernateHelper;

/**
 * @author Henry
 *
 */
public class JobPostTest {

	/**
	 * @param args
	 * @throws ParseException
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Session session = HibernateHelper.getSessionFactory().openSession();

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = "2012-12-26";
		Date trxdate = formatter.parse(strDate);
		JobPost a = new JobPost(session);
		a.JobSave("001", 1, "PO", "Default", trxdate, trxdate, "pt", 1,
				"Henry");
	}

}
