package com.adibrata.smartdealer.service.setting;

import java.util.List;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.SeviceBase;
public interface OfficeService  extends SeviceBase {
	public void SaveAdd(Office office);
	public void SaveEdit(Office office);
	public void SaveDel(Office office);
	
	public List<Office> Paging(int CurrentPage, String WhereCond, String SortBy);
	public List<Office> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast);
	
	public Office View(long id);
}
