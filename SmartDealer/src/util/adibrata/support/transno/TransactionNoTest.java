package util.adibrata.support.transno;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.hibernate.Session;

import util.adibrata.framework.dataaccess.HibernateHelper;

public class TransactionNoTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Session session = HibernateHelper.getSessionFactory().openSession();
		GetTransNo a = new GetTransNo(session);

		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String strDate = "2012-12-26";
		Date trxdate = formatter.parse(strDate);
		try {
			session.getTransaction().begin();
			/* for(int x = 1; x < 2000; x = x+1) { */
			System.out.println(GetTransNo.GenerateTransactionNo(session, "001",
					(long)1, "PO", trxdate));
			session.getTransaction().commit();
	
			
		} catch (Exception e) {
			session.getTransaction().rollback();
			throw e;
		} finally {
			session.close();
		}
		/* } */
	}
}
