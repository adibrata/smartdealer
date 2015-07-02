package com.adibrata.smartdealer.service.setting;

import java.util.List;
import com.adibrata.smartdealer.model.*;
public interface OfficeService {
	public void SaveAdd(Office office);
	public void SaveEdit(Office office);
	public void Savedel(Office office);
	
	public List<Office> Paging(int CurrentPage, String WhereCond, String SortBy);
	public long TotalRecord(String WherCond);
	public Office View(long id);
}
