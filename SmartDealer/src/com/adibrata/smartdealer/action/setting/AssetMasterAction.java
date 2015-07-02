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
import com.adibrata.smartdealer.service.setting.AssetMasterService;

public class AssetMasterAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String mode;
	private AssetMasterService assetMasterService;
	private AssetMaster assetmaster;
	private Partner partner;
	private Office office;
	private List<AssetMaster> lstAssetMaster;

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the assetMasterService
	 */
	public AssetMasterService getAssetMasterService() {
		return assetMasterService;
	}

	/**
	 * @return the assetmaster
	 */
	public AssetMaster getAssetmaster() {
		return assetmaster;
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
	 * @return the lstAssetMaster
	 */
	public List<AssetMaster> getLstAssetMaster() {
		return lstAssetMaster;
	}

	/**
	 * @param assetMasterService the assetMasterService to set
	 */
	public void setAssetMasterService(AssetMasterService assetMasterService) {
		this.assetMasterService = assetMasterService;
	}

	/**
	 * @param assetmaster the assetmaster to set
	 */
	public void setAssetmaster(AssetMaster assetmaster) {
		this.assetmaster = assetmaster;
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
	 * @param lstAssetMaster the lstAssetMaster to set
	 */
	public void setLstAssetMaster(List<AssetMaster> lstAssetMaster) {
		this.lstAssetMaster = lstAssetMaster;
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
