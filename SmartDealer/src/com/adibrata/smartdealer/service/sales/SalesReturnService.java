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
public interface SalesReturnService {
	public void Save(ReturSalesHdr returSalesHdr, List<ReturSalesDtl> returSalesDtl );
	public List<ReturSalesHdr> Paging(int CurrentPage, String WhereCond, String SortBy);
	public List<ReturSalesHdr> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast);
	public long TotalRecord(String WherCond);
	
}
