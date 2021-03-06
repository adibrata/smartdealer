package com.adibrata.smartdealer.model;

// Generated Jul 15, 2015 5:19:07 PM by Hibernate Tools 4.3.1

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Taksasi generated by hbm2java
 */
@Entity
@Table(name = "Taksasi", schema = "dbo", catalog = "SmartDealer")
public class Taksasi implements java.io.Serializable {

	private long id;
	private Partner partner;
	private String assetMasterCode;
	private String taksasiCode;
	private String taksasiName;
	private BigDecimal taksasiPriceMin;
	private Short isActive;
	private Date dtmUpd;
	private String usrUpd;
	private Date dtmCrt;
	private String usrCrt;
	private Set<ServiceItem> serviceItems = new HashSet<ServiceItem>(0);

	public Taksasi() {
	}

	public Taksasi(long id) {
		this.id = id;
	}

	public Taksasi(long id, Partner partner, String assetMasterCode,
			String taksasiCode, String taksasiName, BigDecimal taksasiPriceMin,
			Short isActive, Date dtmUpd, String usrUpd, Date dtmCrt,
			String usrCrt, Set<ServiceItem> serviceItems) {
		this.id = id;
		this.partner = partner;
		this.assetMasterCode = assetMasterCode;
		this.taksasiCode = taksasiCode;
		this.taksasiName = taksasiName;
		this.taksasiPriceMin = taksasiPriceMin;
		this.isActive = isActive;
		this.dtmUpd = dtmUpd;
		this.usrUpd = usrUpd;
		this.dtmCrt = dtmCrt;
		this.usrCrt = usrCrt;
		this.serviceItems = serviceItems;
	}

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "Id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PartnerCode")
	public Partner getPartner() {
		return this.partner;
	}

	public void setPartner(Partner partner) {
		this.partner = partner;
	}

	@Column(name = "AssetMasterCode", length = 50)
	public String getAssetMasterCode() {
		return this.assetMasterCode;
	}

	public void setAssetMasterCode(String assetMasterCode) {
		this.assetMasterCode = assetMasterCode;
	}

	@Column(name = "TaksasiCode", length = 50)
	public String getTaksasiCode() {
		return this.taksasiCode;
	}

	public void setTaksasiCode(String taksasiCode) {
		this.taksasiCode = taksasiCode;
	}

	@Column(name = "TaksasiName", length = 100)
	public String getTaksasiName() {
		return this.taksasiName;
	}

	public void setTaksasiName(String taksasiName) {
		this.taksasiName = taksasiName;
	}

	@Column(name = "TaksasiPriceMin", precision = 17)
	public BigDecimal getTaksasiPriceMin() {
		return this.taksasiPriceMin;
	}

	public void setTaksasiPriceMin(BigDecimal taksasiPriceMin) {
		this.taksasiPriceMin = taksasiPriceMin;
	}

	@Column(name = "IsActive")
	public Short getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Short isActive) {
		this.isActive = isActive;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "taksasi")
	public Set<ServiceItem> getServiceItems() {
		return this.serviceItems;
	}

	public void setServiceItems(Set<ServiceItem> serviceItems) {
		this.serviceItems = serviceItems;
	}

}
