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
 * CashBankDtl generated by hbm2java
 */
@Entity
@Table(name = "CashBankDtl", schema = "dbo", catalog = "SmartDealer")
public class CashBankDtl implements java.io.Serializable {

	private long id;
	private CashBankHdr cashBankHdr;
	private Partner partner;
	private Integer departId;
	private String coaName;
	private String coaCode;
	private String description;
	private BigDecimal debitAmt;
	private BigDecimal creditAmt;
	private String usrUpd;
	private Date dtmUpd;
	private String usrCrt;
	private Date dtmCrt;

	public CashBankDtl() {
	}

	public CashBankDtl(long id, CashBankHdr cashBankHdr, String coaName,
			String coaCode, String description, BigDecimal debitAmt,
			BigDecimal creditAmt) {
		this.id = id;
		this.cashBankHdr = cashBankHdr;
		this.coaName = coaName;
		this.coaCode = coaCode;
		this.description = description;
		this.debitAmt = debitAmt;
		this.creditAmt = creditAmt;
	}

	public CashBankDtl(long id, CashBankHdr cashBankHdr, Partner partner,
			Integer departId, String coaName, String coaCode,
			String description, BigDecimal debitAmt, BigDecimal creditAmt,
			String usrUpd, Date dtmUpd, String usrCrt, Date dtmCrt) {
		this.id = id;
		this.cashBankHdr = cashBankHdr;
		this.partner = partner;
		this.departId = departId;
		this.coaName = coaName;
		this.coaCode = coaCode;
		this.description = description;
		this.debitAmt = debitAmt;
		this.creditAmt = creditAmt;
		this.usrUpd = usrUpd;
		this.dtmUpd = dtmUpd;
		this.usrCrt = usrCrt;
		this.dtmCrt = dtmCrt;
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
	@JoinColumn(name = "CashBankHdrID", nullable = false)
	public CashBankHdr getCashBankHdr() {
		return this.cashBankHdr;
	}

	public void setCashBankHdr(CashBankHdr cashBankHdr) {
		this.cashBankHdr = cashBankHdr;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PartnerCode")
	public Partner getPartner() {
		return this.partner;
	}

	public void setPartner(Partner partner) {
		this.partner = partner;
	}

	@Column(name = "DepartID")
	public Integer getDepartId() {
		return this.departId;
	}

	public void setDepartId(Integer departId) {
		this.departId = departId;
	}

	@Column(name = "CoaName", nullable = false, length = 50)
	public String getCoaName() {
		return this.coaName;
	}

	public void setCoaName(String coaName) {
		this.coaName = coaName;
	}

	@Column(name = "CoaCode", nullable = false, length = 50)
	public String getCoaCode() {
		return this.coaCode;
	}

	public void setCoaCode(String coaCode) {
		this.coaCode = coaCode;
	}

	@Column(name = "Description", nullable = false, length = 100)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "DebitAmt", nullable = false, precision = 17)
	public BigDecimal getDebitAmt() {
		return this.debitAmt;
	}

	public void setDebitAmt(BigDecimal debitAmt) {
		this.debitAmt = debitAmt;
	}

	@Column(name = "CreditAmt", nullable = false, precision = 17)
	public BigDecimal getCreditAmt() {
		return this.creditAmt;
	}

	public void setCreditAmt(BigDecimal creditAmt) {
		this.creditAmt = creditAmt;
	}

	@Column(name = "UsrUpd", length = 50)
	public String getUsrUpd() {
		return this.usrUpd;
	}

	public void setUsrUpd(String usrUpd) {
		this.usrUpd = usrUpd;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DtmUpd", length = 16)
	public Date getDtmUpd() {
		return this.dtmUpd;
	}

	public void setDtmUpd(Date dtmUpd) {
		this.dtmUpd = dtmUpd;
	}

	@Column(name = "UsrCrt", length = 50)
	public String getUsrCrt() {
		return this.usrCrt;
	}

	public void setUsrCrt(String usrCrt) {
		this.usrCrt = usrCrt;
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
