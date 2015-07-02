/**
 * 
 */
package com.adibrata.smartdealer.service.setting;

import java.util.List;

import com.adibrata.smartdealer.model.*;
/**
 * @author Henry
 *
 */
public interface COAMasterService {
	
	public void SaveAdd(Coamaster coamaster);
	public void SaveEdit(Coamaster coamaster);
	public void SaveDelete(Coamaster coamaster);
	
	public List<Coamaster>  Paging(int CurrentPage, String WhereCond, String SortBy);
	public long TotalRecord(String WherCond);
	public Coamaster View (long id);
}
