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
public interface DealerService  extends SeviceBase {

	public void SaveAdd(Supplier supplier);

	public void SaveEdit(Supplier supplier);

	public void SaveDel(Supplier supplier);

	public List<Supplier> Paging(int CurrentPage, String WhereCond,
			String SortBy);

	public List<Supplier> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast);

	public Supplier View(long id);
}
