/**
 * 
 */
package com.adibrata.smartdealer.action.accpay;

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

public class PaymentVoucherAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private String mode;
	private PVDisbursementService PVDisbursementService;
	private Partner partner;
	private Office office;
	private PaymentVoucher paymentVoucher;

	/**
	 * @return the mode
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * @return the pVDisbursementService
	 */
	public PVDisbursementService getPVDisbursementService() {
		return PVDisbursementService;
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
	 * @return the paymentVoucher
	 */
	public PaymentVoucher getPaymentVoucher() {
		return paymentVoucher;
	}

	/**
	 * @param mode the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * @param pVDisbursementService the pVDisbursementService to set
	 */
	public void setPVDisbursementService(PVDisbursementService pVDisbursementService) {
		PVDisbursementService = pVDisbursementService;
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
	 * @param paymentVoucher the paymentVoucher to set
	 */
	public void setPaymentVoucher(PaymentVoucher paymentVoucher) {
		this.paymentVoucher = paymentVoucher;
	}

	public PaymentVoucherAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}

}
