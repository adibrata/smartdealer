/**
 * 
 */
package com.adibrata.smartdealer.service.setting;

import java.util.List;

import com.adibrata.smartdealer.model.*;
/**
 * @author Henry
 *
 */
public interface BankAccountService {
	public void SaveAdd(BankAccount bankAccount);
	public void SaveEdit(BankAccount bankAccount);
	public void SaveDel(BankAccount bankAccount);
	
	public List<BankAccount> Paging(int CurrentPage, String WhereCond, String SortBy);
	public List<BankAccount> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast);
	public long TotalRecord(String WherCond);
	public BankAccount View (long id);
}
