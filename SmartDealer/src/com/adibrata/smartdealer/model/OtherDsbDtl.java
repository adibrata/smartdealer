package com.adibrata.smartdealer.model;

// Generated Jul 10, 2015 3:33:50 PM by Hibernate Tools 4.3.1

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
 * OtherDsbDtl generated by hbm2java
 */
@Entity
@Table(name = "OtherDsbDtl", schema = "dbo", catalog = "SmartDealer")
public class OtherDsbDtl implements java.io.Serializable {

	private long id;
	private OtherDsbHdr otherDsbHdr;
	private String coaName;
	private String coaCode;
	private BigDecimal amount;
	private String description;
	private Date dtmUpd;
	private String usrUpd;
	private Date dtmCrt;
	private String usrCrt;

	public OtherDsbDtl() {
	}

	public OtherDsbDtl(long id) {
		this.id = id;
	}

	public OtherDsbDtl(long id, OtherDsbHdr otherDsbHdr, String coaName,
			String coaCode, BigDecimal amount, String description, Date dtmUpd,
			String usrUpd, Date dtmCrt, String usrCrt) {
		this.id = id;
		this.otherDsbHdr = otherDsbHdr;
		this.coaName = coaName;
		this.coaCode = coaCode;
		this.amount = amount;
		this.description = description;
		this.dtmUpd = dtmUpd;
		this.usrUpd = usrUpd;
		this.dtmCrt = dtmCrt;
		this.usrCrt = usrCrt;
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
	@JoinColumn(name = "OtherDsbHdrId")
	public OtherDsbHdr getOtherDsbHdr() {
		return this.otherDsbHdr;
	}

	public void setOtherDsbHdr(OtherDsbHdr otherDsbHdr) {
		this.otherDsbHdr = otherDsbHdr;
	}

	@Column(name = "CoaName", length = 50)
	public String getCoaName() {
		return this.coaName;
	}

	public void setCoaName(String coaName) {
		this.coaName = coaName;
	}

	@Column(name = "CoaCode", length = 50)
	public String getCoaCode() {
		return this.coaCode;
	}

	public void setCoaCode(String coaCode) {
		this.coaCode = coaCode;
	}

	@Column(name = "Amount", precision = 17)
	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Column(name = "Description", length = 100)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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

}
