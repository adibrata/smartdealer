/**
 * 
 */
package com.adibrata.smartdealer.service.cashtransactions;

import java.util.List;



/**
 * @author Henry
 *
 */
import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.SeviceBase;

public interface PettyCashService  extends SeviceBase {
	public void SavePettyCash(PettyCashHdr pettycashhdr,
			List<PettyCashDtl> pettycashdtl);

	public List<PettyCashHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy);

	public List<PettyCashHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast);

	public PettyCashHdr View(long id);

	public List<PettyCashDtl> ViewDetail(PettyCashHdr pettyCashHdr);

	public long TotalRecord(String WherCond);

}
