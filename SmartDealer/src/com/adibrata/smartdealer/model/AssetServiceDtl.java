package com.adibrata.smartdealer.model;

// Generated Jul 3, 2015 10:35:01 PM by Hibernate Tools 4.3.1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AssetServiceDtl generated by hbm2java
 */
@Entity
@Table(name = "AssetServiceDtl", schema = "dbo", catalog = "SmartDealer")
public class AssetServiceDtl implements java.io.Serializable {

	private long id;
	private AssetServiceHdr assetServiceHdr;
	private AssetServiceMaster assetServiceMaster;
	private String serviceDescription;
	private BigDecimal servicePrice;
	private Date dtmUpd;
	private String usrUpd;
	private Date dtmCrt;
	private String usrCrt;

	public AssetServiceDtl() {
	}

	public AssetServiceDtl(long id) {
		this.id = id;
	}

	public AssetServiceDtl(long id, AssetServiceHdr assetServiceHdr,
			AssetServiceMaster assetServiceMaster, String serviceDescription,
			BigDecimal servicePrice, Date dtmUpd, String usrUpd, Date dtmCrt,
			String usrCrt) {
		this.id = id;
		this.assetServiceHdr = assetServiceHdr;
		this.assetServiceMaster = assetServiceMaster;
		this.serviceDescription = serviceDescription;
		this.servicePrice = servicePrice;
		this.dtmUpd = dtmUpd;
		this.usrUpd = usrUpd;
		this.dtmCrt = dtmCrt;
		this.usrCrt = usrCrt;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AssetServiceHdrID")
	public AssetServiceHdr getAssetServiceHdr() {
		return this.assetServiceHdr;
	}

	public void setAssetServiceHdr(AssetServiceHdr assetServiceHdr) {
		this.assetServiceHdr = assetServiceHdr;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AssetServiceMstID")
	public AssetServiceMaster getAssetServiceMaster() {
		return this.assetServiceMaster;
	}

	public void setAssetServiceMaster(AssetServiceMaster assetServiceMaster) {
		this.assetServiceMaster = assetServiceMaster;
	}

	@Column(name = "ServiceDescription", length = 8000)
	public String getServiceDescription() {
		return this.serviceDescription;
	}

	public void setServiceDescription(String serviceDescription) {
		this.serviceDescription = serviceDescription;
	}

	@Column(name = "ServicePrice", precision = 17)
	public BigDecimal getServicePrice() {
		return this.servicePrice;
	}

	public void setServicePrice(BigDecimal servicePrice) {
		this.servicePrice = servicePrice;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DtmUpd", length = 16)
	public Date getDtmUpd() {
		return this.dtmUpd;
	}

	public void setDtmUpd(Date dtmUpd) {
		this.dtmUpd = dtmUpd;
	}

	@Column(name = "UsrUpd", length = 50)
	public String getUsrUpd() {
		return this.usrUpd;
	}

	public void setUsrUpd(String usrUpd) {
		this.usrUpd = usrUpd;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DtmCrt", length = 16)
	public Date getDtmCrt() {
		return this.dtmCrt;
	}

	public void setDtmCrt(Date dtmCrt) {
		this.dtmCrt = dtmCrt;
	}

	@Column(name = "UsrCrt", length = 50)
	public String getUsrCrt() {
		return this.usrCrt;
	}

	public void setUsrCrt(String usrCrt) {
		this.usrCrt = usrCrt;
	}

}
