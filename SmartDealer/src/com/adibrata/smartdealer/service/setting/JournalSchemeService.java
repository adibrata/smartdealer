/**
 * 
 */
package com.adibrata.smartdealer.service.setting;

import java.util.List;

import com.adibrata.smartdealer.dao.setting.JournalSchemeDao;
import com.adibrata.smartdealer.model.*;

/**
 * @author Henry
 *
 */
public interface JournalSchemeService {

	public void SaveAddHeader(CoaSchmHdr coaSchmHdr) throws Exception;

	public void SaveEditHeader(CoaSchmHdr coaSchmHdr) throws Exception;

	public void SaveDelHeader(CoaSchmHdr coaSchmHdr) throws Exception;

	public void SaveDetail(CoaSchmHdr coaSchmHdr,
			List<ListCoaSchmDtl> lstCoaSchmDtl, String usrUpd) throws Exception;

	public List<CoaSchmHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy) throws Exception;

	public List<CoaSchmHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast) throws Exception;

	public List<ListCoaSchmDtl> ListCoaSchmDtl(CoaSchmHdr coaSchmHdr)
			throws Exception;

	public CoaSchmHdr ViewHeader(long id) throws Exception;

	public List<CoaSchmDtl> ViewDetail(CoaSchmHdr coaSchmHdr) throws Exception;

}
