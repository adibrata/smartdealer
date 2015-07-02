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

public interface CustomerMaintService {
	public void Save(Customer customer);
	
	public List<Customer>  Paging(int CurrentPage, String WhereCond, String SortBy);
	public long TotalRecord(String WherCond);
	public Customer View(long id);
}
