package com.adibrata.smartdealer.model;

// Generated Jul 3, 2015 10:35:01 PM by Hibernate Tools 4.3.1

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
 * ServiceDtl generated by hbm2java
 */
@Entity
@Table(name = "ServiceDtl", schema = "dbo", catalog = "SmartDealer")
public class ServiceDtl implements java.io.Serializable {

	private long id;
	private ServiceHdr serviceHdr;
	private String taksasiCode;
	private BigDecimal servicePrice;
	private Date dtmUpd;
	private String usrUpd;
	private Date dtmCrt;
	private String usrCrt;

	public ServiceDtl() {
	}

	public ServiceDtl(long id) {
		this.id = id;
	}

	public ServiceDtl(long id, ServiceHdr serviceHdr, String taksasiCode,
			BigDecimal servicePrice, Date dtmUpd, String usrUpd, Date dtmCrt,
			String usrCrt) {
		this.id = id;
		this.serviceHdr = serviceHdr;
		this.taksasiCode = taksasiCode;
		this.servicePrice = servicePrice;
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
	@JoinColumn(name = "ServiceHdrId")
	public ServiceHdr getServiceHdr() {
		return this.serviceHdr;
	}

	public void setServiceHdr(ServiceHdr serviceHdr) {
		this.serviceHdr = serviceHdr;
	}

	@Column(name = "TaksasiCode", length = 20)
	public String getTaksasiCode() {
		return this.taksasiCode;
	}

	public void setTaksasiCode(String taksasiCode) {
		this.taksasiCode = taksasiCode;
	}

	@Column(name = "ServicePrice", precision = 17)
	public BigDecimal getServicePrice() {
		return this.servicePrice;
	}

	public void setServicePrice(BigDecimal servicePrice) {
		this.servicePrice = servicePrice;
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
