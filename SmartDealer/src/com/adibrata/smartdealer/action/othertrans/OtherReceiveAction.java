package com.adibrata.smartdealer.action.othertrans;


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
import com.adibrata.smartdealer.service.accpay.PVDisbursementService;
import com.adibrata.smartdealer.service.othertransactions.OtherReceiveService;


public class OtherReceiveAction extends ActionSupport implements Preparable {

	private String mode;
	private OtherReceiveService otjOtherReceiveService;
	private Partner partner;
	private Office office;
	private OtherRcvHdr otherRcvHdr;
	private OtherRcvDtl otherRcvDtl;
	private List<OtherRcvHdr> lstOtherRcvHdr;
	private List<OtherRcvDtl> lstOtherRcvDtl;

	/**
	 * @return the mode
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * @return the otjOtherReceiveService
	 */
	public OtherReceiveService getOtjOtherReceiveService() {
		return otjOtherReceiveService;
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
	 * @return the otherRcvHdr
	 */
	public OtherRcvHdr getOtherRcvHdr() {
		return otherRcvHdr;
	}

	/**
	 * @return the otherRcvDtl
	 */
	public OtherRcvDtl getOtherRcvDtl() {
		return otherRcvDtl;
	}

	/**
	 * @return the lstOtherRcvHdr
	 */
	public List<OtherRcvHdr> getLstOtherRcvHdr() {
		return lstOtherRcvHdr;
	}

	/**
	 * @return the lstOtherRcvDtl
	 */
	public List<OtherRcvDtl> getLstOtherRcvDtl() {
		return lstOtherRcvDtl;
	}

	/**
	 * @param mode the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * @param otjOtherReceiveService the otjOtherReceiveService to set
	 */
	public void setOtjOtherReceiveService(OtherReceiveService otjOtherReceiveService) {
		this.otjOtherReceiveService = otjOtherReceiveService;
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
	 * @param otherRcvHdr the otherRcvHdr to set
	 */
	public void setOtherRcvHdr(OtherRcvHdr otherRcvHdr) {
		this.otherRcvHdr = otherRcvHdr;
	}

	/**
	 * @param otherRcvDtl the otherRcvDtl to set
	 */
	public void setOtherRcvDtl(OtherRcvDtl otherRcvDtl) {
		this.otherRcvDtl = otherRcvDtl;
	}

	/**
	 * @param lstOtherRcvHdr the lstOtherRcvHdr to set
	 */
	public void setLstOtherRcvHdr(List<OtherRcvHdr> lstOtherRcvHdr) {
		this.lstOtherRcvHdr = lstOtherRcvHdr;
	}

	/**
	 * @param lstOtherRcvDtl the lstOtherRcvDtl to set
	 */
	public void setLstOtherRcvDtl(List<OtherRcvDtl> lstOtherRcvDtl) {
		this.lstOtherRcvDtl = lstOtherRcvDtl;
	}

	public OtherReceiveAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
