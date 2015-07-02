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
public interface ZipCodeService {
	public void SaveAdd(ZipCode zipcode);
	public void SaveEdit(ZipCode zipcode);
	public void SaveDelete(ZipCode zipcode);
	public List<ZipCode> Paging(int CurrentPage, String WhereCond, String SortBy);
	public long TotalRecord(String WherCond);
	public ZipCode View(long id);
	
}
