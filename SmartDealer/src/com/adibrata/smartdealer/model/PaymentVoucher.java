package com.adibrata.smartdealer.model;

// Generated Jul 8, 2015 11:12:47 AM by Hibernate Tools 4.3.1

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
 * PaymentVoucher generated by hbm2java
 */
@Entity
@Table(name = "PaymentVoucher", schema = "dbo", catalog = "SmartDealer")
public class PaymentVoucher implements java.io.Serializable {

	private long id;
	private Office office;
	private Partner partner;
	private BigDecimal pvamount;
	private String pvstatus;
	private Long transJobId;
	private Date dtmUpd;
	private String usrUpd;
	private Date dtmCrt;
	private String usrCrt;

	public PaymentVoucher() {
	}

	public PaymentVoucher(long id) {
		this.id = id;
	}

	public PaymentVoucher(long id, Office office, Partner partner,
			BigDecimal pvamount, String pvstatus, Long transJobId, Date dtmUpd,
			String usrUpd, Date dtmCrt, String usrCrt) {
		this.id = id;
		this.office = office;
		this.partner = partner;
		this.pvamount = pvamount;
		this.pvstatus = pvstatus;
		this.transJobId = transJobId;
		this.dtmUpd = dtmUpd;
		this.usrUpd = usrUpd;
		this.dtmCrt = dtmCrt;
		this.usrCrt = usrCrt;
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
	@JoinColumn(name = "OfficeID")
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

	@Column(name = "PVAmount", precision = 17)
	public BigDecimal getPvamount() {
		return this.pvamount;
	}

	public void setPvamount(BigDecimal pvamount) {
		this.pvamount = pvamount;
	}

	@Column(name = "PVStatus", length = 5)
	public String getPvstatus() {
		return this.pvstatus;
	}

	public void setPvstatus(String pvstatus) {
		this.pvstatus = pvstatus;
	}

	@Column(name = "TransJobID")
	public Long getTransJobId() {
		return this.transJobId;
	}

	public void setTransJobId(Long transJobId) {
		this.transJobId = transJobId;
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
