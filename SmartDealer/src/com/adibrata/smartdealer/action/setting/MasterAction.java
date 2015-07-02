package com.adibrata.smartdealer.action.setting;

/**
 * @author Henry
 *
 */
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;
import com.sun.org.apache.bcel.internal.generic.LSTORE;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.setting.AssetDocMasterService;
import com.adibrata.smartdealer.service.setting.MasterService;

public class MasterAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String mode;
	private MasterType masterType;
	private MasterTable masterTable;
	private MasterService masterService;
	private Partner partner;
	private Office office;
	private List<MasterType> lstMasterType;

	private List<MasterTable> lstMasterTable;
	

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the masterType
	 */
	public MasterType getMasterType() {
		return masterType;
	}

	/**
	 * @return the masterTable
	 */
	public MasterTable getMasterTable() {
		return masterTable;
	}

	/**
	 * @return the masterService
	 */
	public MasterService getMasterService() {
		return masterService;
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
	 * @return the lstMasterType
	 */
	public List<MasterType> getLstMasterType() {
		return lstMasterType;
	}

	/**
	 * @return the lstMasterTable
	 */
	public List<MasterTable> getLstMasterTable() {
		return lstMasterTable;
	}

	/**
	 * @param masterType the masterType to set
	 */
	public void setMasterType(MasterType masterType) {
		this.masterType = masterType;
	}

	/**
	 * @param masterTable the masterTable to set
	 */
	public void setMasterTable(MasterTable masterTable) {
		this.masterTable = masterTable;
	}

	/**
	 * @param masterService the masterService to set
	 */
	public void setMasterService(MasterService masterService) {
		this.masterService = masterService;
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
	 * @param lstMasterType the lstMasterType to set
	 */
	public void setLstMasterType(List<MasterType> lstMasterType) {
		this.lstMasterType = lstMasterType;
	}

	/**
	 * @param lstMasterTable the lstMasterTable to set
	 */
	public void setLstMasterTable(List<MasterTable> lstMasterTable) {
		this.lstMasterTable = lstMasterTable;
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}

	public String execute() {
		if (mode != null) {
			if (mode.equals("search")) {
				return "search";
			}
			if (mode.equals("edit")) {
				return "edit";
			}
			if (mode.equals("del")) {
				return "del";
			}
			if (mode.equals("add")) {
				return "add";
			}
			if (mode.equals("save")) {
				return "save";
			}
			if (mode.equals("save")) {
				return "save";
			}
			if (mode.equals("back")) {
				return "back";
			}
		} else {
			return "page";
		}
		return mode;
	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}

}
