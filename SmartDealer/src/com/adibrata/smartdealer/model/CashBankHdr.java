package com.adibrata.smartdealer.model;

// Generated Jul 8, 2015 1:59:39 PM by Hibernate Tools 4.3.1

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * CashBankHdr generated by hbm2java
 */
@Entity
@Table(name = "CashBankHdr", schema = "dbo", catalog = "SmartDealer")
public class CashBankHdr implements java.io.Serializable {

	private long id;
	private String partnerCode;
	private Long officeId;
	private String voucherNo;
	private Date valueDt;
	private Date postingDt;
	private String description;
	private Character rcvDsbFlag;
	private String wop;
	private BigDecimal amount;
	private String rcvFrom;
	private String reffNo;
	private String receiptNo;
	private Long bankAccId;
	private Long currId;
	private Long cashierId;
	private Integer openingSequence;
	private Long officeIdX;
	private Character isReconcile;
	private Date reconcileDate;
	private String reconcileBy;
	private Integer jrnlTrxId;
	private Long agrmntId;
	private Integer jrnlShmHdrId;
	private String jrnlCode;
	private Long jrnlJobId;
	private String usrUpd;
	private Date dtmUpd;
	private String usrCrt;
	private Date dtmCrt;
	private Set<CashBankDtl> cashBankDtls = new HashSet<CashBankDtl>(0);

	public CashBankHdr() {
	}

	public CashBankHdr(long id) {
		this.id = id;
	}

	public CashBankHdr(long id, String partnerCode, Long officeId,
			String voucherNo, Date valueDt, Date postingDt, String description,
			Character rcvDsbFlag, String wop, BigDecimal amount,
			String rcvFrom, String reffNo, String receiptNo, Long bankAccId,
			Long currId, Long cashierId, Integer openingSequence,
			Long officeIdX, Character isReconcile, Date reconcileDate,
			String reconcileBy, Integer jrnlTrxId, Long agrmntId,
			Integer jrnlShmHdrId, String jrnlCode, Long jrnlJobId,
			String usrUpd, Date dtmUpd, String usrCrt, Date dtmCrt,
			Set<CashBankDtl> cashBankDtls) {
		this.id = id;
		this.partnerCode = partnerCode;
		this.officeId = officeId;
		this.voucherNo = voucherNo;
		this.valueDt = valueDt;
		this.postingDt = postingDt;
		this.description = description;
		this.rcvDsbFlag = rcvDsbFlag;
		this.wop = wop;
		this.amount = amount;
		this.rcvFrom = rcvFrom;
		this.reffNo = reffNo;
		this.receiptNo = receiptNo;
		this.bankAccId = bankAccId;
		this.currId = currId;
		this.cashierId = cashierId;
		this.openingSequence = openingSequence;
		this.officeIdX = officeIdX;
		this.isReconcile = isReconcile;
		this.reconcileDate = reconcileDate;
		this.reconcileBy = reconcileBy;
		this.jrnlTrxId = jrnlTrxId;
		this.agrmntId = agrmntId;
		this.jrnlShmHdrId = jrnlShmHdrId;
		this.jrnlCode = jrnlCode;
		this.jrnlJobId = jrnlJobId;
		this.usrUpd = usrUpd;
		this.dtmUpd = dtmUpd;
		this.usrCrt = usrCrt;
		this.dtmCrt = dtmCrt;
		this.cashBankDtls = cashBankDtls;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "PartnerCode", length = 20)
	public String getPartnerCode() {
		return this.partnerCode;
	}

	public void setPartnerCode(String partnerCode) {
		this.partnerCode = partnerCode;
	}

	@Column(name = "OfficeID")
	public Long getOfficeId() {
		return this.officeId;
	}

	public void setOfficeId(Long officeId) {
		this.officeId = officeId;
	}

	@Column(name = "VoucherNo", length = 50)
	public String getVoucherNo() {
		return this.voucherNo;
	}

	public void setVoucherNo(String voucherNo) {
		this.voucherNo = voucherNo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ValueDt", length = 16)
	public Date getValueDt() {
		return this.valueDt;
	}

	public void setValueDt(Date valueDt) {
		this.valueDt = valueDt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PostingDt", length = 16)
	public Date getPostingDt() {
		return this.postingDt;
	}

	public void setPostingDt(Date postingDt) {
		this.postingDt = postingDt;
	}

	@Column(name = "Description", length = 100)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "RcvDsbFlag", length = 1)
	public Character getRcvDsbFlag() {
		return this.rcvDsbFlag;
	}

	public void setRcvDsbFlag(Character rcvDsbFlag) {
		this.rcvDsbFlag = rcvDsbFlag;
	}

	@Column(name = "WOP", length = 50)
	public String getWop() {
		return this.wop;
	}

	public void setWop(String wop) {
		this.wop = wop;
	}

	@Column(name = "Amount", precision = 17)
	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Column(name = "RcvFrom", length = 50)
	public String getRcvFrom() {
		return this.rcvFrom;
	}

	public void setRcvFrom(String rcvFrom) {
		this.rcvFrom = rcvFrom;
	}

	@Column(name = "ReffNo", length = 50)
	public String getReffNo() {
		return this.reffNo;
	}

	public void setReffNo(String reffNo) {
		this.reffNo = reffNo;
	}

	@Column(name = "ReceiptNo", length = 50)
	public String getReceiptNo() {
		return this.receiptNo;
	}

	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}

