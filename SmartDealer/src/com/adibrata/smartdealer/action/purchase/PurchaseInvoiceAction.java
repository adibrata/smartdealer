/**
 * 
 */
package com.adibrata.smartdealer.action.purchase;

/**
 * @author Henry
 *
 */

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
import com.adibrata.smartdealer.service.purchase.*;


public class PurchaseInvoiceAction extends ActionSupport implements Preparable{

	/**
	 * 
	 */
	private String mode;
	private PurchaseInvoiceService purchaseInvoiceService;
	
	public PurchaseInvoiceAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
