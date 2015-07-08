/**
 * 
 */
package com.adibrata.smartdealer.service.othertransactions;


import java.util.List;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.SeviceBase;

/**
 * @author Henry
 *
 */
public interface OtherDisburseService  extends SeviceBase {
	public void Save (OtherDsbHdr otherDsbHdr, List<OtherDsbDtl> otherDsbDtl);
	public List Paging(int CurrentPage, String WhereCond, String SortBy);
	public List Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast);
	public long TotalRecord(String WherCond);
}
