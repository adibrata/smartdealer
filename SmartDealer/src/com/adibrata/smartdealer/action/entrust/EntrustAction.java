package com.adibrata.smartdealer.action.entrust;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class EntrustAction extends ActionSupport implements Preparable{

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private String mode;

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
	}

	public String order(){
		if (mode != null){
			if (mode.equals("search")){
				return "search";
			}
			if (mode.equals("entry")){
				return "entry";
			}
			if (mode.equals("add")){
				return "add";
			}
			if (mode.equals("delete")){
				return "delete";
			}
			if (mode.equals("save")){
				return "save";
			}
			if (mode.equals("back")){
				return "back";
			}
		}
		else{
			return "paging";
		}
		return mode;
	}

	public String receive(){
		if (mode != null){
			if (mode.equals("search")){
				return "search";
			}
			if (mode.equals("entry")){
				return "entry";
			}
			if (mode.equals("add")){
				return "add";
			}
			if (mode.equals("delete")){
				return "delete";
			}
			if (mode.equals("save")){
				return "save";
			}
			if (mode.equals("back")){
				return "back";
			}
		}
		else{
			return "paging";
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
