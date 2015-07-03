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
import java.util.Date;
import java.util.List;

import util.adibrata.framework.dataaccess.HibernateHelper;
import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;

import com.adibrata.smartdealer.dao.setting.AssetDocMasterDao;
import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.sales.SalesOrderService;
import com.adibrata.smartdealer.service.setting.AssetDocMasterService;

public class AssetDocAction extends ActionSupport implements Preparable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String mode;

	private AssetDocMasterService assetDocMasterService;
	private AssetDocMaster assetDocMaster;
	private Partner partner;
	private Office office;
	private List<AssetDocMaster> lstAssetDocMasters;
	private String searchcriteria;
	private String searchvalue;
	private long id;

	private String documentCode;
	private String documentName;
	private String assetType;
	private String usrUpd;
	private String usrCrt;

	/**
	 * 
	 */
	public AssetDocAction() {
		Partner partner = new Partner();
		Office office = new Office();
		AssetDocMaster assetDocMaster = new AssetDocMaster();

		this.setPartner(partner);
		this.setOffice(office);
		this.setAssetDocMaster(assetDocMaster);

		// TODO Auto-generated constructor stub
	}

	public String execute() {
		String strMode;
		strMode = mode;

		if (mode != null) {
			switch (strMode) {
			case "search":
				return strMode;
			case "edit":
				return strMode;
			case "del":
				return SaveDelete();
			case "add":
				return SaveAdd();
			case "saveadd":
				return strMode;
			case "saveedit":
				return SaveEdit();
			case "back":
				return "search";
			default:
				return "failed";
			}
		}
		return strMode;
	}

	private List<AssetDocMaster> Paging() {

		return null;

	}

	private String SaveAdd() {
		String status = "";
		try {

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

	private String SaveEdit() {
		String status = "";
		try {
			AssetDocMaster assetDocMaster = new AssetDocMaster();
			assetDocMaster.setDocumentCode(this.getDocumentCode());
			assetDocMaster.setDocumentName(this.getDocumentName());

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

	private String SaveDelete() {
		String status = "";
		try {

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

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	/**
	 * @return the assetDocMasterService
	 */
	public AssetDocMasterService getAssetDocMasterService() {
		return assetDocMasterService;
	}

	/**
	 * @return the assetDocMaster
	 */
	public AssetDocMaster getAssetDocMaster() {
		return assetDocMaster;
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
	 * @return the lstassetAssetDocMasters
	 */
	public List<AssetDocMaster> getLstAssetDocMasters() {
		return lstAssetDocMasters;
	}

	/**
	 * @param assetDocMasterService
	 *            the assetDocMasterService to set
	 */
	public void setAssetDocMasterService(
			AssetDocMasterService assetDocMasterService) {
		this.assetDocMasterService = assetDocMasterService;
	}

	/**
	 * @param assetDocMaster
	 *            the assetDocMaster to set
	 */
	public void setAssetDocMaster(AssetDocMaster assetDocMaster) {
		this.assetDocMaster = assetDocMaster;
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
	 * @param lstassetAssetDocMasters
	 *            the lstassetAssetDocMasters to set
	 */
	public void setLstAssetDocMasters(List<AssetDocMaster> lstAssetDocMasters) {
		this.lstAssetDocMasters = lstAssetDocMasters;
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
	 * @param searchcriteria
	 *            the searchcriteria to set
	 */
	public void setSearchcriteria(String searchcriteria) {
		this.searchcriteria = searchcriteria;
	}

	/**
	 * @param searchvalue
	 *            the searchvalue to set
	 */
	public void setSearchvalue(String searchvalue) {
		this.searchvalue = searchvalue;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the documentCode
	 */
	public String getDocumentCode() {
		return documentCode;
	}

	/**
	 * @return the documentName
	 */
	public String getDocumentName() {
		return documentName;
	}

	/**
	 * @return the assetType
	 */
	public String getAssetType() {
		return assetType;
	}

	/**
	 * @return the usrUpd
	 */
	public String getUsrUpd() {
		return usrUpd;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}

	/**
	 * @param documentCode
	 *            the documentCode to set
	 */
	public void setDocumentCode(String documentCode) {
		this.documentCode = documentCode;
	}

	/**
	 * @param documentName
	 *            the documentName to set
	 */
	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	/**
	 * @param assetType
	 *            the assetType to set
	 */
	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	/**
	 * @param usrUpd
	 *            the usrUpd to set
	 */
	public void setUsrUpd(String usrUpd) {
		this.usrUpd = usrUpd;
	}

}
