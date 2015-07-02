package com.adibrata.smartdealer.model;

// Generated Jul 2, 2015 6:38:03 PM by Hibernate Tools 4.3.1

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
 * AssetServiceHdr generated by hbm2java
 */
@Entity
@Table(name = "AssetServiceHdr", schema = "dbo", catalog = "SmartDealer")
public class AssetServiceHdr implements java.io.Serializable {

	private long id;
	private Partner partner;
	private Stock stock;
	private Long officeId;
	private Date dtmUpd;
	private String usrUpd;
	private Date dtmCrt;
	private String usrCrt;
	private Set<AssetServiceDtl> assetServiceDtls = new HashSet<AssetServiceDtl>(
			0);

	public AssetServiceHdr() {
	}

	public AssetServiceHdr(long id) {
		this.id = id;
	}

	public AssetServiceHdr(long id, Partner partner, Stock stock,
			Long officeId, Date dtmUpd, String usrUpd, Date dtmCrt,
			String usrCrt, Set<AssetServiceDtl> assetServiceDtls) {
		this.id = id;
		this.partner = partner;
		this.stock = stock;
		this.officeId = officeId;
		this.dtmUpd = dtmUpd;
		this.usrUpd = usrUpd;
		this.dtmCrt = dtmCrt;
		this.usrCrt = usrCrt;
		this.assetServiceDtls = assetServiceDtls;
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
	@JoinColumn(name = "PartnerCode")
	public Partner getPartner() {
		return this.partner;
	}

	public void setPartner(Partner partner) {
		this.partner = partner;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "StockID")
	public Stock getStock() {
		return this.stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	@Column(name = "OfficeID")
	public Long getOfficeId() {
		return this.officeId;
	}

	public void setOfficeId(Long officeId) {
		this.officeId = officeId;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "assetServiceHdr")
	public Set<AssetServiceDtl> getAssetServiceDtls() {
		return this.assetServiceDtls;
	}

	public void setAssetServiceDtls(Set<AssetServiceDtl> assetServiceDtls) {
		this.assetServiceDtls = assetServiceDtls;
	}

}
