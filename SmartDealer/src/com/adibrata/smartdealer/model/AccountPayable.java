package com.adibrata.smartdealer.model;

// Generated Jul 5, 2015 7:32:33 PM by Hibernate Tools 4.3.1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * AccountPayable generated by hbm2java
 */
@Entity
@Table(name = "AccountPayable", schema = "dbo", catalog = "SmartDealer")
public class AccountPayable implements java.io.Serializable {

	private long id;
	private Office officeByOfficeId;
	private Office officeByOfficeDisbId;
	private Partner partner;
	private String apno;
	private String aptype;
	private String apstatus;
	private BigDecimal apamount;
	private BigDecimal apdisburse;
	private String apto;
	private String apaccount;
	private String usrCrt;
	private Date dtmUpd;
	private String usrUpd;
	private Date dtmCrt;

	public AccountPayable() {
	}

	public AccountPayable(long id) {
		this.id = id;
	}

	public AccountPayable(long id, Office officeByOfficeId,
			Office officeByOfficeDisbId, Partner partner, String apno,
			String aptype, String apstatus, BigDecimal apamount,
			BigDecimal apdisburse, String apto, String apaccount,
			String usrCrt, Date dtmUpd, String usrUpd, Date dtmCrt) {
		this.id = id;
		this.officeByOfficeId = officeByOfficeId;
		this.officeByOfficeDisbId = officeByOfficeDisbId;
		this.partner = partner;
		this.apno = apno;
		this.aptype = aptype;
		this.apstatus = apstatus;
		this.apamount = apamount;
		this.apdisburse = apdisburse;
		this.apto = apto;
		this.apaccount = apaccount;
		this.usrCrt = usrCrt;
		this.dtmUpd = dtmUpd;
		this.usrUpd = usrUpd;
		this.dtmCrt = dtmCrt;
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
	@JoinColumn(name = "OfficeId")
	public Office getOfficeByOfficeId() {
		return this.officeByOfficeId;
	}

	public void setOfficeByOfficeId(Office officeByOfficeId) {
		this.officeByOfficeId = officeByOfficeId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "OfficeDisbId")
	public Office getOfficeByOfficeDisbId() {
		return this.officeByOfficeDisbId;
	}

	public void setOfficeByOfficeDisbId(Office officeByOfficeDisbId) {
		this.officeByOfficeDisbId = officeByOfficeDisbId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PartnerCode")
	public Partner getPartner() {
		return this.partner;
	}

	public void setPartner(Partner partner) {
		this.partner = partner;
	}

	@Column(name = "APNo", length = 50)
	public String getApno() {
		return this.apno;
	}

	public void setApno(String apno) {
		this.apno = apno;
	}

	@Column(name = "APType", length = 5)
	public String getAptype() {
		return this.aptype;
	}

	public void setAptype(String aptype) {
		this.aptype = aptype;
	}

	@Column(name = "APStatus", length = 2)
	public String getApstatus() {
		return this.apstatus;
	}

	public void setApstatus(String apstatus) {
		this.apstatus = apstatus;
	}

	@Column(name = "APAmount", precision = 17)
	public BigDecimal getApamount() {
		return this.apamount;
	}

	public void setApamount(BigDecimal apamount) {
		this.apamount = apamount;
	}

	@Column(name = "APDisburse", precision = 17)
	public BigDecimal getApdisburse() {
		return this.apdisburse;
	}

	public void setApdisburse(BigDecimal apdisburse) {
		this.apdisburse = apdisburse;
	}

	@Column(name = "APTo", length = 100)
	public String getApto() {
		return this.apto;
	}

	public void setApto(String apto) {
		this.apto = apto;
	}

	@Column(name = "APAccount", length = 100)
	public String getApaccount() {
		return this.apaccount;
	}

	public void setApaccount(String apaccount) {
		this.apaccount = apaccount;
	}

	@Column(name = "UsrCrt", length = 50)
	public String getUsrCrt() {
		return this.usrCrt;
	}

	public void setUsrCrt(String usrCrt) {
		this.usrCrt = usrCrt;
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

}
