/**
 * 
 */
package com.adibrata.smartdealer.service.accpay;

import java.util.List;

import com.adibrata.smartdealer.model.*;
/**
 * @author Henry
 *
 */

public interface PVDisbursementService {
	public void Save(PaymentVoucher paymentVoucher);

	public List<Object[]>  Paging(int CurrentPage, String WhereCond, String SortBy);

	public long TotalRecord(String WherCond);
	public List<Object[]> View(long id);
}
