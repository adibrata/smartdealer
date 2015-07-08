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
	public List<OtherRcvHdr> Paging(int CurrentPage, String WhereCond, String SortBy);
	public List<OtherRcvHdr> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast);
	public long TotalRecord(String WherCond);
}
