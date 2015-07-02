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

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.setting.AssetDocMasterService;
import com.adibrata.smartdealer.service.setting.ZipCodeService;

public class ZipCodeAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String mode;
	private ZipCode zipCode;
	private Partner partner;
	private Office office;
	private List<ZipCode> lstZipCode;

	private ZipCodeService zipCodeService;

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the zipCode
	 */
	public ZipCode getZipCode() {
		return zipCode;
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
	 * @return the lstZipCode
	 */
	public List<ZipCode> getLstZipCode() {
		return lstZipCode;
	}

	/**
	 * @return the zipCodeService
	 */
	public ZipCodeService getZipCodeService() {
		return zipCodeService;
	}

	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(ZipCode zipCode) {
		this.zipCode = zipCode;
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
	 * @param lstZipCode the lstZipCode to set
	 */
	public void setLstZipCode(List<ZipCode> lstZipCode) {
		this.lstZipCode = lstZipCode;
	}

	/**
	 * @param zipCodeService the zipCodeService to set
	 */
	public void setZipCodeService(ZipCodeService zipCodeService) {
		this.zipCodeService = zipCodeService;
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
