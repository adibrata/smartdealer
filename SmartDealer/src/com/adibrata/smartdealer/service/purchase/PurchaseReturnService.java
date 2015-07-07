/**
 * 
 */
package com.adibrata.smartdealer.service.purchase;
import java.util.List;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.SeviceBase;
/**
 * @author Henry
 *
 */

public interface PurchaseReturnService  extends SeviceBase {
	public void Save(ReturPurchaseHdr returPurchaseHdr, List<ReturPurchaseDtl> returPurchaseDtl);
	public List<PurchaseOrderHdr> Paging(int CurrentPage, String WhereCond, String SortBy);
	public List<PurchaseOrderHdr> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast);
	public long TotalRecord(String WherCond);
	public PurchaseOrderHdr viewPurchaseOrderHdr (long id);
}
