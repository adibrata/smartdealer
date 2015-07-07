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
public interface ZipCodeService  extends SeviceBase {
	public void SaveAdd(ZipCode zipcode);
	public void SaveEdit(ZipCode zipcode);
	public void SaveDel(ZipCode zipcode);
	public List<ZipCode> Paging(int CurrentPage, String WhereCond, String SortBy);
	public List<ZipCode> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast);
	
	public ZipCode View(long id);
	
}
