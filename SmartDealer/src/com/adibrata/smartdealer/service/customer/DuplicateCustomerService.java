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
public interface DuplicateCustomerService {

	public List Paging(int CurrentPage, String WhereCond, String SortBy);
	public long TotalRecord(String WherCond);
	public List<Customer> View(long id);
	public List<Customer> SearchDuplicate (String name, String IdNo, String MotherName);
	
}
