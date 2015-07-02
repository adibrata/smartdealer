/**
 * 
 */
package com.adibrata.smartdealer.action.usermanagement;

/**
 * @author Henry
 *
 */
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.setting.AssetDocMasterService;
import com.adibrata.smartdealer.service.usermanagement.RoleService;

public class RoleAction extends ActionSupport implements Preparable {

	private String mode;
	private RoleService roleService;
	private Partner partner;
	private Office office;
	private MsRole msRole;
	private List<MsRole> lstRole;

	/**
	 * @return the mode
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * @return the roleService
	 */
	public RoleService getRoleService() {
		return roleService;
	}

	/**
	 * @return the partner
	 */
	public Partner getPartner() {
		return partner;
	}

	/**
	 * @return the office
	 */
	public Office getOffice() {
		return office;
	}

	/**
	 * @return the msRole
	 */
	public MsRole getMsRole() {
		return msRole;
	}

	/**
	 * @return the lstRole
	 */
	public List<MsRole> getLstRole() {
		return lstRole;
	}

	/**
	 * @param mode the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * @param roleService the roleService to set
	 */
	public void setRoleService(RoleService roleService) {
		this.roleService = roleService;
	}

	/**
	 * @param partner the partner to set
	 */
	public void setPartner(Partner partner) {
		this.partner = partner;
	}

	/**
	 * @param office the office to set
	 */
	public void setOffice(Office office) {
		this.office = office;
	}

	/**
	 * @param msRole the msRole to set
	 */
	public void setMsRole(MsRole msRole) {
		this.msRole = msRole;
	}

	/**
	 * @param lstRole the lstRole to set
	 */
	public void setLstRole(List<MsRole> lstRole) {
		this.lstRole = lstRole;
	}

	/**
	 * 
	 */
	public RoleAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}

}
