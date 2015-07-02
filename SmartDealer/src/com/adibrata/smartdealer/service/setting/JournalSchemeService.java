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

	public void SaveAddHeader(CoaSchmHdr coaSchmHdr);

	public void SaveEditHeader(CoaSchmHdr coaSchmHdr);

	public void SavedelHeader(CoaSchmHdr coaSchmHdr);

	public void SaveDetail(CoaSchmHdr coaSchmHdr, List<Coamaster> coamaster);

	public List<CoaSchmHdr> PagingHeader(int CurrentPage, String WhereCond,
			String SortBy);

	public long TotalRecord(String WherCond);

	public List<Coamaster> ListCoaMaster();

	public CoaSchmHdr ViewHeader(long id);

	public List<CoaSchmDtl> ViewDetail(CoaSchmHdr coaSchmHdr);

}
