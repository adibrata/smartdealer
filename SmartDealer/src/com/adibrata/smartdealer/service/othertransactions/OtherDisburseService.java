/**
 * 
 */
package com.adibrata.smartdealer.service.othertransactions;

import java.util.List;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.SeviceBase;

/**
 * @author Henry
 *
 */
public interface OtherDisburseService extends SeviceBase {
	public void Save(String usrupd, OtherDsbHdr otherDsbHdr,
			List<OtherDsbDtl> otherDsbDtl) throws Exception;

	public List Paging(int CurrentPage, String WhereCond, String SortBy)
			throws Exception;

	public List Paging(int CurrentPage, String WhereCond, String SortBy,
			boolean islast) throws Exception;

}
