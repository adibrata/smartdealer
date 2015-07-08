package com.adibrata.smartdealer.model;

// Generated Jul 8, 2015 11:12:47 AM by Hibernate Tools 4.3.1

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

/**
 * Leasing generated by hbm2java
 */
@Entity
@Table(name = "Leasing", schema = "dbo", catalog = "SmartDealer")
public class Leasing implements java.io.Serializable {

	private long id;
	private String leasingCode;
	private String name;
	private String address;
	private String rt;
	private String rw;
	private String kelurahan;
	private String kecamatan;
	private String city;
	private String zipCode;
	private String usrCrt;
	private Date dtmUpd;
	private String usrUpd;
	private Date dtmCrt;
	private Set<SalesOrderHdr> salesOrderHdrs = new HashSet<SalesOrderHdr>(0);
	private Set<DanaTunai> danaTunais = new HashSet<DanaTunai>(0);

	public Leasing() {
	}

	public Leasing(long id) {
		this.id = id;
	}

	public Leasing(long id, String leasingCode, String name, String address,
			String rt, String rw, String kelurahan, String kecamatan,
			String city, String zipCode, String usrCrt, Date dtmUpd,
			String usrUpd, Date dtmCrt, Set<SalesOrderHdr> salesOrderHdrs,
			Set<DanaTunai> danaTunais) {
		this.id = id;
		this.leasingCode = leasingCode;
		this.name = name;
		this.address = address;
		this.rt = rt;
		this.rw = rw;
		this.kelurahan = kelurahan;
		this.kecamatan = kecamatan;
		this.city = city;
		this.zipCode = zipCode;
		this.usrCrt = usrCrt;
		this.dtmUpd = dtmUpd;
		this.usrUpd = usrUpd;
		this.dtmCrt = dtmCrt;
		this.salesOrderHdrs = salesOrderHdrs;
		this.danaTunais = danaTunais;
	}

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "Id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "LeasingCode", length = 20)
	public String getLeasingCode() {
		return this.leasingCode;
	}

	public void setLeasingCode(String leasingCode) {
		this.leasingCode = leasingCode;
	}

	@Column(name = "Name", length = 50)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "Address", length = 100)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "Rt", length = 3)
	public String getRt() {
		return this.rt;
	}

	public void setRt(String rt) {
		this.rt = rt;
	}

	@Column(name = "Rw", length = 3)
	public String getRw() {
		return this.rw;
	}

	public void setRw(String rw) {
		this.rw = rw;
	}

	@Column(name = "Kelurahan", length = 20)
	public String getKelurahan() {
		return this.kelurahan;
	}

	public void setKelurahan(String kelurahan) {
		this.kelurahan = kelurahan;
	}

	@Column(name = "Kecamatan", length = 20)
	public String getKecamatan() {
		return this.kecamatan;
	}

	public void setKecamatan(String kecamatan) {
		this.kecamatan = kecamatan;
	}

	@Column(name = "City", length = 50)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "ZipCode", length = 10)
	public String getZipCode() {
		return this.zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Column(name = "UsrCrt", length = 50)
	public String getUsrCrt() {
		return this.usrCrt;
	}

	public void setUsrCrt(String usrCrt) {
		this.usrCrt = usrCrt;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "leasing")
	public Set<SalesOrderHdr> getSalesOrderHdrs() {
		return this.salesOrderHdrs;
	}

	public void setSalesOrderHdrs(Set<SalesOrderHdr> salesOrderHdrs) {
		this.salesOrderHdrs = salesOrderHdrs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "leasing")
	public Set<DanaTunai> getDanaTunais() {
		return this.danaTunais;
	}

	public void setDanaTunais(Set<DanaTunai> danaTunais) {
		this.danaTunais = danaTunais;
	}

}
