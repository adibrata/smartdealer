package com.adibrata.smartdealer.model;

// Generated Jul 7, 2015 12:58:23 PM by Hibernate Tools 4.3.1

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
 * ReturSalesHdr generated by hbm2java
 */
@Entity
@Table(name = "ReturSalesHdr", schema = "dbo", catalog = "SmartDealer")
public class ReturSalesHdr implements java.io.Serializable {

	private long id;
	private SalesOrderHdr salesOrderHdr;
	private String partnerCode;
	private Long officeId;
	private Date dtmUpd;
	private String usrUpd;
	private Date dtmCrt;
	private String usrCrt;
	private Set<ReturSalesDtl> returSalesDtls = new HashSet<ReturSalesDtl>(0);

	public ReturSalesHdr() {
	}

	public ReturSalesHdr(long id) {
		this.id = id;
	}

	public ReturSalesHdr(long id, SalesOrderHdr salesOrderHdr,
			String partnerCode, Long officeId, Date dtmUpd, String usrUpd,
			Date dtmCrt, String usrCrt, Set<ReturSalesDtl> returSalesDtls) {
		this.id = id;
		this.salesOrderHdr = salesOrderHdr;
		this.partnerCode = partnerCode;
		this.officeId = officeId;
		this.dtmUpd = dtmUpd;
		this.usrUpd = usrUpd;
		this.dtmCrt = dtmCrt;
		this.usrCrt = usrCrt;
		this.returSalesDtls = returSalesDtls;
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
	@JoinColumn(name = "SalesOrderHdrID")
	public SalesOrderHdr getSalesOrderHdr() {
		return this.salesOrderHdr;
	}

	public void setSalesOrderHdr(SalesOrderHdr salesOrderHdr) {
		this.salesOrderHdr = salesOrderHdr;
	}

	@Column(name = "PartnerCode", length = 20)
	public String getPartnerCode() {
		return this.partnerCode;
	}

	public void setPartnerCode(String partnerCode) {
		this.partnerCode = partnerCode;
	}

	@Column(name = "OfficeID")
	public Long getOfficeId() {
		return this.officeId;
	}

	public void setOfficeId(Long officeId) {
		this.officeId = officeId;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "returSalesHdr")
	public Set<ReturSalesDtl> getReturSalesDtls() {
		return this.returSalesDtls;
	}

	public void setReturSalesDtls(Set<ReturSalesDtl> returSalesDtls) {
		this.returSalesDtls = returSalesDtls;
	}

}
