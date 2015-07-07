/**
 * 
 */
package com.adibrata.smartdealer.service.accpay;

import java.util.List;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.SeviceBase;
/**
 * @author Henry
 *
 */

public interface PVDisbursementService extends SeviceBase{
	public void Save(PaymentVoucher paymentVoucher);

	public List<PaymentVoucher>  Paging(int CurrentPage, String WhereCond, String SortBy);

	public long TotalRecord(String WherCond);
	public PaymentVoucher View(long id);
}
