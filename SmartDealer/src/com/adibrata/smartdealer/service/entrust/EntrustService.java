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
import com.adibrata.smartdealer.service.SeviceBase;
public interface EntrustService extends SeviceBase  {
	public void Save(EntrustHdr entrustHdr, EntrustDtl entrustDtl);
	
	public List Paging(int CurrentPage, String WhereCond, String SortBy);
	public long TotalRecord(String WherCond);
	public EntrustHdr viewEntrusHdr(long id);
	public List<EntrustDtl> viewEntrusDtl(EntrustHdr entrustHdr);
	
}
