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
import com.adibrata.smartdealer.service.setting.JournalSchemeService;

public class JurnalSchemeAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String mode;
	private JournalSchemeService jourSchemeService;
	private CoaSchmDtl coaschmdtl;
	private CoaSchmHdr coaschmhdr;
	private Partner partner;
	private Office office;
	private List<CoaSchmDtl> lstCoaSchmDtl;
	private List<CoaSchmHdr> lstcoaSchmHdr;

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the jourSchemeService
	 */
	public JournalSchemeService getJourSchemeService() {
		return jourSchemeService;
	}

	/**
	 * @return the coaschmdtl
	 */
	public CoaSchmDtl getCoaschmdtl() {
		return coaschmdtl;
	}

	/**
	 * @return the coaschmhdr
	 */
	public CoaSchmHdr getCoaschmhdr() {
		return coaschmhdr;
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
	 * @return the lstCoaSchmDtl
	 */
	public List<CoaSchmDtl> getLstCoaSchmDtl() {
		return lstCoaSchmDtl;
	}

	/**
	 * @return the lstcoaSchmHdr
	 */
	public List<CoaSchmHdr> getLstcoaSchmHdr() {
		return lstcoaSchmHdr;
	}

	/**
	 * @param jourSchemeService the jourSchemeService to set
	 */
	public void setJourSchemeService(JournalSchemeService jourSchemeService) {
		this.jourSchemeService = jourSchemeService;
	}

	/**
	 * @param coaschmdtl the coaschmdtl to set
	 */
	public void setCoaschmdtl(CoaSchmDtl coaschmdtl) {
		this.coaschmdtl = coaschmdtl;
	}

	/**
	 * @param coaschmhdr the coaschmhdr to set
	 */
	public void setCoaschmhdr(CoaSchmHdr coaschmhdr) {
		this.coaschmhdr = coaschmhdr;
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
	 * @param lstCoaSchmDtl the lstCoaSchmDtl to set
	 */
	public void setLstCoaSchmDtl(List<CoaSchmDtl> lstCoaSchmDtl) {
		this.lstCoaSchmDtl = lstCoaSchmDtl;
	}

	/**
	 * @param lstcoaSchmHdr the lstcoaSchmHdr to set
	 */
	public void setLstcoaSchmHdr(List<CoaSchmHdr> lstcoaSchmHdr) {
		this.lstcoaSchmHdr = lstcoaSchmHdr;
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
			if (mode.equals("detail")) {
				return "detail";
			}
			if (mode.equals("saveDetail")) {
				return "saveDetail";
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
