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
public interface MasterService {
	public void SaveAdd(MasterType masterType, MasterTable masterTable);
	public void SaveEdit(MasterType masterType, MasterTable masterTable);
	public void SaveDelete(MasterTable masterTable);
	
	public List<MasterTable> Paging(int CurrentPage, String WhereCond, String SortBy);
	public long TotalRecord(String WherCond);
	public List<MasterType> ListMasterType();
	public MasterTable View(long id);
}
