package com.adibrata.smartdealer.model;

// Generated Jul 8, 2015 1:59:39 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * ServiceHdr generated by hbm2java
 */
@Entity
@Table(name = "ServiceHdr", schema = "dbo", catalog = "SmartDealer")
public class ServiceHdr implements java.io.Serializable {

	private long id;
	private AssetMaster assetMaster;
	private Office office;
	private Partner partner;
	private Workshop workshop;
	private String serviceNo;
	private Date postingDate;
	private Date valueDate;
	private Date dtmUpd;
	private String usrUpd;
	private Date dtmCrt;
	private String usrCrt;
	private Set<ServiceDtl> serviceDtls = new HashSet<ServiceDtl>(0);

	public ServiceHdr() {
	}

	public ServiceHdr(long id) {
		this.id = id;
	}

	public ServiceHdr(long id, AssetMaster assetMaster, Office office,
			Partner partner, Workshop workshop, String serviceNo,
			Date postingDate, Date valueDate, Date dtmUpd, String usrUpd,
			Date dtmCrt, String usrCrt, Set<ServiceDtl> serviceDtls) {
		this.id = id;
		this.assetMaster = assetMaster;
		this.office = office;
		this.partner = partner;
		this.workshop = workshop;
		this.serviceNo = serviceNo;
		this.postingDate = postingDate;
		this.valueDate = valueDate;
		this.dtmUpd = dtmUpd;
		this.usrUpd = usrUpd;
		this.dtmCrt = dtmCrt;
		this.usrCrt = usrCrt;
		this.serviceDtls = serviceDtls;
	}

	@Id
	@Column(name = "Id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "AssetMasterId")
	public AssetMaster getAssetMaster() {
		return this.assetMaster;
	}

	public void setAssetMaster(AssetMaster assetMaster) {
		this.assetMaster = assetMaster;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "OfficeId")
	public Office getOffice() {
		return this.office;
	}

	public void setOffice(Office office) {
		this.office = office;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PartnerCode")
	public Partner getPartner() {
		return this.partner;
	}

	public void setPartner(Partner partner) {
		this.partner = partner;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "WorkshopId")
	public Workshop getWorkshop() {
		return this.workshop;
	}

	public void setWorkshop(Workshop workshop) {
		this.workshop = workshop;
	}

	@Column(name = "ServiceNo", length = 50)
	public String getServiceNo() {
		return this.serviceNo;
	}

	public void setServiceNo(String serviceNo) {
		this.serviceNo = serviceNo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PostingDate", length = 23)
	public Date getPostingDate() {
		return this.postingDate;
	}

	public void setPostingDate(Date postingDate) {
		this.postingDate = postingDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ValueDate", length = 23)
	public Date getValueDate() {
		return this.valueDate;
	}

	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "serviceHdr")
	public Set<ServiceDtl> getServiceDtls() {
		return this.serviceDtls;
	}

	public void setServiceDtls(Set<ServiceDtl> serviceDtls) {
		this.serviceDtls = serviceDtls;
	}

}
