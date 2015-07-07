package com.adibrata.smartdealer.service.setting;

import java.util.List;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.SeviceBase;
public interface TaksasiService  extends SeviceBase {
	public void SaveAdd(Taksasi taksasi);
	public void SaveEdit(Taksasi taksasi);
	public void SaveDel(Taksasi taksasi);
	public List<Taksasi> Paging(int CurrentPage, String WhereCond, String SortBy);
	public List<Taksasi> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast);
	
	public Taksasi View(long id);
}
