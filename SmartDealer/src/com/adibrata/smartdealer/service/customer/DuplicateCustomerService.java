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
import com.adibrata.smartdealer.service.SeviceBase;
public interface DuplicateCustomerService  extends SeviceBase {

	public List Paging(int CurrentPage, String WhereCond, String SortBy);
	
	public List<Customer> View(long id);
	public List<Customer> SearchDuplicate (String name, String IdNo, String MotherName);
	
}
