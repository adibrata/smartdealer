/**
 * 
 */
package com.adibrata.smartdealer.service.setting;

import java.util.List;

import com.adibrata.smartdealer.model.*;
/**
 * @author Henry
 *
 */
public interface AssetMasterService {
	public void SaveAdd(AssetMaster stock);
	public void SaveEdit(AssetMaster stock);
	public void SaveDel(AssetMaster stock);
	
	public List<AssetMaster> Paging(int CurrentPage, String WhereCond, String SortBy);
	public List<AssetMaster> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast);
	public long TotalRecord(String WherCond);
	public AssetMaster View (long id);
}
