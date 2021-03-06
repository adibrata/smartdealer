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
 * EntrustHdr generated by hbm2java
 */
@Entity
@Table(name = "EntrustHdr", schema = "dbo", catalog = "SmartDealer")
public class EntrustHdr implements java.io.Serializable {

	private long id;
	private Office office;
	private Partner partner;
	private Supplier supplier;
	private String entrustNo;
	private Date postingDate;
	private Date valueDate;
	private Double totalAmount;
	private Date dtmUpd;
	private String usrUpd;
	private Date dtmCrt;
	private String usrCrt;
	private Set<EntrustDtl> entrustDtls = new HashSet<EntrustDtl>(0);

	public EntrustHdr() {
	}

	public EntrustHdr(long id) {
		this.id = id;
	}

	public EntrustHdr(long id, Office office, Partner partner,
			Supplier supplier, String entrustNo, Date postingDate,
			Date valueDate, Double totalAmount, Date dtmUpd, String usrUpd,
			Date dtmCrt, String usrCrt, Set<EntrustDtl> entrustDtls) {
		this.id = id;
		this.office = office;
		this.partner = partner;
		this.supplier = supplier;
		this.entrustNo = entrustNo;
		this.postingDate = postingDate;
		this.valueDate = valueDate;
		this.totalAmount = totalAmount;
		this.dtmUpd = dtmUpd;
		this.usrUpd = usrUpd;
		this.dtmCrt = dtmCrt;
		this.usrCrt = usrCrt;
		this.entrustDtls = entrustDtls;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SupplierId")
	public Supplier getSupplier() {
		return this.supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	@Column(name = "EntrustNo", length = 50)
	public String getEntrustNo() {
		return this.entrustNo;
	}

	public void setEntrustNo(String entrustNo) {
		this.entrustNo = entrustNo;
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

	@Column(name = "TotalAmount", precision = 53, scale = 0)
	public Double getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(Double totalAmount) {
		this.totalAmount = totalAmount;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "entrustHdr")
	public Set<EntrustDtl> getEntrustDtls() {
		return this.entrustDtls;
	}

	public void setEntrustDtls(Set<EntrustDtl> entrustDtls) {
		this.entrustDtls = entrustDtls;
	}

}
