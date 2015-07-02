/**
 * 
 */
package com.adibrata.smartdealer.service.accpay;

import java.util.List;

import com.adibrata.smartdealer.model.*;

/**
 * @author Henry
 *
 */

public interface SelectionService {
	public void Save(AccountPayable accountPayable);

	public List<AccountPayable> Paging(int CurrentPage, String WhereCond, String SortBy);

	public AccountPayable View(long id);

	public long TotalRecord(String WherCond);
}
