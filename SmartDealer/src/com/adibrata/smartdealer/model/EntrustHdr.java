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
 * EntrustHdr generated by hbm2java
 */
@Entity
@Table(name = "EntrustHdr", schema = "dbo", catalog = "SmartDealer")
public class EntrustHdr implements java.io.Serializable {

	private long id;
	private Partner partner;
	private Long officeId;
	private Long daelerIdto;
	private String entrustNo;
	private Date entrustDate;
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

	public EntrustHdr(long id, Partner partner, Long officeId, Long daelerIdto,
			String entrustNo, Date entrustDate, Date dtmUpd, String usrUpd,
			Date dtmCrt, String usrCrt, Set<EntrustDtl> entrustDtls) {
		this.id = id;
		this.partner = partner;
		this.officeId = officeId;
		this.daelerIdto = daelerIdto;
		this.entrustNo = entrustNo;
		this.entrustDate = entrustDate;
		this.dtmUpd = dtmUpd;
		this.usrUpd = usrUpd;
		this.dtmCrt = dtmCrt;
		this.usrCrt = usrCrt;
		this.entrustDtls = entrustDtls;
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

	@Column(name = "DaelerIDTo")
	public Long getDaelerIdto() {
		return this.daelerIdto;
	}

	public void setDaelerIdto(Long daelerIdto) {
		this.daelerIdto = daelerIdto;
	}

	@Column(name = "EntrustNo", length = 50)
	public String getEntrustNo() {
		return this.entrustNo;
	}

	public void setEntrustNo(String entrustNo) {
		this.entrustNo = entrustNo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "EntrustDate", length = 23)
	public Date getEntrustDate() {
		return this.entrustDate;
	}

	public void setEntrustDate(Date entrustDate) {
		this.entrustDate = entrustDate;
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
