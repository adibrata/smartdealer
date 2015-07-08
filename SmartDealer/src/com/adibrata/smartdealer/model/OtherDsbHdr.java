package com.adibrata.smartdealer.model;

// Generated Jul 8, 2015 2:17:27 PM by Hibernate Tools 4.3.1

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
 * OtherDsbHdr generated by hbm2java
 */
@Entity
@Table(name = "OtherDsbHdr", schema = "dbo", catalog = "SmartDealer")
public class OtherDsbHdr implements java.io.Serializable {

	private long id;
	private Office office;
	private Partner partner;
	private String otherDisbNo;
	private BigDecimal disbAmount;
	private Date postingDate;
	private Date valueDate;
	private Long bankAccountId;
	private String refNo;
	private String notes;
	private String destination;
	private Long jobId;
	private Date dtmUpd;
	private String usrUpd;
	private Date dtmCrt;
	private String usrCrt;
	private Set<OtherDsbDtl> otherDsbDtls = new HashSet<OtherDsbDtl>(0);

	public OtherDsbHdr() {
	}

	public OtherDsbHdr(long id) {
		this.id = id;
	}

	public OtherDsbHdr(long id, Office office, Partner partner,
			String otherDisbNo, BigDecimal disbAmount, Date postingDate,
			Date valueDate, Long bankAccountId, String refNo, String notes,
			String destination, Long jobId, Date dtmUpd, String usrUpd,
			Date dtmCrt, String usrCrt, Set<OtherDsbDtl> otherDsbDtls) {
		this.id = id;
		this.office = office;
		this.partner = partner;
		this.otherDisbNo = otherDisbNo;
		this.disbAmount = disbAmount;
		this.postingDate = postingDate;
		this.valueDate = valueDate;
		this.bankAccountId = bankAccountId;
		this.refNo = refNo;
		this.notes = notes;
		this.destination = destination;
		this.jobId = jobId;
		this.dtmUpd = dtmUpd;
		this.usrUpd = usrUpd;
		this.dtmCrt = dtmCrt;
		this.usrCrt = usrCrt;
		this.otherDsbDtls = otherDsbDtls;
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

	@Column(name = "OtherDisbNo", length = 20)
	public String getOtherDisbNo() {
		return this.otherDisbNo;
	}

	public void setOtherDisbNo(String otherDisbNo) {
		this.otherDisbNo = otherDisbNo;
	}

	@Column(name = "DisbAmount", precision = 17)
	public BigDecimal getDisbAmount() {
		return this.disbAmount;
	}

	public void setDisbAmount(BigDecimal disbAmount) {
		this.disbAmount = disbAmount;
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

	@Column(name = "BankAccountID")
	public Long getBankAccountId() {
		return this.bankAccountId;
	}

	public void setBankAccountId(Long bankAccountId) {
		this.bankAccountId = bankAccountId;
	}

	@Column(name = "RefNo", length = 50)
	public String getRefNo() {
		return this.refNo;
	}

	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}

	@Column(name = "Notes", length = 8000)
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Column(name = "Destination", length = 50)
	public String getDestination() {
		return this.destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	@Column(name = "JobId")
	public Long getJobId() {
		return this.jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "otherDsbHdr")
	public Set<OtherDsbDtl> getOtherDsbDtls() {
		return this.otherDsbDtls;
	}

	public void setOtherDsbDtls(Set<OtherDsbDtl> otherDsbDtls) {
		this.otherDsbDtls = otherDsbDtls;
	}

}
