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
import com.adibrata.smartdealer.service.setting.BankAccountService;

public class BankAccountAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String mode;
	private BankAccountService bankAccountService;
	private BankAccount bankaccount;
	private Partner partner;
	private Office office;
	private List<BankAccount> lstBankAccount;
	private List<MasterTable> lstBankMaster;

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the bankAccountService
	 */
	public BankAccountService getBankAccountService() {
		return bankAccountService;
	}

	/**
	 * @return the bankaccount
	 */
	public BankAccount getBankaccount() {
		return bankaccount;
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
	 * @return the lstBankAccount
	 */
	public List<BankAccount> getLstBankAccount() {
		return lstBankAccount;
	}

	/**
	 * @return the lstBankMaster
	 */
	public List<MasterTable> getLstBankMaster() {
		return lstBankMaster;
	}

	/**
	 * @param bankAccountService the bankAccountService to set
	 */
	public void setBankAccountService(BankAccountService bankAccountService) {
		this.bankAccountService = bankAccountService;
	}

	/**
	 * @param bankaccount the bankaccount to set
	 */
	public void setBankaccount(BankAccount bankaccount) {
		this.bankaccount = bankaccount;
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
	 * @param lstBankAccount the lstBankAccount to set
	 */
	public void setLstBankAccount(List<BankAccount> lstBankAccount) {
		this.lstBankAccount = lstBankAccount;
	}

	/**
	 * @param lstBankMaster the lstBankMaster to set
	 */
	public void setLstBankMaster(List<MasterTable> lstBankMaster) {
		this.lstBankMaster = lstBankMaster;
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
