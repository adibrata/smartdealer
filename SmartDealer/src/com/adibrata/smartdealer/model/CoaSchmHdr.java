package com.adibrata.smartdealer.model;

// Generated Jul 15, 2015 5:19:07 PM by Hibernate Tools 4.3.1

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
 * CoaSchmHdr generated by hbm2java
 */
@Entity
@Table(name = "CoaSchmHdr", schema = "dbo", catalog = "SmartDealer")
public class CoaSchmHdr implements java.io.Serializable {

	private long id;
	private Partner partner;
	private String coaSchmCode;
	private String coaSchmDesc;
	private Integer isActive;
	private Date dtmUpd;
	private String usrUpd;
	private Date dtmCrt;
	private String usrCrt;
	private Set<CoaSchmDtl> coaSchmDtls = new HashSet<CoaSchmDtl>(0);
	private Set<ReturSalesHdr> returSalesHdrs = new HashSet<ReturSalesHdr>(0);
	private Set<SalesOrderHdr> salesOrderHdrs = new HashSet<SalesOrderHdr>(0);

	public CoaSchmHdr() {
	}

	public CoaSchmHdr(long id) {
		this.id = id;
	}

	public CoaSchmHdr(long id, Partner partner, String coaSchmCode,
			String coaSchmDesc, Integer isActive, Date dtmUpd, String usrUpd,
			Date dtmCrt, String usrCrt, Set<CoaSchmDtl> coaSchmDtls,
			Set<ReturSalesHdr> returSalesHdrs, Set<SalesOrderHdr> salesOrderHdrs) {
		this.id = id;
		this.partner = partner;
		this.coaSchmCode = coaSchmCode;
		this.coaSchmDesc = coaSchmDesc;
		this.isActive = isActive;
		this.dtmUpd = dtmUpd;
		this.usrUpd = usrUpd;
		this.dtmCrt = dtmCrt;
		this.usrCrt = usrCrt;
		this.coaSchmDtls = coaSchmDtls;
		this.returSalesHdrs = returSalesHdrs;
		this.salesOrderHdrs = salesOrderHdrs;
	}

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
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

	@Column(name = "CoaSchmCode", length = 50)
	public String getCoaSchmCode() {
		return this.coaSchmCode;
	}

	public void setCoaSchmCode(String coaSchmCode) {
		this.coaSchmCode = coaSchmCode;
	}

	@Column(name = "CoaSchmDesc", length = 50)
	public String getCoaSchmDesc() {
		return this.coaSchmDesc;
	}

	public void setCoaSchmDesc(String coaSchmDesc) {
		this.coaSchmDesc = coaSchmDesc;
	}

	@Column(name = "IsActive")
	public Integer getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Integer isActive) {
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "coaSchmHdr")
	public Set<CoaSchmDtl> getCoaSchmDtls() {
		return this.coaSchmDtls;
	}

	public void setCoaSchmDtls(Set<CoaSchmDtl> coaSchmDtls) {
		this.coaSchmDtls = coaSchmDtls;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "coaSchmHdr")
	public Set<ReturSalesHdr> getReturSalesHdrs() {
		return this.returSalesHdrs;
	}

	public void setReturSalesHdrs(Set<ReturSalesHdr> returSalesHdrs) {
		this.returSalesHdrs = returSalesHdrs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "coaSchmHdr")
	public Set<SalesOrderHdr> getSalesOrderHdrs() {
		return this.salesOrderHdrs;
	}

	public void setSalesOrderHdrs(Set<SalesOrderHdr> salesOrderHdrs) {
		this.salesOrderHdrs = salesOrderHdrs;
	}

}
