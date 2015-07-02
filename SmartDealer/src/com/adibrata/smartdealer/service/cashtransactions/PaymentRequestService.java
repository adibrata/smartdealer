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
	public void SavePaymentRequest (PayReqHdr payReqHdr, List<PayReqDtl> payReqDtl);
	public List<Object[]> Paging(int CurrentPage, String WhereCond, String SortBy);
	public double TotalRecord(String WherCond);
	
}
