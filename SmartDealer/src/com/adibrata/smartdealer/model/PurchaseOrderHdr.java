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
 * PurchaseOrderHdr generated by hbm2java
 */
@Entity
@Table(name = "PurchaseOrderHdr", schema = "dbo", catalog = "SmartDealer")
public class PurchaseOrderHdr implements java.io.Serializable {

	private long id;
	private Office office;
	private Partner partner;
	private Supplier supplier;
	private String pono;
	private Date podate;
	private Long currencyId;
	private Double currencyRate;
	private Double poamount;
	private Long jobId;
	private Date dtmUpd;
	private String usrUpd;
	private Date dtmCrt;
	private String usrCrt;
	private Set<ReturPurchaseHdr> returPurchaseHdrs = new HashSet<ReturPurchaseHdr>(
			0);
	private Set<PurchaseInvoice> purchaseInvoices = new HashSet<PurchaseInvoice>(
			0);
	private Set<PurchaseOrderDtl> purchaseOrderDtls = new HashSet<PurchaseOrderDtl>(
			0);

	public PurchaseOrderHdr() {
	}

	public PurchaseOrderHdr(long id) {
		this.id = id;
	}

	public PurchaseOrderHdr(long id, Office office, Partner partner,
			Supplier supplier, String pono, Date podate, Long currencyId,
			Double currencyRate, Double poamount, Long jobId, Date dtmUpd,
			String usrUpd, Date dtmCrt, String usrCrt,
			Set<ReturPurchaseHdr> returPurchaseHdrs,
			Set<PurchaseInvoice> purchaseInvoices,
			Set<PurchaseOrderDtl> purchaseOrderDtls) {
		this.id = id;
		this.office = office;
		this.partner = partner;
		this.supplier = supplier;
		this.pono = pono;
		this.podate = podate;
		this.currencyId = currencyId;
		this.currencyRate = currencyRate;
		this.poamount = poamount;
		this.jobId = jobId;
		this.dtmUpd = dtmUpd;
		this.usrUpd = usrUpd;
		this.dtmCrt = dtmCrt;
		this.usrCrt = usrCrt;
		this.returPurchaseHdrs = returPurchaseHdrs;
		this.purchaseInvoices = purchaseInvoices;
		this.purchaseOrderDtls = purchaseOrderDtls;
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

	@Column(name = "PONo", length = 50)
	public String getPono() {
		return this.pono;
	}

	public void setPono(String pono) {
		this.pono = pono;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PODate", length = 16)
	public Date getPodate() {
		return this.podate;
	}

	public void setPodate(Date podate) {
		this.podate = podate;
	}

	@Column(name = "CurrencyID")
	public Long getCurrencyId() {
		return this.currencyId;
	}

	public void setCurrencyId(Long currencyId) {
		this.currencyId = currencyId;
	}

	@Column(name = "CurrencyRate", precision = 53, scale = 0)
	public Double getCurrencyRate() {
		return this.currencyRate;
	}

	public void setCurrencyRate(Double currencyRate) {
		this.currencyRate = currencyRate;
	}

	@Column(name = "POAmount", precision = 53, scale = 0)
	public Double getPoamount() {
		return this.poamount;
	}

	public void setPoamount(Double poamount) {
		this.poamount = poamount;
	}

	@Column(name = "JobId")
	public Long getJobId() {
		return this.jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "purchaseOrderHdr")
	public Set<ReturPurchaseHdr> getReturPurchaseHdrs() {
		return this.returPurchaseHdrs;
	}

	public void setReturPurchaseHdrs(Set<ReturPurchaseHdr> returPurchaseHdrs) {
		this.returPurchaseHdrs = returPurchaseHdrs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "purchaseOrderHdr")
	public Set<PurchaseInvoice> getPurchaseInvoices() {
		return this.purchaseInvoices;
	}

	public void setPurchaseInvoices(Set<PurchaseInvoice> purchaseInvoices) {
		this.purchaseInvoices = purchaseInvoices;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "purchaseOrderHdr")
	public Set<PurchaseOrderDtl> getPurchaseOrderDtls() {
		return this.purchaseOrderDtls;
	}

	public void setPurchaseOrderDtls(Set<PurchaseOrderDtl> purchaseOrderDtls) {
		this.purchaseOrderDtls = purchaseOrderDtls;
	}

}
