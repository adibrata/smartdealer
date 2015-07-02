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
import com.adibrata.smartdealer.service.cashtransactions.PaymentRequestService;

public class PaymentRequestAction extends ActionSupport implements Preparable {
	private String mode;
	private PaymentRequestService paymentRequestService;
	private Partner partner;
	private Office office;
	private PayReqHdr payReqHdr;
	private PayReqDtl payReqDtl;

	/**
	 * @return the mode
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * @return the paymentRequestService
	 */
	public PaymentRequestService getPaymentRequestService() {
		return paymentRequestService;
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
	 * @return the payReqHdr
	 */
	public PayReqHdr getPayReqHdr() {
		return payReqHdr;
	}

	/**
	 * @return the payReqDtl
	 */
	public PayReqDtl getPayReqDtl() {
		return payReqDtl;
	}

	/**
	 * @param mode the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * @param paymentRequestService the paymentRequestService to set
	 */
	public void setPaymentRequestService(PaymentRequestService paymentRequestService) {
		this.paymentRequestService = paymentRequestService;
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
	 * @param payReqHdr the payReqHdr to set
	 */
	public void setPayReqHdr(PayReqHdr payReqHdr) {
		this.payReqHdr = payReqHdr;
	}

	/**
	 * @param payReqDtl the payReqDtl to set
	 */
	public void setPayReqDtl(PayReqDtl payReqDtl) {
		this.payReqDtl = payReqDtl;
	}

	public PaymentRequestAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}

}
