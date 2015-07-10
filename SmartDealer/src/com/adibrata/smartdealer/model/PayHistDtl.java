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
 * PayHistDtl generated by hbm2java
 */
@Entity
@Table(name = "PayHistDtl", schema = "dbo", catalog = "SmartDealer")
public class PayHistDtl implements java.io.Serializable {

	private long id;
	private PayHistHdr payHistHdr;
	private String coaName;
	private short instSeqNo;
	private short assetSeqNo;
	private int yearNum;
	private String description;
	private BigDecimal debitAmt;
	private BigDecimal creditAmt;
	private BigDecimal lcamt;
	private short lcdays;
	private Date dtmUpd;
	private String usrUpd;
	private Date dtmCrt;
	private String usrCrt;

	public PayHistDtl() {
	}

	public PayHistDtl(long id, String coaName, short instSeqNo,
			short assetSeqNo, int yearNum, String description,
			BigDecimal debitAmt, BigDecimal creditAmt, BigDecimal lcamt,
			short lcdays) {
		this.id = id;
		this.coaName = coaName;
		this.instSeqNo = instSeqNo;
		this.assetSeqNo = assetSeqNo;
		this.yearNum = yearNum;
		this.description = description;
		this.debitAmt = debitAmt;
		this.creditAmt = creditAmt;
		this.lcamt = lcamt;
		this.lcdays = lcdays;
	}

	public PayHistDtl(long id, PayHistHdr payHistHdr, String coaName,
			short instSeqNo, short assetSeqNo, int yearNum, String description,
			BigDecimal debitAmt, BigDecimal creditAmt, BigDecimal lcamt,
			short lcdays, Date dtmUpd, String usrUpd, Date dtmCrt, String usrCrt) {
		this.id = id;
		this.payHistHdr = payHistHdr;
		this.coaName = coaName;
		this.instSeqNo = instSeqNo;
		this.assetSeqNo = assetSeqNo;
		this.yearNum = yearNum;
		this.description = description;
		this.debitAmt = debitAmt;
		this.creditAmt = creditAmt;
		this.lcamt = lcamt;
		this.lcdays = lcdays;
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
	@JoinColumn(name = "PayHistHdrId")
	public PayHistHdr getPayHistHdr() {
		return this.payHistHdr;
	}

	public void setPayHistHdr(PayHistHdr payHistHdr) {
		this.payHistHdr = payHistHdr;
	}

	@Column(name = "CoaName", nullable = false, length = 50)
	public String getCoaName() {
		return this.coaName;
	}

	public void setCoaName(String coaName) {
		this.coaName = coaName;
	}

	@Column(name = "InstSeqNo", nullable = false)
	public short getInstSeqNo() {
		return this.instSeqNo;
	}

	public void setInstSeqNo(short instSeqNo) {
		this.instSeqNo = instSeqNo;
	}

	@Column(name = "AssetSeqNo", nullable = false)
	public short getAssetSeqNo() {
		return this.assetSeqNo;
	}

	public void setAssetSeqNo(short assetSeqNo) {
		this.assetSeqNo = assetSeqNo;
	}

	@Column(name = "YearNum", nullable = false)
	public int getYearNum() {
		return this.yearNum;
	}

	public void setYearNum(int yearNum) {
		this.yearNum = yearNum;
	}

	@Column(name = "Description", nullable = false, length = 50)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "DebitAmt", nullable = false, precision = 17)
	public BigDecimal getDebitAmt() {
		return this.debitAmt;
	}

	public void setDebitAmt(BigDecimal debitAmt) {
		this.debitAmt = debitAmt;
	}

	@Column(name = "CreditAmt", nullable = false, precision = 17)
	public BigDecimal getCreditAmt() {
		return this.creditAmt;
	}

	public void setCreditAmt(BigDecimal creditAmt) {
		this.creditAmt = creditAmt;
	}

	@Column(name = "LCAmt", nullable = false, precision = 17)
	public BigDecimal getLcamt() {
		return this.lcamt;
	}

	public void setLcamt(BigDecimal lcamt) {
		this.lcamt = lcamt;
	}

	@Column(name = "LCDays", nullable = false)
	public short getLcdays() {
		return this.lcdays;
	}

	public void setLcdays(short lcdays) {
		this.lcdays = lcdays;
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
