package com.adibrata.smartdealer.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class BaseAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String messagedescription;

	public BaseAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}

	public static String ErrorMessage()
	{
		return "Failed on Save";
				
	}
	public static String SuccessMessage()
	{
		return "Success On Save";
				
	}
	/**
	 * @return the messagedescription
	 */
	public String getMessagedescription() {
		return messagedescription;
	}

	/**
	 * @param messagedescription
	 *            the messagedescription to set
	 */
	public void setMessagedescription(String messagedescription) {
		this.messagedescription = messagedescription;
	}

}
