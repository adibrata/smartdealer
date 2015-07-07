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
public interface SalesReturnService  extends SeviceBase{
	public void Save(ReturSalesHdr returSalesHdr, List<ReturSalesDtl> returSalesDtl );
	public List<ReturSalesHdr> Paging(int CurrentPage, String WhereCond, String SortBy);
	public List<ReturSalesHdr> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast);
	
	
}
