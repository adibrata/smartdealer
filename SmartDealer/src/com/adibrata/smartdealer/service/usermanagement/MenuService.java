/**
 * 
 */
package com.adibrata.smartdealer.service.usermanagement;

import java.util.List;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.SeviceBase;
/**
 * @author Henry
 *
 */
public interface MenuService  extends SeviceBase {
	public void SaveAdd(MsMenu msMenu);
	public void SaveEdit(MsMenu msMenu);
	public void SaveDel(MsMenu msMenu);
	public List<MsMenu>  Paging(int CurrentPage, String WhereCond, String SortBy);
	
	public String MenuRender ();
}
