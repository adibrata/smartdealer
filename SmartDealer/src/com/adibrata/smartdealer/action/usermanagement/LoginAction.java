package com.adibrata.smartdealer.action.usermanagement;


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
import com.adibrata.smartdealer.service.usermanagement.UserService;

public class LoginAction extends ActionSupport implements Preparable{

	/**
	 * 
	 */ 
	private static final long serialVersionUID = 1L;
	
	private String mode;
	private UserService userService;


	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	public String login(){
		if (mode!=null){
		if (mode.equals("home")){
			return "home";
			}
		}
		else{
		return "login";
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
