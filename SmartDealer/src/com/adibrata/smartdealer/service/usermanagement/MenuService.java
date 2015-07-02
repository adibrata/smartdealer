/**
 * 
 */
package com.adibrata.smartdealer.service.usermanagement;

import java.util.List;

import com.adibrata.smartdealer.model.*;
/**
 * @author Henry
 *
 */
public interface MenuService {
	public void SaveAdd(MsMenu msMenu);
	public void SaveEdit(MsMenu msMenu);
	public void SaveDel(MsMenu msMenu);
	public List<MsMenu>  Paging(int CurrentPage, String WhereCond, String SortBy);
	public long TotalRecord(String WherCond);
	public String MenuRender ();
}
