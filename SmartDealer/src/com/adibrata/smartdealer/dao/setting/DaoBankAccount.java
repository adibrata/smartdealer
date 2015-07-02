/**
 * 
 */
package com.adibrata.smartdealer.dao.setting;

/**
 * @author Henry
 *
 */
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.adibrata.smartdealer.model.Lecture;

import util.adibrata.framework.dataaccess.HibernateHelper;

public class DaoBankAccount {
	public static void main(String[] args) {
		Session session = HibernateHelper.getSessionFactory().openSession();
		Query query = session.createQuery("from Lecture  WHERE lastName like 'Bank%'");
		/*query.setParameter("lastname","B%");*/
		
		/*List<Lecture> results = query.list();
		for (Lecture namaVar : results) {
			System.out.println(namaVar.getID());
		    System.out.println(namaVar.getFirstName());
		}
		
		session.beginTransaction();
		try{
		Lecture stock = new Lecture();

		stock.setFirstName("BCA");
		stock.setLastName("BANK CENTRAL ASIA");
		session.save(stock);

		stock.setID(4);
		session.del(stock);
		
		
	
		query.setFirstResult(1);
		query.setMaxResults(5);
		
		
		Query query = session.createQuery("insert into Stock(stock_code, stock_name)" +
    			"select stock_code, stock_name from backup_stock");
int result = query.executeUpdate();
		session.getTransaction().commit();
		}
		catch(Exception exp)
		{
			session.getTransaction().rollback();
		}
		*/
	}

}