	@Column(name = "BankAccID")
	public Long getBankAccId() {
		return this.bankAccId;
	}

	public void setBankAccId(Long bankAccId) {
		this.bankAccId = bankAccId;
	}

	@Column(name = "CurrID")
	public Long getCurrId() {
		return this.currId;
	}

	public void setCurrId(Long currId) {
		this.currId = currId;
	}

	@Column(name = "CashierId")
	public Long getCashierId() {
		return this.cashierId;
	}

	public void setCashierId(Long cashierId) {
		this.cashierId = cashierId;
	}

	@Column(name = "OpeningSequence")
	public Integer getOpeningSequence() {
		return this.openingSequence;
	}

	public void setOpeningSequence(Integer openingSequence) {
		this.openingSequence = openingSequence;
	}

	@Column(name = "OfficeID_X")
	public Long getOfficeIdX() {
		return this.officeIdX;
	}

	public void setOfficeIdX(Long officeIdX) {
		this.officeIdX = officeIdX;
	}

	@Column(name = "IsReconcile", length = 1)
	public Character getIsReconcile() {
		return this.isReconcile;
	}

	public void setIsReconcile(Character isReconcile) {
		this.isReconcile = isReconcile;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ReconcileDate", length = 16)
	public Date getReconcileDate() {
		return this.reconcileDate;
	}

	public void setReconcileDate(Date reconcileDate) {
		this.reconcileDate = reconcileDate;
	}

	@Column(name = "ReconcileBy", length = 50)
	public String getReconcileBy() {
		return this.reconcileBy;
	}

	public void setReconcileBy(String reconcileBy) {
		this.reconcileBy = reconcileBy;
	}

	@Column(name = "JrnlTrxID")
	public Integer getJrnlTrxId() {
		return this.jrnlTrxId;
	}

	public void setJrnlTrxId(Integer jrnlTrxId) {
		this.jrnlTrxId = jrnlTrxId;
	}

	@Column(name = "AgrmntID")
	public Long getAgrmntId() {
		return this.agrmntId;
	}

	public void setAgrmntId(Long agrmntId) {
		this.agrmntId = agrmntId;
	}

	@Column(name = "JrnlShmHdrID")
	public Integer getJrnlShmHdrId() {
		return this.jrnlShmHdrId;
	}

	public void setJrnlShmHdrId(Integer jrnlShmHdrId) {
		this.jrnlShmHdrId = jrnlShmHdrId;
	}

	@Column(name = "JrnlCode", length = 50)
	public String getJrnlCode() {
		return this.jrnlCode;
	}

	public void setJrnlCode(String jrnlCode) {
		this.jrnlCode = jrnlCode;
	}

	@Column(name = "JrnlJobID")
	public Long getJrnlJobId() {
		return this.jrnlJobId;
	}

	public void setJrnlJobId(Long jrnlJobId) {
		this.jrnlJobId = jrnlJobId;
	}

	@Column(name = "UsrUpd", length = 50)
	public String getUsrUpd() {
		return this.usrUpd;
	}

	public void setUsrUpd(String usrUpd) {
		this.usrUpd = usrUpd;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DtmUpd", length = 16)
	public Date getDtmUpd() {
		return this.dtmUpd;
	}

	public void setDtmUpd(Date dtmUpd) {
		this.dtmUpd = dtmUpd;
	}

	@Column(name = "UsrCrt", length = 50)
	public String getUsrCrt() {
		return this.usrCrt;
	}

	public void setUsrCrt(String usrCrt) {
		this.usrCrt = usrCrt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DtmCrt", length = 16)
	public Date getDtmCrt() {
		return this.dtmCrt;
	}

	public void setDtmCrt(Date dtmCrt) {
		this.dtmCrt = dtmCrt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cashBankHdr")
	public Set<CashBankDtl> getCashBankDtls() {
		return this.cashBankDtls;
	}

	public void setCashBankDtls(Set<CashBankDtl> cashBankDtls) {
		this.cashBankDtls = cashBankDtls;
	}

}
