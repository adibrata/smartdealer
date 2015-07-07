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
public interface RoleService {
	public void SaveAdd(MsRole msRole);
	public void SaveEdit(MsRole msRole);
	public void SaveDel(MsRole msRole);
	public List<MsRole>  Paging(int CurrentPage, String WhereCond, String SortBy);
	public List<MsRole> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast);
	public long TotalRecord(String WherCond);
	public MsRole View(long Id);
}
