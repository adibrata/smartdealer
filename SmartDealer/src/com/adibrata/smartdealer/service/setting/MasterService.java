/**
 * 
 */
package com.adibrata.smartdealer.service.setting;

import java.util.List;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.SeviceBase;
/**
 * @author Henry
 *
 */
public interface MasterService  extends SeviceBase {
	public void SaveAdd(MasterType masterType, MasterTable masterTable);
	public void SaveEdit(MasterType masterType, MasterTable masterTable);
	public void SaveDel(MasterTable masterTable);
	
	public List<MasterTable> Paging(int CurrentPage, String WhereCond, String SortBy);
	public List<MasterTable> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast);
	
	public List<MasterType> ListMasterType();
	public MasterTable View(long id);
}
