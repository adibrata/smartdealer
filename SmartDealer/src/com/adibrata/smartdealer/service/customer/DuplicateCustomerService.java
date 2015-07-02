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
	public List<Object[]> View(long id);
	public List<Object[]> SearchDuplicate (String name, String IdNo, String MotherName);
	
}
