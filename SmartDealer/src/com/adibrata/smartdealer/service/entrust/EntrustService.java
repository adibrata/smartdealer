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

public interface EntrustService extends SeviceBase {
	public void Save(String usrupd, EntrustHdr entrustHdr,
			List<EntrustDtl> lstentrustDtl) throws Exception;

	public List<EntrustHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy) throws Exception;

	public List<EntrustHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) throws Exception;

	public EntrustHdr viewEntrusHdr(long id) throws Exception;

	public List<EntrustDtl> viewEntrusDtl(EntrustHdr entrustHdr)
			throws Exception;

}
