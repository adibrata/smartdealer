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
import com.adibrata.smartdealer.service.setting.TaksasiService;

public class TaksasiAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String mode;
	private Taksasi taksasi;
	private TaksasiService taksasiService;
	private Partner partner;
	private Office office;
	private List<Taksasi> lstTaksasi;
 
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the taksasi
	 */
	public Taksasi getTaksasi() {
		return taksasi;
	}

	/**
	 * @return the taksasiService
	 */
	public TaksasiService getTaksasiService() {
		return taksasiService;
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
	 * @return the lstTaksasi
	 */
	public List<Taksasi> getLstTaksasi() {
		return lstTaksasi;
	}

	/**
	 * @param taksasi the taksasi to set
	 */
	public void setTaksasi(Taksasi taksasi) {
		this.taksasi = taksasi;
	}

	/**
	 * @param taksasiService the taksasiService to set
	 */
	public void setTaksasiService(TaksasiService taksasiService) {
		this.taksasiService = taksasiService;
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
	 * @param lstTaksasi the lstTaksasi to set
	 */
	public void setLstTaksasi(List<Taksasi> lstTaksasi) {
		this.lstTaksasi = lstTaksasi;
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
