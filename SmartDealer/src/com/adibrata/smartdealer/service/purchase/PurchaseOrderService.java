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
	public List Paging(int CurrentPage, String WhereCond, String SortBy);
	public long TotalRecord(String WherCond);
}
