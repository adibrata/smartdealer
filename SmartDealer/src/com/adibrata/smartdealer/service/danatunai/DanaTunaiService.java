/**
 * 
 */
package com.adibrata.smartdealer.service.danatunai;

/**
 * @author Henry
 *
 */

import java.util.List;

import com.adibrata.smartdealer.model.*;
public interface DanaTunaiService {
	public void Save(DanaTunai danaTunai);

	public List<DanaTunai> Paging(int CurrentPage, String WhereCond, String SortBy);

	public long TotalRecord(String WherCond);
	public List<DanaTunai> View(long id);
}
