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
public interface RoleService  extends SeviceBase {
	public void SaveAdd(MsRole msRole);
	public void SaveEdit(MsRole msRole);
	public void SaveDel(MsRole msRole);
	public List<MsRole>  Paging(int CurrentPage, String WhereCond, String SortBy);
	public List<MsRole> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast);
	
	public MsRole View(long Id);
}
