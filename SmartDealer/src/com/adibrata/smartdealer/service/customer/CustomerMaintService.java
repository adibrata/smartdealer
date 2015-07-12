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

public interface CustomerMaintService extends SeviceBase {
	public void Save(String usrupd, Customer customer) throws Exception;

	public List<Customer> Paging(int CurrentPage, String WhereCond,
			String SortBy) throws Exception;

	public List<Customer> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) throws Exception;

	public Customer View(long id) throws Exception;
}
