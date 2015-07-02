/**
 * 
 */
package com.adibrata.smartdealer.service.cashtransactions;

import java.util.List;

import com.adibrata.smartdealer.model.*;
/**
 * @author Henry
 *
 */
public interface AdvanceCashService {
	public void Save (AdvanceCash advancecash);
	public List<Object[]>  Paging(int CurrentPage, String WhereCond, String SortBy);
	public double PurchaseInvoicePagingTotalRecord(String WherCond);
	public List<Object[]> View(long id);
}
