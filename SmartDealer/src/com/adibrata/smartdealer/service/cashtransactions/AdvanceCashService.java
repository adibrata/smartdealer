/**
 * 
 */
package com.adibrata.smartdealer.service.cashtransactions;

import java.util.List;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.SeviceBase;
/**
 * @author Henry
 *
 */
public interface AdvanceCashService  extends SeviceBase {
	public void Save (AdvanceCash advancecash);
	public List<AdvanceCash>  Paging(int CurrentPage, String WhereCond, String SortBy);
	public List<AdvanceCash>  Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast);
	
	public AdvanceCash View(long id);
}
