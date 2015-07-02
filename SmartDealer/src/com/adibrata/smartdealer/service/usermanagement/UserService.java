/**
 * 
 */
package com.adibrata.smartdealer.service.usermanagement;

import java.util.List;

import com.adibrata.smartdealer.model.*;

/**
 * @author Henry
 *
 */
public interface UserService {
	public void SaveAdd(MsUser msUser);
	public void SaveEdit(MsUser msUser);
	public void Savedel(MsUser msUser);
	public List<MsUser> Paging(int CurrentPage, String WhereCond, String SortBy);
	public long TotalRecord(String WherCond);
	public boolean PasswordVerification(MsUser msUser);
	public void ResetPassword (MsUser msUser);
	public MsUser View(long id);
}
