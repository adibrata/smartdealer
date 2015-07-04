package com.adibrata.smartdealer.action.cashtransaction;

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
import com.adibrata.smartdealer.service.cashtransactions.PettyCashService;

public class PettyCashAction extends ActionSupport implements Preparable {
	private Partner partner;
	private Office office;
	private PettyCashHdr pettyCashHdr;
	private PettyCashDtl pettCashDtl;
	private PettyCashService pettCashService;
	String mode;
	
	public String execute() {
		String strMode;
		strMode = mode;

		if (mode != null) {
			switch (strMode) {
			case "search":
			default:
				return "failed";
			}
		} else {
			strMode = "start";
		}
		return strMode;
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
	 * @return the pettyCashHdr
	 */
	public PettyCashHdr getPettyCashHdr() {
		return pettyCashHdr;
	}

	/**
	 * @return the pettCashDtl
	 */
	public PettyCashDtl getPettCashDtl() {
		return pettCashDtl;
	}

	/**
	 * @return the pettCashService
	 */
	public PettyCashService getPettCashService() {
		return pettCashService;
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
	 * @param pettyCashHdr the pettyCashHdr to set
	 */
	public void setPettyCashHdr(PettyCashHdr pettyCashHdr) {
		this.pettyCashHdr = pettyCashHdr;
	}

	/**
	 * @param pettCashDtl the pettCashDtl to set
	 */
	public void setPettCashDtl(PettyCashDtl pettCashDtl) {
		this.pettCashDtl = pettCashDtl;
	}

	/**
	 * @param pettCashService the pettCashService to set
	 */
	public void setPettCashService(PettyCashService pettCashService) {
		this.pettCashService = pettCashService;
	}

	public PettyCashAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}
	/**
	 * @return the mode
	 */
	public String getMode() {
		return mode;
	}
	/**
	 * @param mode the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

}
