/**
 * 
 */
package com.adibrata.smartdealer.service.setting;

import java.util.List;



import com.adibrata.smartdealer.model.BankAccount;
import com.adibrata.smartdealer.model.Supplier;

/**
 * @author Henry
 *
 */
public interface DealerService {

	public void SaveAdd(Supplier supplier);
	public void SaveEdit(Supplier supplier);
	public void SaveDel(Supplier supplier);
	
	public List<Supplier> Paging(int CurrentPage, String WhereCond, String SortBy);
	public List<Supplier> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast);
	public long TotalRecord(String WherCond);
	
	public Supplier View(long id);
}
