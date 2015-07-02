package com.adibrata.smartdealer.action.usermanagement;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class LoginAction extends ActionSupport implements Preparable{

	/**
	 * 
	 */ 
	private static final long serialVersionUID = 1L;
	
	private String mode;

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
