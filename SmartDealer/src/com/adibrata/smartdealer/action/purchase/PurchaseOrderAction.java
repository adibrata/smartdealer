package com.adibrata.smartdealer.action.purchase;

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
import com.adibrata.smartdealer.service.purchase.PurchaseInvoiceService;
import com.adibrata.smartdealer.service.purchase.PurchaseOrderService;

public class PurchaseOrderAction extends ActionSupport implements Preparable {

	/**
	 *
	 */

	private static final long serialVersionUID = 1L;
	private Partner partner;
	private Office office;

	private String mode;
	private PurchaseOrderService purchaseOrderService;

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
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
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
	 * @return the purchaseOrderService
	 */
	public PurchaseOrderService getPurchaseOrderService() {
		return purchaseOrderService;
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
	 * @param purchaseOrderService
	 *            the purchaseOrderService to set
	 */
	public void setPurchaseOrderService(
			PurchaseOrderService purchaseOrderService) {
		this.purchaseOrderService = purchaseOrderService;
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}

	public String order() {
		if (mode != null) {
			if (mode.equals("search")) {
				return "search";
			}
			if (mode.equals("entry")) {
				return "entry";
			}
			if (mode.equals("add")) {
				return "add";
			}
			if (mode.equals("del")) {
				return "del";
			}
			if (mode.equals("save")) {
				return "save";
			}
			if (mode.equals("back")) {
				return "back";
			}
		} else {
			return "start";
		}
		return mode;
	}

	public String receive() {
		if (mode != null) {
			if (mode.equals("search")) {
				return "search";
			}
			if (mode.equals("entry")) {
				return "entry";
			}
		} else {
			return "start";
		}
		return mode;
	}

	public String retur() {
		if (mode != null) {
			if (mode.equals("search")) {
				return "search";
			}
			if (mode.equals("entry")) {
				return "entry";
			}
			if (mode.equals("add")) {
				return "add";
			}
			if (mode.equals("del")) {
				return "del";
			}
			if (mode.equals("save")) {
				return "save";
			}
			if (mode.equals("back")) {
				return "back";
			}
		} else {
			return "start";
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
