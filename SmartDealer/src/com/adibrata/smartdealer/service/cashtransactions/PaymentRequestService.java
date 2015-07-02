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

public interface PaymentRequestService {
	public void SavePaymentRequest (PayReqHdr payReqHdr, PayReqDtl payReqDtl);
	public List<Object[]>  PurchaseInvoicePaging(int CurrentPage, String WhereCond, String SortBy);
	public double PurchaseInvoicePagingTotalRecord(String WherCond);
	
}
