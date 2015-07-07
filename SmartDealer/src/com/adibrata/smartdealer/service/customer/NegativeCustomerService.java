/**
 * 
 */
package com.adibrata.smartdealer.service.customer;

import java.util.List;




/**
 * @author Henry
 *
 */
import com.adibrata.smartdealer.model.*;

public interface NegativeCustomerService {
	public void Save(Customer customer);

	public List<Customer>  Paging(int CurrentPage, String WhereCond, String SortBy);
	public List<Customer> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast);
	public long TotalRecord(String WherCond);
	public List<Object[]> View(long id);
}
