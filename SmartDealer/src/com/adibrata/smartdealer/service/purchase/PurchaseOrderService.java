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
public interface PurchaseOrderService  extends SeviceBase {

	public void Save(PurchaseOrderHdr purchaseOrderHdr, List<PurchaseOrderDtl> lstpurchaseOrderDtl);
	public List<PurchaseOrderHdr> POHdrPaging(int CurrentPage, String WhereCond, String SortBy);
	public List<PurchaseOrderHdr> POHdrPaging(int CurrentPage, String WhereCond, String SortBy, boolean islast);
	
	public List<PurchaseOrderDtl> viewPurchaseOrderDtls(PurchaseOrderHdr purchaseOrderHdr);
	public long TotalRecord(String WherCond);
	public PurchaseOrderHdr viewPurchaseOrderHdr (long id);
}
