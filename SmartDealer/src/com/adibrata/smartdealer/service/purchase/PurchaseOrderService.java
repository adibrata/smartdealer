/**
 * 
 */
package com.adibrata.smartdealer.service.purchase;

import java.util.List;

import com.adibrata.smartdealer.model.*;
/**
 * @author Henry
 *
 */
public interface PurchaseOrderService {

	public void Save(PurchaseOrderHdr purchaseOrderHdr, List<PurchaseOrderDtl> lstpurchaseOrderDtl);
	public List<Supplier> Paging(int CurrentPage, String WhereCond, String SortBy);
	public List<Supplier> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast);
	
	public long TotalRecord(String WherCond);
}
