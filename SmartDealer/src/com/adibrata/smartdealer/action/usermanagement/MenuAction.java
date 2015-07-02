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
import com.adibrata.smartdealer.service.usermanagement.MenuService;

public class MenuAction extends ActionSupport implements Preparable {

	private String mode;
	private MenuService menuService;
	private Partner partner;
	private Office office;
	private MsMenu msMenu;
	private List<MsMenu> lstMenu;

	/**
	 * @return the mode
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * @return the menuService
	 */
	public MenuService getMenuService() {
		return menuService;
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
	 * @return the msMenu
	 */
	public MsMenu getMsMenu() {
		return msMenu;
	}

	/**
	 * @return the lstMenu
	 */
	public List<MsMenu> getLstMenu() {
		return lstMenu;
	}

	/**
	 * @param mode the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * @param menuService the menuService to set
	 */
	public void setMenuService(MenuService menuService) {
		this.menuService = menuService;
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
	 * @param msMenu the msMenu to set
	 */
	public void setMsMenu(MsMenu msMenu) {
		this.msMenu = msMenu;
	}

	/**
	 * @param lstMenu the lstMenu to set
	 */
	public void setLstMenu(List<MsMenu> lstMenu) {
		this.lstMenu = lstMenu;
	}

	public MenuAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}

}
