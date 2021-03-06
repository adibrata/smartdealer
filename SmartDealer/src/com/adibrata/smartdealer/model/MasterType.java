package com.adibrata.smartdealer.model;

// Generated Jul 15, 2015 5:19:07 PM by Hibernate Tools 4.3.1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * MasterType generated by hbm2java
 */
@Entity
@Table(name = "MasterType", schema = "dbo", catalog = "SmartDealer", uniqueConstraints = @UniqueConstraint(columnNames = "MasterTypeCode"))
public class MasterType implements java.io.Serializable {

	private long id;
	private String masterTypeCode;
	private Date dtmUpd;
	private String usrUpd;
	private Date dtmCrt;
	private String usrCrt;
	private Set<MasterTable> masterTables = new HashSet<MasterTable>(0);

	public MasterType() {
	}

	public MasterType(long id) {
		this.id = id;
	}

	public MasterType(long id, String masterTypeCode, Date dtmUpd,
			String usrUpd, Date dtmCrt, String usrCrt,
			Set<MasterTable> masterTables) {
		this.id = id;
		this.masterTypeCode = masterTypeCode;
		this.dtmUpd = dtmUpd;
		this.usrUpd = usrUpd;
		this.dtmCrt = dtmCrt;
		this.usrCrt = usrCrt;
		this.masterTables = masterTables;
	}

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "MasterTypeCode", unique = true, length = 20)
	public String getMasterTypeCode() {
		return this.masterTypeCode;
	}

	public void setMasterTypeCode(String masterTypeCode) {
		this.masterTypeCode = masterTypeCode;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "masterType")
	public Set<MasterTable> getMasterTables() {
		return this.masterTables;
	}

	public void setMasterTables(Set<MasterTable> masterTables) {
		this.masterTables = masterTables;
	}

}
