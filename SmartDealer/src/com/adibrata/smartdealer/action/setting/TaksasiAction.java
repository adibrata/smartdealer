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
import com.adibrata.smartdealer.service.setting.TaksasiService;

public class TaksasiAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String mode;
	private Taksasi taksasi;
	private TaksasiService taksasiService;
	private Partner partner;
	private Office office;
	private List<Taksasi> lstTaksasi;
	private String searchcriteria;
	private String searchvalue;
	private int pageNumber;
	private String usrUpd;
	private String usrCrt;
	private String message;
	private long id;
	
	private String assetMasterCode;
	private String taksasiCode;
	private String taksasiName;
	private double taksasiPriceMin;
	

	public String execute() {
		String strMode;
		strMode = mode;

		if (mode != null) {
			switch (strMode) {
			case "search":
				strMode = Paging();
			case "edit":

			case "del":
				return SaveDelete();
			case "add":

				strMode = SaveAdd();
			case "saveadd":
				strMode = SaveAdd();
			case "saveedit":
				strMode = SaveEdit();
			case "back":

			default:
				return "failed";
			}
		} else {
			strMode = "start";
		}
		return strMode;
	}

	private String Paging() {

		String status = "";
		try {
			String wherecond = "";
			if (this.getSearchcriteria().contains("%"))
				wherecond = this.getSearchvalue() + " like "
						+ this.getSearchcriteria();
			else
				wherecond = this.getSearchvalue() + " = "
						+ this.getSearchcriteria();

			this.lstTaksasi = this.taksasiService.Paging(
					this.getPageNumber(), wherecond, "");

			status = "Success";
		} catch (Exception exp) {
			status = "Failed";
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return status;
	}

	private String SaveAdd() {
		String status = "";
		try {
			Taksasi taksasi = new Taksasi();
			taksasi.setTaksasiCode(this.getTaksasiCode());
			taksasi.setTaksasiName(this.getTaksasiName());
			taksasi.setTaksasiPriceMin(this.getTaksasiPriceMin());
			
			this.taksasiService.SaveAdd(taksasi);
			status = SUCCESS;
		} catch (Exception exp) {
			status = ERROR;
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return status;
	}

	private String SaveEdit() {
		String status = "";
		try {
			Taksasi taksasi = new Taksasi();
			taksasi.setTaksasiCode(this.getTaksasiCode());
			taksasi.setTaksasiName(this.getTaksasiName());
			taksasi.setTaksasiPriceMin(this.getTaksasiPriceMin());
			
			this.taksasiService.SaveEdit(taksasi);
			status = SUCCESS;
		} catch (Exception exp) {
			status = ERROR;
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return status;
	}

	private String SaveDelete() {
		String status = "";
		try {
			Taksasi taksasi = new Taksasi();
			taksasi.setTaksasiCode(this.getTaksasiCode());
			taksasi.setTaksasiName(this.getTaksasiName());
			taksasi.setTaksasiPriceMin(this.getTaksasiPriceMin());
			
			this.taksasiService.SaveDel(taksasi);
			status = SUCCESS;
		} catch (Exception exp) {
			status = ERROR;
			ExceptionEntities lEntExp = new ExceptionEntities();
			lEntExp.setJavaClass(Thread.currentThread().getStackTrace()[1]
					.getClassName());
			lEntExp.setMethodName(Thread.currentThread().getStackTrace()[1]
					.getMethodName());
			ExceptionHelper.WriteException(lEntExp, exp);
		}
		return status;
	}
	
	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the taksasi
	 */
	public Taksasi getTaksasi() {
		return taksasi;
	}

	/**
	 * @return the taksasiService
	 */
	public TaksasiService getTaksasiService() {
		return taksasiService;
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
	 * @return the lstTaksasi
	 */
	public List<Taksasi> getLstTaksasi() {
		return lstTaksasi;
	}

	/**
	 * @param taksasi the taksasi to set
	 */
	public void setTaksasi(Taksasi taksasi) {
		this.taksasi = taksasi;
	}

	/**
	 * @param taksasiService the taksasiService to set
	 */
	public void setTaksasiService(TaksasiService taksasiService) {
		this.taksasiService = taksasiService;
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
	 * @param lstTaksasi the lstTaksasi to set
	 */
	public void setLstTaksasi(List<Taksasi> lstTaksasi) {
		this.lstTaksasi = lstTaksasi;
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}
	public String getMode() {
		return mode;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
	/**
	 * @return the searchcriteria
	 */
	public String getSearchcriteria() {
		return searchcriteria;
	}
	/**
	 * @return the searchvalue
	 */
	public String getSearchvalue() {
		return searchvalue;
	}
	/**
	 * @return the pageNumber
	 */
	public int getPageNumber() {
		return pageNumber;
	}
	/**
	 * @return the usrUpd
	 */
	public String getUsrUpd() {
		return usrUpd;
	}
	/**
	 * @return the usrCrt
	 */
	public String getUsrCrt() {
		return usrCrt;
	}
	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	/**
	 * @param searchcriteria the searchcriteria to set
	 */
	public void setSearchcriteria(String searchcriteria) {
		this.searchcriteria = searchcriteria;
	}
	/**
	 * @param searchvalue the searchvalue to set
	 */
	public void setSearchvalue(String searchvalue) {
		this.searchvalue = searchvalue;
	}
	/**
	 * @param pageNumber the pageNumber to set
	 */
	public void setPageNumber(int pageNumber) {
		this.pageNumber = pageNumber;
	}
	/**
	 * @param usrUpd the usrUpd to set
	 */
	public void setUsrUpd(String usrUpd) {
		this.usrUpd = usrUpd;
	}
	/**
	 * @param usrCrt the usrCrt to set
	 */
	public void setUsrCrt(String usrCrt) {
		this.usrCrt = usrCrt;
	}
	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @return the assetMasterCode
	 */
	public String getAssetMasterCode() {
		return assetMasterCode;
	}
	/**
	 * @return the taksasiCode
	 */
	public String getTaksasiCode() {
		return taksasiCode;
	}
	/**
	 * @return the taksasiName
	 */
	public String getTaksasiName() {
		return taksasiName;
	}
	/**
	 * @return the taksasiPriceMin
	 */
	public double getTaksasiPriceMin() {
		return taksasiPriceMin;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @param assetMasterCode the assetMasterCode to set
	 */
	public void setAssetMasterCode(String assetMasterCode) {
		this.assetMasterCode = assetMasterCode;
	}
	/**
	 * @param taksasiCode the taksasiCode to set
	 */
	public void setTaksasiCode(String taksasiCode) {
		this.taksasiCode = taksasiCode;
	}
	/**
	 * @param taksasiName the taksasiName to set
	 */
	public void setTaksasiName(String taksasiName) {
		this.taksasiName = taksasiName;
	}
	/**
	 * @param taksasiPriceMin the taksasiPriceMin to set
	 */
	public void setTaksasiPriceMin(double taksasiPriceMin) {
		this.taksasiPriceMin = taksasiPriceMin;
	}

}
