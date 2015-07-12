package com.adibrata.smartdealer.model;

// Generated Jul 13, 2015 12:13:05 AM by Hibernate Tools 4.3.1

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
 * Employee generated by hbm2java
 */
@Entity
@Table(name = "Employee", schema = "dbo", catalog = "SmartDealer")
public class Employee implements java.io.Serializable {

	private long id;
	private Office office;
	private Partner partner;
	private String employeeCode;
	private String employeeName;
	private String employeePosition;
	private byte[] signature;
	private Short isActive;
	private Date dtmUpd;
	private String usrUpd;
	private Date dtmCrt;
	private String usrCrt;
	private Set<PettyCashHdr> pettyCashHdrs = new HashSet<PettyCashHdr>(0);
	private Set<DanaTunai> danaTunais = new HashSet<DanaTunai>(0);
	private Set<AdvanceCash> advanceCashes = new HashSet<AdvanceCash>(0);
	private Set<SalesOrderHdr> salesOrderHdrs = new HashSet<SalesOrderHdr>(0);

	public Employee() {
	}

	public Employee(long id) {
		this.id = id;
	}

	public Employee(long id, Office office, Partner partner,
			String employeeCode, String employeeName, String employeePosition,
			byte[] signature, Short isActive, Date dtmUpd, String usrUpd,
			Date dtmCrt, String usrCrt, Set<PettyCashHdr> pettyCashHdrs,
			Set<DanaTunai> danaTunais, Set<AdvanceCash> advanceCashes,
			Set<SalesOrderHdr> salesOrderHdrs) {
		this.id = id;
		this.office = office;
		this.partner = partner;
		this.employeeCode = employeeCode;
		this.employeeName = employeeName;
		this.employeePosition = employeePosition;
		this.signature = signature;
		this.isActive = isActive;
		this.dtmUpd = dtmUpd;
		this.usrUpd = usrUpd;
		this.dtmCrt = dtmCrt;
		this.usrCrt = usrCrt;
		this.pettyCashHdrs = pettyCashHdrs;
		this.danaTunais = danaTunais;
		this.advanceCashes = advanceCashes;
		this.salesOrderHdrs = salesOrderHdrs;
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

	@Column(name = "EmployeeCode", length = 20)
	public String getEmployeeCode() {
		return this.employeeCode;
	}

	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}

	@Column(name = "EmployeeName", length = 50)
	public String getEmployeeName() {
		return this.employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Column(name = "EmployeePosition", length = 20)
	public String getEmployeePosition() {
		return this.employeePosition;
	}

	public void setEmployeePosition(String employeePosition) {
		this.employeePosition = employeePosition;
	}

	@Column(name = "Signature")
	public byte[] getSignature() {
		return this.signature;
	}

	public void setSignature(byte[] signature) {
		this.signature = signature;
	}

	@Column(name = "IsActive")
	public Short getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Short isActive) {
		this.isActive = isActive;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
	public Set<PettyCashHdr> getPettyCashHdrs() {
		return this.pettyCashHdrs;
	}

	public void setPettyCashHdrs(Set<PettyCashHdr> pettyCashHdrs) {
		this.pettyCashHdrs = pettyCashHdrs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
	public Set<DanaTunai> getDanaTunais() {
		return this.danaTunais;
	}

	public void setDanaTunais(Set<DanaTunai> danaTunais) {
		this.danaTunais = danaTunais;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
	public Set<AdvanceCash> getAdvanceCashes() {
		return this.advanceCashes;
	}

	public void setAdvanceCashes(Set<AdvanceCash> advanceCashes) {
		this.advanceCashes = advanceCashes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "employee")
	public Set<SalesOrderHdr> getSalesOrderHdrs() {
		return this.salesOrderHdrs;
	}

	public void setSalesOrderHdrs(Set<SalesOrderHdr> salesOrderHdrs) {
		this.salesOrderHdrs = salesOrderHdrs;
	}

}
