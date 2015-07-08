package com.adibrata.smartdealer.model;

// Generated Jul 8, 2015 11:12:47 AM by Hibernate Tools 4.3.1

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
 * TransJob generated by hbm2java
 */
@Entity
@Table(name = "TransJob", schema = "dbo", catalog = "SmartDealer")
public class TransJob implements java.io.Serializable {

	private long id;
	private Partner partner;
	private Long officeId;
	private String jobCode;
	private String trxConfigCode;
	private String coaSchmCode;
	private Date jobDate;
	private Date jobPost;
	private String jobStatus;
	private Date jobExecuteDate;
	private Long trxId;
	private String transCodeNo;
	private Date dtmUpd;
	private String usrUpd;
	private Date dtmCrt;
	private String usrCrt;

	public TransJob() {
	}

	public TransJob(long id) {
		this.id = id;
	}

	public TransJob(long id, Partner partner, Long officeId, String jobCode,
			String trxConfigCode, String coaSchmCode, Date jobDate,
			Date jobPost, String jobStatus, Date jobExecuteDate, Long trxId,
			String transCodeNo, Date dtmUpd, String usrUpd, Date dtmCrt,
			String usrCrt) {
		this.id = id;
		this.partner = partner;
		this.officeId = officeId;
		this.jobCode = jobCode;
		this.trxConfigCode = trxConfigCode;
		this.coaSchmCode = coaSchmCode;
		this.jobDate = jobDate;
		this.jobPost = jobPost;
		this.jobStatus = jobStatus;
		this.jobExecuteDate = jobExecuteDate;
		this.trxId = trxId;
		this.transCodeNo = transCodeNo;
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
	@JoinColumn(name = "PartnerCode")
	public Partner getPartner() {
		return this.partner;
	}

	public void setPartner(Partner partner) {
		this.partner = partner;
	}

	@Column(name = "OfficeID")
	public Long getOfficeId() {
		return this.officeId;
	}

	public void setOfficeId(Long officeId) {
		this.officeId = officeId;
	}

	@Column(name = "JobCode", length = 50)
	public String getJobCode() {
		return this.jobCode;
	}

	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}

	@Column(name = "TrxConfigCode", length = 20)
	public String getTrxConfigCode() {
		return this.trxConfigCode;
	}

	public void setTrxConfigCode(String trxConfigCode) {
		this.trxConfigCode = trxConfigCode;
	}

	@Column(name = "CoaSchmCode", length = 20)
	public String getCoaSchmCode() {
		return this.coaSchmCode;
	}

	public void setCoaSchmCode(String coaSchmCode) {
		this.coaSchmCode = coaSchmCode;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "JobDate", length = 23)
	public Date getJobDate() {
		return this.jobDate;
	}

	public void setJobDate(Date jobDate) {
		this.jobDate = jobDate;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "JobPost", length = 23)
	public Date getJobPost() {
		return this.jobPost;
	}

	public void setJobPost(Date jobPost) {
		this.jobPost = jobPost;
	}

	@Column(name = "JobStatus", length = 50)
	public String getJobStatus() {
		return this.jobStatus;
	}

	public void setJobStatus(String jobStatus) {
		this.jobStatus = jobStatus;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "JobExecuteDate", length = 23)
	public Date getJobExecuteDate() {
		return this.jobExecuteDate;
	}

	public void setJobExecuteDate(Date jobExecuteDate) {
		this.jobExecuteDate = jobExecuteDate;
	}

	@Column(name = "TrxID")
	public Long getTrxId() {
		return this.trxId;
	}

	public void setTrxId(Long trxId) {
		this.trxId = trxId;
	}

	@Column(name = "TransCodeNo", length = 50)
	public String getTransCodeNo() {
		return this.transCodeNo;
	}

	public void setTransCodeNo(String transCodeNo) {
		this.transCodeNo = transCodeNo;
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
