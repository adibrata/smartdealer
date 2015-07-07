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

public interface PurchaseReturnService {
	public void Save(ReturPurchaseHdr returPurchaseHdr, List<ReturPurchaseDtl> returPurchaseDtl);
	public List<PurchaseOrderHdr> Paging(int CurrentPage, String WhereCond, String SortBy);
	public List<PurchaseOrderHdr> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast);
	public long TotalRecord(String WherCond);
}
