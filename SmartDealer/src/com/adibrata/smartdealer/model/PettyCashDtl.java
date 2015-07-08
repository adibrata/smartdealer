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
 * PettyCashDtl generated by hbm2java
 */
@Entity
@Table(name = "PettyCashDtl", schema = "dbo", catalog = "SmartDealer")
public class PettyCashDtl implements java.io.Serializable {

	private long id;
	private PettyCashHdr pettyCashHdr;
	private String description;
	private String coaName;
	private BigDecimal amount;
	private Date dtmUpd;
	private String usrUpd;
	private Date dtmCrt;
	private String usrCrt;

	public PettyCashDtl() {
	}

	public PettyCashDtl(long id) {
		this.id = id;
	}

	public PettyCashDtl(long id, PettyCashHdr pettyCashHdr, String description,
			String coaName, BigDecimal amount, Date dtmUpd, String usrUpd,
			Date dtmCrt, String usrCrt) {
		this.id = id;
		this.pettyCashHdr = pettyCashHdr;
		this.description = description;
		this.coaName = coaName;
		this.amount = amount;
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
	@JoinColumn(name = "PettyCashHdrId")
	public PettyCashHdr getPettyCashHdr() {
		return this.pettyCashHdr;
	}

	public void setPettyCashHdr(PettyCashHdr pettyCashHdr) {
		this.pettyCashHdr = pettyCashHdr;
	}

	@Column(name = "Description", length = 50)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "CoaName", length = 20)
	public String getCoaName() {
		return this.coaName;
	}

	public void setCoaName(String coaName) {
		this.coaName = coaName;
	}

	@Column(name = "Amount", precision = 17)
	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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
