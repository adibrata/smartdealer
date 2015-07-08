package com.adibrata.smartdealer.model;

// Generated Jul 8, 2015 2:17:27 PM by Hibernate Tools 4.3.1

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
 * AdvanceCash generated by hbm2java
 */
@Entity
@Table(name = "AdvanceCash", schema = "dbo", catalog = "SmartDealer")
public class AdvanceCash implements java.io.Serializable {

	private long id;
	private BankAccount bankAccount;
	private Employee employee;
	private Office office;
	private Partner partner;
	private String advanceNo;
	private BigDecimal advanceAmount;
	private Date postingDate;
	private Date valueDate;
	private Date dtmUpd;
	private String usrUpd;
	private Date dtmCrt;
	private String usrCrt;

	public AdvanceCash() {
	}

	public AdvanceCash(long id) {
		this.id = id;
	}

	public AdvanceCash(long id, BankAccount bankAccount, Employee employee,
			Office office, Partner partner, String advanceNo,
			BigDecimal advanceAmount, Date postingDate, Date valueDate,
			Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt) {
		this.id = id;
		this.bankAccount = bankAccount;
		this.employee = employee;
		this.office = office;
		this.partner = partner;
		this.advanceNo = advanceNo;
		this.advanceAmount = advanceAmount;
		this.postingDate = postingDate;
		this.valueDate = valueDate;
		this.dtmUpd = dtmUpd;
		this.usrUpd = usrUpd;
		this.dtmCrt = dtmCrt;
		this.usrCrt = usrCrt;
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
	@JoinColumn(name = "BankAccountId")
	public BankAccount getBankAccount() {
		return this.bankAccount;
	}

	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EmployeeId")
	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
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

	@Column(name = "AdvanceNo", length = 50)
	public String getAdvanceNo() {
		return this.advanceNo;
	}

	public void setAdvanceNo(String advanceNo) {
		this.advanceNo = advanceNo;
	}

	@Column(name = "AdvanceAmount", precision = 17)
	public BigDecimal getAdvanceAmount() {
		return this.advanceAmount;
	}

	public void setAdvanceAmount(BigDecimal advanceAmount) {
		this.advanceAmount = advanceAmount;
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

}
