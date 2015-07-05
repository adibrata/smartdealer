package com.adibrata.smartdealer.model;

// Generated Jul 5, 2015 7:32:33 PM by Hibernate Tools 4.3.1

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
 * OtherRcvHdr generated by hbm2java
 */
@Entity
@Table(name = "OtherRcvHdr", schema = "dbo", catalog = "SmartDealer")
public class OtherRcvHdr implements java.io.Serializable {

	private long id;
	private Office office;
	private String partnerCode;
	private BigDecimal rcvAmount;
	private Date postingDate;
	private Date valueDate;
	private Long bankAccountId;
	private Date dtmUpd;
	private String usrUpd;
	private Date dtmCrt;
	private String usrCrt;
	private Set<OtherRcvDtl> otherRcvDtls = new HashSet<OtherRcvDtl>(0);

	public OtherRcvHdr() {
	}

	public OtherRcvHdr(long id) {
		this.id = id;
	}

	public OtherRcvHdr(long id, Office office, String partnerCode,
			BigDecimal rcvAmount, Date postingDate, Date valueDate,
			Long bankAccountId, Date dtmUpd, String usrUpd, Date dtmCrt,
			String usrCrt, Set<OtherRcvDtl> otherRcvDtls) {
		this.id = id;
		this.office = office;
		this.partnerCode = partnerCode;
		this.rcvAmount = rcvAmount;
		this.postingDate = postingDate;
		this.valueDate = valueDate;
		this.bankAccountId = bankAccountId;
		this.dtmUpd = dtmUpd;
		this.usrUpd = usrUpd;
		this.dtmCrt = dtmCrt;
		this.usrCrt = usrCrt;
		this.otherRcvDtls = otherRcvDtls;
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

	@Column(name = "PartnerCode", length = 20)
	public String getPartnerCode() {
		return this.partnerCode;
	}

	public void setPartnerCode(String partnerCode) {
		this.partnerCode = partnerCode;
	}

	@Column(name = "RcvAmount", precision = 17)
	public BigDecimal getRcvAmount() {
		return this.rcvAmount;
	}

	public void setRcvAmount(BigDecimal rcvAmount) {
		this.rcvAmount = rcvAmount;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "otherRcvHdr")
	public Set<OtherRcvDtl> getOtherRcvDtls() {
		return this.otherRcvDtls;
	}

	public void setOtherRcvDtls(Set<OtherRcvDtl> otherRcvDtls) {
		this.otherRcvDtls = otherRcvDtls;
	}

}
