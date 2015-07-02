/**
 * 
 */
package com.adibrata.smartdealer.service.sales;

import java.util.List;
import com.adibrata.smartdealer.model.*;
/**
 * @author Henry
 *
 */
public interface SalesInvoiceService {
	public void Save(SalesInvoice salesInvoice);
	public List<SalesOrderHdr> Paging(int CurrentPage, String WhereCond, String SortBy);
	public long TotalRecord(String WherCond);
	public SalesOrderHdr View (long id);
}
