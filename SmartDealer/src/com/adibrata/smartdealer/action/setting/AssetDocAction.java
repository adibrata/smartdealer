package com.adibrata.smartdealer.action.setting;

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

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.sales.SalesOrderService;
import com.adibrata.smartdealer.service.setting.AssetDocMasterService;

public class AssetDocAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String mode;

	private AssetDocMasterService assetDocMasterService;
	private AssetDocMaster assetDocMaster;
	private Partner partner;
	private Office office;
	private List<AssetDocMaster> lstassetAssetDocMasters;

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the assetDocMasterService
	 */
	public AssetDocMasterService getAssetDocMasterService() {
		return assetDocMasterService;
	}

	/**
	 * @return the assetDocMaster
	 */
	public AssetDocMaster getAssetDocMaster() {
		return assetDocMaster;
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
	 * @return the lstassetAssetDocMasters
	 */
	public List<AssetDocMaster> getLstassetAssetDocMasters() {
		return lstassetAssetDocMasters;
	}

	/**
	 * @param assetDocMasterService
	 *            the assetDocMasterService to set
	 */
	public void setAssetDocMasterService(
			AssetDocMasterService assetDocMasterService) {
		this.assetDocMasterService = assetDocMasterService;
	}

	/**
	 * @param assetDocMaster
	 *            the assetDocMaster to set
	 */
	public void setAssetDocMaster(AssetDocMaster assetDocMaster) {
		this.assetDocMaster = assetDocMaster;
	}

	/**
	 * @param partner
	 *            the partner to set
	 */
	public void setPartner(Partner partner) {
		this.partner = partner;
	}

	/**
	 * @param office
	 *            the office to set
	 */
	public void setOffice(Office office) {
		this.office = office;
	}

	/**
	 * @param lstassetAssetDocMasters
	 *            the lstassetAssetDocMasters to set
	 */
	public void setLstassetAssetDocMasters(
			List<AssetDocMaster> lstassetAssetDocMasters) {
		this.lstassetAssetDocMasters = lstassetAssetDocMasters;
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}

	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
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
			if (mode.equals("saveadd")) {
				return "save";
			}
			if (mode.equals("saveedit")) {
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

	private void SaveAdd() {
		try {

		} catch (Exception exp) {
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
	}

	private void SaveEdit() {
		try {

		} catch (Exception exp) {
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
	}

}
