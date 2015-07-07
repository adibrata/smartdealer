/**
 * 
 */
package com.adibrata.smartdealer.service.sales;

import java.util.List;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.SeviceBase;
/**
 * @author Henry
 *
 */
public interface SalesInvoiceService  extends SeviceBase {
	public void Save(SalesInvoice salesInvoice);
	public List<SalesOrderHdr> Paging(int CurrentPage, String WhereCond, String SortBy);
	public List<SalesOrderHdr> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast);
	public long TotalRecord(String WherCond);
	public SalesOrderHdr View (long id);
}
