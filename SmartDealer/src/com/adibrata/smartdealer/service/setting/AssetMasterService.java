/**
 * 
 */
package com.adibrata.smartdealer.service.setting;

import java.util.List;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.SeviceBase;

/**
 * @author Henry
 *
 */
public interface AssetMasterService  extends SeviceBase {
	public void SaveAdd(AssetMaster stock);

	public void SaveEdit(AssetMaster stock);

	public void SaveDel(AssetMaster stock);

	public List<AssetMaster> Paging(int CurrentPage, String WhereCond,
			String SortBy);

	public List<AssetMaster> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast);

	public AssetMaster View(long id);
}
