/**
 * 
 */
package com.adibrata.smartdealer.service.setting;

import java.util.List;

import com.adibrata.smartdealer.model.BankAccount;
import com.adibrata.smartdealer.model.Supplier;
import com.adibrata.smartdealer.service.SeviceBase;

/**
 * @author Henry
 *
 */
public interface DealerService extends SeviceBase {

	public void SaveAdd(Supplier supplier) throws Exception;

	public void SaveEdit(Supplier supplier) throws Exception;

	public void SaveDel(Supplier supplier) throws Exception;

	public List<Supplier> Paging(int CurrentPage, String WhereCond,
			String SortBy) throws Exception;

	public List<Supplier> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) throws Exception;

	public Supplier View(long id) throws Exception;
}
