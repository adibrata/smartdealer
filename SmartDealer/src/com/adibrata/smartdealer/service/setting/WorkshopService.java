/**
 * 
 */
package com.adibrata.smartdealer.service.setting;

import java.util.List;

import com.adibrata.smartdealer.model.*;
/**
 * @author Henry
 *
 */
public interface WorkshopService {
	public void SaveAdd(Workshop workshop);
	public void SaveEdit(Workshop workshop);
	public void SaveDelete(Workshop workshop);
	public  List<Workshop> Paging(int CurrentPage, String WhereCond, String SortBy);
	public long TotalRecord(String WherCond);
	public Workshop View(long id);
}
