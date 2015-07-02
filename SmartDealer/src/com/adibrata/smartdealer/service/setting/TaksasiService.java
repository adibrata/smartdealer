package com.adibrata.smartdealer.service.setting;

import java.util.List;
import com.adibrata.smartdealer.model.*;
public interface TaksasiService {
	public void SaveAdd(Taksasi taksasi);
	public void SaveEdit(Taksasi taksasi);
	public void SaveDelete(Taksasi taksasi);
	public List<Taksasi> Paging(int CurrentPage, String WhereCond, String SortBy);
	public long TotalRecord(String WherCond);
	public Taksasi View(long id);
}
