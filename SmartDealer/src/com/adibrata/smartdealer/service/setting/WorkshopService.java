/**
 * 
 */
package com.adibrata.smartdealer.service.setting;

import java.util.List;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.SeviceBase;
/**
 * @author Henry
 *
 */
public interface WorkshopService  extends SeviceBase {
	public void SaveAdd(Workshop workshop);
	public void SaveEdit(Workshop workshop);
	public void SaveDel(Workshop workshop);
	public  List<Workshop> Paging(int CurrentPage, String WhereCond, String SortBy);
	public List<Workshop> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast);
	
	public Workshop View(long id);
}
