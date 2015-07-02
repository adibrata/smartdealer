/**
 * 
 */
package com.adibrata.smartdealer.service.entrust;

import java.util.List;

import com.adibrata.smartdealer.model.*;
/**
 * @author Henry
 *
 */
import com.adibrata.smartdealer.model.*;
public interface EntrustService {
	public void Save(EntrustHdr entrustHdr, EntrustDtl entrustDtl);
	
	public List Paging(int CurrentPage, String WhereCond, String SortBy);
	public long TotalRecord(String WherCond);
	public List<Object[]> View(long id);
	
}
