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
public interface SalesOrderService  extends SeviceBase {
	public void Save(SalesOrderHdr salesOrderHdr, List<SalesOrderDtl> salesOrderDtl);
	public List<Customer> Paging(int CurrentPage, String WhereCond, String SortBy);
	public List<Customer> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast);
	public long TotalRecord(String WherCond);
	public Customer viewCustomer (long id);
	public SalesOrderHdr viewSalesOrderHdr (long id);
	public List<SalesOrderDtl> viewSalesOrderDtls(SalesOrderHdr salesOrderHdr);
}
