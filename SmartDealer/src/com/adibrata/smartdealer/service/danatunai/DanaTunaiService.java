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

	public List<Customer> Paging(int CurrentPage, String WhereCond, String SortBy);

	public long TotalRecord(String WherCond);
	public DanaTunai viewDanaTunai(long id);
}
