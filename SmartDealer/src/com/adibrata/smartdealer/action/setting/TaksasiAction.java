package com.adibrata.smartdealer.action.setting;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

public class TaksasiAction extends ActionSupport implements Preparable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String mode;

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	public String execute(){
		if (mode != null){
			if (mode.equals("search")){
				return "search";
			}
			if (mode.equals("edit")){
				return "edit";
			}
			if (mode.equals("hapus")){
				return "hapus";
			}
			if (mode.equals("add")){
				return "add";
			}
			if (mode.equals("save")){
				return "save";
			}
			if (mode.equals("save")){
				return "save";
			}
			if (mode.equals("back")){
				return "back";
			}
		}
		else{
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
