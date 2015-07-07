/**
 * 
 */
package com.adibrata.smartdealer.service.cashtransactions;

import java.util.List;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.SeviceBase;
/**
 * @author Henry
 *
 */

public interface PaymentRequestService  extends SeviceBase {
	public void SavePaymentRequest (PayReqHdr payReqHdr, List<PayReqDtl> payReqDtl);
	public List<PayReqHdr> Paging(int CurrentPage, String WhereCond, String SortBy);
	public List<PayReqHdr> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast);
	public List<PayReqDtl> lstPayReqDtl(int CurrentPage, String WhereCond, String SortBy);
	public PayReqDtl View (long id);
	
	public long TotalRecord(String WherCond);
	
}
