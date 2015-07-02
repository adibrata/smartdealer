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
	public void Save(ReturSalesHdr returSalesHdr, ReturSalesDtl returSalesDtl );
	public List Paging(int CurrentPage, String WhereCond, String SortBy);
	public long TotalRecord(String WherCond);
}
