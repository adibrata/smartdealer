/**
 * 
 */
package com.adibrata.smartdealer.service.othertransactions;

/**
 * @author Henry
 *
 */

import java.util.List;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.SeviceBase;

public interface OtherReceiveService  extends SeviceBase {
	public void Save (OtherRcvHdr otherRcvHdr, List<OtherRcvDtl> otherRcvDtl);
	public List Paging(int CurrentPage, String WhereCond, String SortBy);
	public long TotalRecord(String WherCond);
}
