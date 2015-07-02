package com.adibrata.smartdealer.service.usermanagement;

import java.util.List;

import com.adibrata.smartdealer.model.*;
public interface UserRoleService {
	public void SaveAdd(MsUserRole msUserRole);
	public void SaveEdit(MsUserRole msUserRole);
	public void Savedel(MsUserRole msUserRole);
	
	public List<Object[]>  Paging(int CurrentPage, String WhereCond, String SortBy);
	public long TotalRecord(String WherCond);
	public MsUserRole View(long Id);
}
