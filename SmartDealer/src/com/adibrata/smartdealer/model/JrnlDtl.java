package com.adibrata.smartdealer.model;

// Generated Jul 8, 2015 11:12:47 AM by Hibernate Tools 4.3.1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * JrnlDtl generated by hbm2java
 */
@Entity
@Table(name = "JrnlDtl", schema = "dbo", catalog = "SmartDealer")
public class JrnlDtl implements java.io.Serializable {

	private long id;
	private JrnlHdr jrnlHdr;
	private int sequenceNo;
	private String coaCoy;
	private String coaOffice;
	private String coaCode;
	private int jrnlTrxId;
	private String trDesc;
	private char post;
	private Long currId;
	private BigDecimal currRate;
	private BigDecimal amt;
	private BigDecimal amtOri;
	private String coaCodeX;
	private String coaOfficeX;
	private String coaName;
	private Long productId;
	private Long departId;
	private Date dtmUpd;
	private String usrUpd;
	private Date dtmCrt;
	private String usrCrt;

	public JrnlDtl() {
	}

	public JrnlDtl(long id, int sequenceNo, String coaOffice, int jrnlTrxId,
			char post, BigDecimal currRate, BigDecimal amt) {
		this.id = id;
		this.sequenceNo = sequenceNo;
		this.coaOffice = coaOffice;
		this.jrnlTrxId = jrnlTrxId;
		this.post = post;
		this.currRate = currRate;
		this.amt = amt;
	}

	public JrnlDtl(long id, JrnlHdr jrnlHdr, int sequenceNo, String coaCoy,
			String coaOffice, String coaCode, int jrnlTrxId, String trDesc,
			char post, Long currId, BigDecimal currRate, BigDecimal amt,
			BigDecimal amtOri, String coaCodeX, String coaOfficeX,
			String coaName, Long productId, Long departId, Date dtmUpd,
			String usrUpd, Date dtmCrt, String usrCrt) {
		this.id = id;
		this.jrnlHdr = jrnlHdr;
		this.sequenceNo = sequenceNo;
		this.coaCoy = coaCoy;
		this.coaOffice = coaOffice;
		this.coaCode = coaCode;
		this.jrnlTrxId = jrnlTrxId;
		this.trDesc = trDesc;
		this.post = post;
		this.currId = currId;
		this.currRate = currRate;
		this.amt = amt;
		this.amtOri = amtOri;
		this.coaCodeX = coaCodeX;
		this.coaOfficeX = coaOfficeX;
		this.coaName = coaName;
		this.productId = productId;
		this.departId = departId;
		this.dtmUpd = dtmUpd;
		this.usrUpd = usrUpd;
		this.dtmCrt = dtmCrt;
		this.usrCrt = usrCrt;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "JrnlHdrID")
	public JrnlHdr getJrnlHdr() {
		return this.jrnlHdr;
	}

	public void setJrnlHdr(JrnlHdr jrnlHdr) {
		this.jrnlHdr = jrnlHdr;
	}

	@Column(name = "SequenceNo", nullable = false)
	public int getSequenceNo() {
		return this.sequenceNo;
	}

	public void setSequenceNo(int sequenceNo) {
		this.sequenceNo = sequenceNo;
	}

	@Column(name = "CoaCoy", length = 50)
	public String getCoaCoy() {
		return this.coaCoy;
	}

	public void setCoaCoy(String coaCoy) {
		this.coaCoy = coaCoy;
	}

	@Column(name = "CoaOffice", nullable = false, length = 30)
	public String getCoaOffice() {
		return this.coaOffice;
	}

	public void setCoaOffice(String coaOffice) {
		this.coaOffice = coaOffice;
	}

	@Column(name = "CoaCode", length = 50)
	public String getCoaCode() {
		return this.coaCode;
	}

	public void setCoaCode(String coaCode) {
		this.coaCode = coaCode;
	}

	@Column(name = "JrnlTrxID", nullable = false)
	public int getJrnlTrxId() {
		return this.jrnlTrxId;
	}

	public void setJrnlTrxId(int jrnlTrxId) {
		this.jrnlTrxId = jrnlTrxId;
	}

	@Column(name = "Tr_Desc")
	public String getTrDesc() {
		return this.trDesc;
	}

	public void setTrDesc(String trDesc) {
		this.trDesc = trDesc;
	}

	@Column(name = "Post", nullable = false, length = 1)
	public char getPost() {
		return this.post;
	}

	public void setPost(char post) {
		this.post = post;
	}

	@Column(name = "CurrID")
	public Long getCurrId() {
		return this.currId;
	}

	public void setCurrId(Long currId) {
		this.currId = currId;
	}

	@Column(name = "Curr_Rate", nullable = false, precision = 17)
	public BigDecimal getCurrRate() {
		return this.currRate;
	}

	public void setCurrRate(BigDecimal currRate) {
		this.currRate = currRate;
	}

	@Column(name = "Amt", nullable = false, precision = 17)
	public BigDecimal getAmt() {
		return this.amt;
	}

	public void setAmt(BigDecimal amt) {
		this.amt = amt;
	}

	@Column(name = "AmtOri", precision = 17)
	public BigDecimal getAmtOri() {
		return this.amtOri;
	}

	public void setAmtOri(BigDecimal amtOri) {
		this.amtOri = amtOri;
	}

	@Column(name = "CoaCode_X", length = 25)
	public String getCoaCodeX() {
		return this.coaCodeX;
	}

	public void setCoaCodeX(String coaCodeX) {
		this.coaCodeX = coaCodeX;
	}

	@Column(name = "CoaOffice_X", length = 3)
	public String getCoaOfficeX() {
		return this.coaOfficeX;
	}

	public void setCoaOfficeX(String coaOfficeX) {
		this.coaOfficeX = coaOfficeX;
	}

	@Column(name = "CoaName", length = 50)
	public String getCoaName() {
		return this.coaName;
	}

	public void setCoaName(String coaName) {
		this.coaName = coaName;
	}

	@Column(name = "ProductId")
	public Long getProductId() {
		return this.productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	@Column(name = "DepartID")
	public Long getDepartId() {
		return this.departId;
	}

	public void setDepartId(Long departId) {
		this.departId = departId;
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
