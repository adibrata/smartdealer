/**
 * 
 */
package com.adibrata.smartdealer.service.setting;

import java.util.List;

import com.adibrata.smartdealer.dao.setting.AssetDocMasterDao;
import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.SeviceBase;

/**
 * @author Henry
 *
 */
public interface AssetDocMasterService extends SeviceBase {

	public void SaveAdd(AssetDocMaster assetDocMaster);

	public void SaveEdit(AssetDocMaster assetDocMaster);

	public void SaveDel(AssetDocMaster assetDocMaster);

	public List<AssetDocMaster> Paging(int CurrentPage, String WhereCond,
			String SortBy);

	public List<AssetDocMaster> Paging(int CurrentPage, String WhereCond,
			String SortBy, boolean islast);

	public AssetDocMaster View(long id);

}
