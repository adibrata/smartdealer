package com.adibrata.smartdealer.model;

// Generated Jul 2, 2015 6:38:03 PM by Hibernate Tools 4.3.1

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
 * BankAccount generated by hbm2java
 */
@Entity
@Table(name = "BankAccount", schema = "dbo", catalog = "SmartDealer")
public class BankAccount implements java.io.Serializable {

	private long id;
	private Partner partner;
	private Long officeId;
	private String bankAccountCode;
	private String bankAccountName;
	private BigDecimal endingBalance;
	private String coacode;
	private Long seqNo;
	private Character resetFlag;
	private String formatSeqNo;
	private Date dtmUpd;
	private String usrUpd;
	private Date dtmCrt;
	private String usrCrt;
	private Set<PayReqHdr> payReqHdrs = new HashSet<PayReqHdr>(0);

	public BankAccount() {
	}

	public BankAccount(long id) {
		this.id = id;
	}

	public BankAccount(long id, Partner partner, Long officeId,
			String bankAccountCode, String bankAccountName,
			BigDecimal endingBalance, String coacode, Long seqNo,
			Character resetFlag, String formatSeqNo, Date dtmUpd,
			String usrUpd, Date dtmCrt, String usrCrt, Set<PayReqHdr> payReqHdrs) {
		this.id = id;
		this.partner = partner;
		this.officeId = officeId;
		this.bankAccountCode = bankAccountCode;
		this.bankAccountName = bankAccountName;
		this.endingBalance = endingBalance;
		this.coacode = coacode;
		this.seqNo = seqNo;
		this.resetFlag = resetFlag;
		this.formatSeqNo = formatSeqNo;
		this.dtmUpd = dtmUpd;
		this.usrUpd = usrUpd;
		this.dtmCrt = dtmCrt;
		this.usrCrt = usrCrt;
		this.payReqHdrs = payReqHdrs;
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

	@Column(name = "OfficeID")
	public Long getOfficeId() {
		return this.officeId;
	}

	public void setOfficeId(Long officeId) {
		this.officeId = officeId;
	}

	@Column(name = "BankAccountCode", length = 20)
	public String getBankAccountCode() {
		return this.bankAccountCode;
	}

	public void setBankAccountCode(String bankAccountCode) {
		this.bankAccountCode = bankAccountCode;
	}

	@Column(name = "BankAccountName", length = 50)
	public String getBankAccountName() {
		return this.bankAccountName;
	}

	public void setBankAccountName(String bankAccountName) {
		this.bankAccountName = bankAccountName;
	}

	@Column(name = "EndingBalance", precision = 17)
	public BigDecimal getEndingBalance() {
		return this.endingBalance;
	}

	public void setEndingBalance(BigDecimal endingBalance) {
		this.endingBalance = endingBalance;
	}

	@Column(name = "COACode", length = 50)
	public String getCoacode() {
		return this.coacode;
	}

	public void setCoacode(String coacode) {
		this.coacode = coacode;
	}

	@Column(name = "SeqNo")
	public Long getSeqNo() {
		return this.seqNo;
	}

	public void setSeqNo(Long seqNo) {
		this.seqNo = seqNo;
	}

	@Column(name = "ResetFlag", length = 1)
	public Character getResetFlag() {
		return this.resetFlag;
	}

	public void setResetFlag(Character resetFlag) {
		this.resetFlag = resetFlag;
	}

	@Column(name = "FormatSeqNo", length = 200)
	public String getFormatSeqNo() {
		return this.formatSeqNo;
	}

	public void setFormatSeqNo(String formatSeqNo) {
		this.formatSeqNo = formatSeqNo;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bankAccount")
	public Set<PayReqHdr> getPayReqHdrs() {
		return this.payReqHdrs;
	}

	public void setPayReqHdrs(Set<PayReqHdr> payReqHdrs) {
		this.payReqHdrs = payReqHdrs;
	}

}
