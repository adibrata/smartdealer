/**
 * 
 */
package com.adibrata.smartdealer.service.othertransactions;

/**
 * @author Henry
 *
 */

import java.util.List;

import com.adibrata.smartdealer.model.*;

public interface OtherReceiveService {
	public void Save (OtherRcvHdr otherRcvHdr, OtherRcvDtl otherRcvDtl);
	public List Paging(int CurrentPage, String WhereCond, String SortBy);
	public double PurchaseInvoicePagingTotalRecord(String WherCond);
}
