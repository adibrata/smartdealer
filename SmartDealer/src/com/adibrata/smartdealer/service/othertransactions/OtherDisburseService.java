/**
 * 
 */
package com.adibrata.smartdealer.service.othertransactions;


import java.util.List;

import com.adibrata.smartdealer.model.*;

/**
 * @author Henry
 *
 */
public interface OtherDisburseService {
	public void Save (OtherDsbHdr otherDsbHdr, OtherDsbDtl otherDsbDtl);
	public List Paging(int CurrentPage, String WhereCond, String SortBy);
	public double PurchaseInvoicePagingTotalRecord(String WherCond);
}
