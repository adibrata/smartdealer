/**
 * 
 */
package com.adibrata.smartdealer.action.accpay;

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
import com.adibrata.smartdealer.service.accpay.SelectionService;

/**
 * @author Henry
 *
 */
public class AccPayAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private String mode;
	private SelectionService selectionService;
	private Partner partner;
	private Office office;
	private List<AccountPayable> lstAccountPayable;

	/**
	 * @return the mode
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * @return the selectionService
	 */
	public SelectionService getSelectionService() {
		return selectionService;
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
	 * @return the lstAccountPayable
	 */
	public List<AccountPayable> getLstAccountPayable() {
		return lstAccountPayable;
	}

	/**
	 * @param mode the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * @param selectionService the selectionService to set
	 */
	public void setSelectionService(SelectionService selectionService) {
		this.selectionService = selectionService;
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
	 * @param lstAccountPayable the lstAccountPayable to set
	 */
	public void setLstAccountPayable(List<AccountPayable> lstAccountPayable) {
		this.lstAccountPayable = lstAccountPayable;
	}

	public AccPayAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}

}
