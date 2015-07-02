/**
 * 
 */
package com.adibrata.smartdealer.service.cashtransactions;

import java.util.List;

/**
 * @author Henry
 *
 */
import com.adibrata.smartdealer.model.*;
public interface PettyCashService {
	public void SavePettyCash (PettyCashHdr pettycashhdr, PettyCashDtl pettycashdtl);
	public List<Object[]>  PurchaseInvoicePaging(int CurrentPage, String WhereCond, String SortBy);
	public double PurchaseInvoicePagingTotalRecord(String WherCond);
	
}
