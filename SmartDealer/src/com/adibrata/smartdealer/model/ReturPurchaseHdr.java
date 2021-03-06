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
 * ReturPurchaseHdr generated by hbm2java
 */
@Entity
@Table(name = "ReturPurchaseHdr", schema = "dbo", catalog = "SmartDealer")
public class ReturPurchaseHdr implements java.io.Serializable {

	private long id;
	private Office office;
	private Partner partner;
	private PurchaseOrderHdr purchaseOrderHdr;
	private Supplier supplier;
	private String returPurchaseNo;
	private Date dtmUpd;
	private String usrUpd;
	private Date dtmCrt;
	private String usrCrt;
	private Set<ReturPurchaseDtl> returPurchaseDtls = new HashSet<ReturPurchaseDtl>(
			0);

	public ReturPurchaseHdr() {
	}

	public ReturPurchaseHdr(long id) {
		this.id = id;
	}

	public ReturPurchaseHdr(long id, Office office, Partner partner,
			PurchaseOrderHdr purchaseOrderHdr, Supplier supplier,
			String returPurchaseNo, Date dtmUpd, String usrUpd, Date dtmCrt,
			String usrCrt, Set<ReturPurchaseDtl> returPurchaseDtls) {
		this.id = id;
		this.office = office;
		this.partner = partner;
		this.purchaseOrderHdr = purchaseOrderHdr;
		this.supplier = supplier;
		this.returPurchaseNo = returPurchaseNo;
		this.dtmUpd = dtmUpd;
		this.usrUpd = usrUpd;
		this.dtmCrt = dtmCrt;
		this.usrCrt = usrCrt;
		this.returPurchaseDtls = returPurchaseDtls;
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
	@JoinColumn(name = "PurchaseOrderHdrID")
	public PurchaseOrderHdr getPurchaseOrderHdr() {
		return this.purchaseOrderHdr;
	}

	public void setPurchaseOrderHdr(PurchaseOrderHdr purchaseOrderHdr) {
		this.purchaseOrderHdr = purchaseOrderHdr;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DealerId")
	public Supplier getSupplier() {
		return this.supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	@Column(name = "ReturPurchaseNo", length = 50)
	public String getReturPurchaseNo() {
		return this.returPurchaseNo;
	}

	public void setReturPurchaseNo(String returPurchaseNo) {
		this.returPurchaseNo = returPurchaseNo;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "returPurchaseHdr")
	public Set<ReturPurchaseDtl> getReturPurchaseDtls() {
		return this.returPurchaseDtls;
	}

	public void setReturPurchaseDtls(Set<ReturPurchaseDtl> returPurchaseDtls) {
		this.returPurchaseDtls = returPurchaseDtls;
	}

}
