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
import com.adibrata.smartdealer.service.SeviceBase;
public interface DanaTunaiService  extends SeviceBase {
	public void Save(DanaTunai danaTunai);

	public List<DanaTunai> Paging(int CurrentPage, String WhereCond, String SortBy);
	public List<DanaTunai> Paging(int CurrentPage, String WhereCond, String SortBy, boolean isLast);
	public long TotalRecord(String WherCond);
	public DanaTunai viewDanaTunai(long id);
}
