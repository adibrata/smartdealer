package com.adibrata.smartdealer.model;

// Generated Jul 8, 2015 11:12:47 AM by Hibernate Tools 4.3.1

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
 * Coamaster generated by hbm2java
 */
@Entity
@Table(name = "COAMaster", schema = "dbo", catalog = "SmartDealer")
public class Coamaster implements java.io.Serializable {

	private long id;
	private Partner partner;
	private String coaName;
	private String coaDescription;
	private String coacode;
	private Integer isSystem;
	private Integer isActive;
	private Date dtmUpd;
	private String usrUpd;
	private Date dtmCrt;
	private String usrCrt;

	public Coamaster() {
	}

	public Coamaster(long id) {
		this.id = id;
	}

	public Coamaster(long id, Partner partner, String coaName,
			String coaDescription, String coacode, Integer isSystem,
			Integer isActive, Date dtmUpd, String usrUpd, Date dtmCrt,
			String usrCrt) {
		this.id = id;
		this.partner = partner;
		this.coaName = coaName;
		this.coaDescription = coaDescription;
		this.coacode = coacode;
		this.isSystem = isSystem;
		this.isActive = isActive;
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
	@JoinColumn(name = "PartnerCode")
	public Partner getPartner() {
		return this.partner;
	}

	public void setPartner(Partner partner) {
		this.partner = partner;
	}

	@Column(name = "CoaName", length = 20)
	public String getCoaName() {
		return this.coaName;
	}

	public void setCoaName(String coaName) {
		this.coaName = coaName;
	}

	@Column(name = "CoaDescription", length = 50)
	public String getCoaDescription() {
		return this.coaDescription;
	}

	public void setCoaDescription(String coaDescription) {
		this.coaDescription = coaDescription;
	}

	@Column(name = "COACode", length = 50)
	public String getCoacode() {
		return this.coacode;
	}

	public void setCoacode(String coacode) {
		this.coacode = coacode;
	}

	@Column(name = "IsSystem")
	public Integer getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(Integer isSystem) {
		this.isSystem = isSystem;
	}

	@Column(name = "IsActive")
	public Integer getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Integer isActive) {
		this.isActive = isActive;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DtmUpd", length = 23)
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
	@Column(name = "DtmCrt", length = 23)
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
