package com.adibrata.smartdealer.model;

// Generated Jul 3, 2015 10:35:01 PM by Hibernate Tools 4.3.1

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
 * CoaSchmDtl generated by hbm2java
 */
@Entity
@Table(name = "CoaSchmDtl", schema = "dbo", catalog = "SmartDealer")
public class CoaSchmDtl implements java.io.Serializable {

	private long id;
	private CoaSchmHdr coaSchmHdr;
	private Long coaMasterId;
	private String coacode;
	private Date dtmUpd;
	private String usrUpd;
	private Date dtmCrt;
	private String usrCrt;

	public CoaSchmDtl() {
	}

	public CoaSchmDtl(long id) {
		this.id = id;
	}

	public CoaSchmDtl(long id, CoaSchmHdr coaSchmHdr, Long coaMasterId,
			String coacode, Date dtmUpd, String usrUpd, Date dtmCrt,
			String usrCrt) {
		this.id = id;
		this.coaSchmHdr = coaSchmHdr;
		this.coaMasterId = coaMasterId;
		this.coacode = coacode;
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
	@JoinColumn(name = "CoaSchmHdrID")
	public CoaSchmHdr getCoaSchmHdr() {
		return this.coaSchmHdr;
	}

	public void setCoaSchmHdr(CoaSchmHdr coaSchmHdr) {
		this.coaSchmHdr = coaSchmHdr;
	}

	@Column(name = "CoaMasterID")
	public Long getCoaMasterId() {
		return this.coaMasterId;
	}

	public void setCoaMasterId(Long coaMasterId) {
		this.coaMasterId = coaMasterId;
	}

	@Column(name = "COACode", length = 50)
	public String getCoacode() {
		return this.coacode;
	}

	public void setCoacode(String coacode) {
		this.coacode = coacode;
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
