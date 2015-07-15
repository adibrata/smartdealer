package com.adibrata.smartdealer.model;

// Generated Jul 15, 2015 5:19:07 PM by Hibernate Tools 4.3.1

import java.io.Serializable;
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
 * CoyCust generated by hbm2java
 */
@Entity
@Table(name = "CoyCust", schema = "dbo", catalog = "SmartDealer")
public class CoyCust implements java.io.Serializable {

	private long id;
	private Customer customer;
	private String npwp;
	private String npwpchecking;
	private String companyType;
	private Short numberOfEmployees;
	private Short yearOfEstablished;
	private String industryTypeId;
	private String pengelolaGedungAreaPhone;
	private String pengelolaGedungPhone;
	private BigDecimal currentRatio;
	private BigDecimal roi;
	private BigDecimal der;
	private BigDecimal modalDasar;
	private BigDecimal modalDisetor;
	private BigDecimal netProfitMargin;
	private String bankAccountType;
	private BigDecimal nilaiPinjamanSedangBerjalan;
	private BigDecimal averageDebitTransaction;
	private BigDecimal averageCreditTransaction;
	private BigDecimal averageBalance;
	private BigDecimal deposito;
	private Serializable additionalCollateralType;
	private BigDecimal additionalCollateralAmount;
	private String companyStatus;
	private Short companyStatusSinceYear;
	private Date rentFinishDate;
	private String bankId;
	private String bankBranch;
	private String accountNo;
	private Serializable accountName;
	private String reference;
	private boolean isApplyCarLoanBefore;
	private Serializable applyCarLoanCompanyName;
	private char activeCustomer;
	private Serializable notes;
	private Boolean isCorporateCreditLine;
	private BigDecimal plafondAmount;
	private Serializable customerGroup;
	private String noDocumentOfEstablished;
	private Date dateDocumentOfEstablished;
	private String notaryPlace;
	private String notaryName;
	private String lastNoDocumentOfEstablished;
	private Date lastDateDocumentOfEstablished;
	private String lastNotaryPlace;
	private String lastNotaryName;

	public CoyCust() {
	}

	public CoyCust(long id, String npwp, String npwpchecking,
			String companyType, String industryTypeId, BigDecimal modalDasar,
			BigDecimal modalDisetor, BigDecimal netProfitMargin,
			BigDecimal nilaiPinjamanSedangBerjalan,
			boolean isApplyCarLoanBefore, char activeCustomer,
			Serializable customerGroup) {
		this.id = id;
		this.npwp = npwp;
		this.npwpchecking = npwpchecking;
		this.companyType = companyType;
		this.industryTypeId = industryTypeId;
		this.modalDasar = modalDasar;
		this.modalDisetor = modalDisetor;
		this.netProfitMargin = netProfitMargin;
		this.nilaiPinjamanSedangBerjalan = nilaiPinjamanSedangBerjalan;
		this.isApplyCarLoanBefore = isApplyCarLoanBefore;
		this.activeCustomer = activeCustomer;
		this.customerGroup = customerGroup;
	}

	public CoyCust(long id, Customer customer, String npwp,
			String npwpchecking, String companyType, Short numberOfEmployees,
			Short yearOfEstablished, String industryTypeId,
			String pengelolaGedungAreaPhone, String pengelolaGedungPhone,
			BigDecimal currentRatio, BigDecimal roi, BigDecimal der,
			BigDecimal modalDasar, BigDecimal modalDisetor,
			BigDecimal netProfitMargin, String bankAccountType,
			BigDecimal nilaiPinjamanSedangBerjalan,
			BigDecimal averageDebitTransaction,
			BigDecimal averageCreditTransaction, BigDecimal averageBalance,
			BigDecimal deposito, Serializable additionalCollateralType,
			BigDecimal additionalCollateralAmount, String companyStatus,
			Short companyStatusSinceYear, Date rentFinishDate, String bankId,
			String bankBranch, String accountNo, Serializable accountName,
			String reference, boolean isApplyCarLoanBefore,
			Serializable applyCarLoanCompanyName, char activeCustomer,
			Serializable notes, Boolean isCorporateCreditLine,
			BigDecimal plafondAmount, Serializable customerGroup,
			String noDocumentOfEstablished, Date dateDocumentOfEstablished,
			String notaryPlace, String notaryName,
			String lastNoDocumentOfEstablished,
			Date lastDateDocumentOfEstablished, String lastNotaryPlace,
			String lastNotaryName) {
		this.id = id;
		this.customer = customer;
		this.npwp = npwp;
		this.npwpchecking = npwpchecking;
		this.companyType = companyType;
		this.numberOfEmployees = numberOfEmployees;
		this.yearOfEstablished = yearOfEstablished;
		this.industryTypeId = industryTypeId;
		this.pengelolaGedungAreaPhone = pengelolaGedungAreaPhone;
		this.pengelolaGedungPhone = pengelolaGedungPhone;
		this.currentRatio = currentRatio;
		this.roi = roi;
		this.der = der;
		this.modalDasar = modalDasar;
		this.modalDisetor = modalDisetor;
		this.netProfitMargin = netProfitMargin;
		this.bankAccountType = bankAccountType;
		this.nilaiPinjamanSedangBerjalan = nilaiPinjamanSedangBerjalan;
		this.averageDebitTransaction = averageDebitTransaction;
		this.averageCreditTransaction = averageCreditTransaction;
		this.averageBalance = averageBalance;
		this.deposito = deposito;
		this.additionalCollateralType = additionalCollateralType;
		this.additionalCollateralAmount = additionalCollateralAmount;
		this.companyStatus = companyStatus;
		this.companyStatusSinceYear = companyStatusSinceYear;
		this.rentFinishDate = rentFinishDate;
		this.bankId = bankId;
		this.bankBranch = bankBranch;
		this.accountNo = accountNo;
		this.accountName = accountName;
		this.reference = reference;
		this.isApplyCarLoanBefore = isApplyCarLoanBefore;
		this.applyCarLoanCompanyName = applyCarLoanCompanyName;
		this.activeCustomer = activeCustomer;
		this.notes = notes;
		this.isCorporateCreditLine = isCorporateCreditLine;
		this.plafondAmount = plafondAmount;
		this.customerGroup = customerGroup;
		this.noDocumentOfEstablished = noDocumentOfEstablished;
		this.dateDocumentOfEstablished = dateDocumentOfEstablished;
		this.notaryPlace = notaryPlace;
		this.notaryName = notaryName;
		this.lastNoDocumentOfEstablished = lastNoDocumentOfEstablished;
		this.lastDateDocumentOfEstablished = lastDateDocumentOfEstablished;
		this.lastNotaryPlace = lastNotaryPlace;
		this.lastNotaryName = lastNotaryName;
	}

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "Id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CustomerId")
	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Column(name = "NPWP", nullable = false, length = 25)
	public String getNpwp() {
		return this.npwp;
	}

	public void setNpwp(String npwp) {
		this.npwp = npwp;
	}

	@Column(name = "NPWPChecking", nullable = false, length = 25)
	public String getNpwpchecking() {
		return this.npwpchecking;
	}

	public void setNpwpchecking(String npwpchecking) {
		this.npwpchecking = npwpchecking;
	}

	@Column(name = "CompanyType", nullable = false, length = 10)
	public String getCompanyType() {
		return this.companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	@Column(name = "NumberOfEmployees")
	public Short getNumberOfEmployees() {
		return this.numberOfEmployees;
	}

	public void setNumberOfEmployees(Short numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Column(name = "YearOfEstablished")
	public Short getYearOfEstablished() {
		return this.yearOfEstablished;
	}

	public void setYearOfEstablished(Short yearOfEstablished) {
		this.yearOfEstablished = yearOfEstablished;
	}

	@Column(name = "IndustryTypeID", nullable = false, length = 10)
	public String getIndustryTypeId() {
		return this.industryTypeId;
	}

	public void setIndustryTypeId(String industryTypeId) {
		this.industryTypeId = industryTypeId;
	}

	@Column(name = "PengelolaGedungAreaPhone", length = 4)
	public String getPengelolaGedungAreaPhone() {
		return this.pengelolaGedungAreaPhone;
	}

	public void setPengelolaGedungAreaPhone(String pengelolaGedungAreaPhone) {
		this.pengelolaGedungAreaPhone = pengelolaGedungAreaPhone;
	}

	@Column(name = "PengelolaGedungPhone", length = 10)
	public String getPengelolaGedungPhone() {
		return this.pengelolaGedungPhone;
	}

	public void setPengelolaGedungPhone(String pengelolaGedungPhone) {
		this.pengelolaGedungPhone = pengelolaGedungPhone;
	}

	@Column(name = "CurrentRatio", precision = 9, scale = 6)
	public BigDecimal getCurrentRatio() {
		return this.currentRatio;
	}

	public void setCurrentRatio(BigDecimal currentRatio) {
		this.currentRatio = currentRatio;
	}

	@Column(name = "ROI", precision = 9, scale = 6)
	public BigDecimal getRoi() {
		return this.roi;
	}

	public void setRoi(BigDecimal roi) {
		this.roi = roi;
	}

	@Column(name = "DER", precision = 9, scale = 6)
	public BigDecimal getDer() {
		return this.der;
	}

	public void setDer(BigDecimal der) {
		this.der = der;
	}

	@Column(name = "ModalDasar", nullable = false, precision = 17)
	public BigDecimal getModalDasar() {
		return this.modalDasar;
	}

	public void setModalDasar(BigDecimal modalDasar) {
		this.modalDasar = modalDasar;
	}

	@Column(name = "ModalDisetor", nullable = false, precision = 17)
	public BigDecimal getModalDisetor() {
		return this.modalDisetor;
	}

	public void setModalDisetor(BigDecimal modalDisetor) {
		this.modalDisetor = modalDisetor;
	}

	@Column(name = "NetProfitMargin", nullable = false, precision = 17)
	public BigDecimal getNetProfitMargin() {
		return this.netProfitMargin;
	}

	public void setNetProfitMargin(BigDecimal netProfitMargin) {
		this.netProfitMargin = netProfitMargin;
	}

	@Column(name = "BankAccountType", length = 10)
	public String getBankAccountType() {
		return this.bankAccountType;
	}

	public void setBankAccountType(String bankAccountType) {
		this.bankAccountType = bankAccountType;
	}

	@Column(name = "NilaiPinjamanSedangBerjalan", nullable = false, precision = 17)
	public BigDecimal getNilaiPinjamanSedangBerjalan() {
		return this.nilaiPinjamanSedangBerjalan;
	}

	public void setNilaiPinjamanSedangBerjalan(
			BigDecimal nilaiPinjamanSedangBerjalan) {
		this.nilaiPinjamanSedangBerjalan = nilaiPinjamanSedangBerjalan;
	}

	@Column(name = "AverageDebitTransaction", precision = 17)
	public BigDecimal getAverageDebitTransaction() {
		return this.averageDebitTransaction;
	}

	public void setAverageDebitTransaction(BigDecimal averageDebitTransaction) {
		this.averageDebitTransaction = averageDebitTransaction;
	}

	@Column(name = "AverageCreditTransaction", precision = 17)
	public BigDecimal getAverageCreditTransaction() {
		return this.averageCreditTransaction;
	}

	public void setAverageCreditTransaction(BigDecimal averageCreditTransaction) {
		this.averageCreditTransaction = averageCreditTransaction;
	}

	@Column(name = "AverageBalance", precision = 17)
	public BigDecimal getAverageBalance() {
		return this.averageBalance;
	}

	public void setAverageBalance(BigDecimal averageBalance) {
		this.averageBalance = averageBalance;
	}

	@Column(name = "Deposito", precision = 17)
	public BigDecimal getDeposito() {
		return this.deposito;
	}

	public void setDeposito(BigDecimal deposito) {
		this.deposito = deposito;
	}

	@Column(name = "AdditionalCollateralType")
	public Serializable getAdditionalCollateralType() {
		return this.additionalCollateralType;
	}

	public void setAdditionalCollateralType(
			Serializable additionalCollateralType) {
		this.additionalCollateralType = additionalCollateralType;
	}

	@Column(name = "AdditionalCollateralAmount", precision = 17)
	public BigDecimal getAdditionalCollateralAmount() {
		return this.additionalCollateralAmount;
	}

	public void setAdditionalCollateralAmount(
			BigDecimal additionalCollateralAmount) {
		this.additionalCollateralAmount = additionalCollateralAmount;
	}

	@Column(name = "CompanyStatus", length = 10)
	public String getCompanyStatus() {
		return this.companyStatus;
	}

	public void setCompanyStatus(String companyStatus) {
		this.companyStatus = companyStatus;
	}

	@Column(name = "CompanyStatusSinceYear")
	public Short getCompanyStatusSinceYear() {
		return this.companyStatusSinceYear;
	}

	public void setCompanyStatusSinceYear(Short companyStatusSinceYear) {
		this.companyStatusSinceYear = companyStatusSinceYear;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "RentFinishDate", length = 23)
	public Date getRentFinishDate() {
		return this.rentFinishDate;
	}

	public void setRentFinishDate(Date rentFinishDate) {
		this.rentFinishDate = rentFinishDate;
	}

	@Column(name = "BankID", length = 5)
	public String getBankId() {
		return this.bankId;
	}

	public void setBankId(String bankId) {
		this.bankId = bankId;
	}

	@Column(name = "BankBranch", length = 50)
	public String getBankBranch() {
		return this.bankBranch;
	}

	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}

	@Column(name = "AccountNo", length = 20)
	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	@Column(name = "AccountName")
	public Serializable getAccountName() {
		return this.accountName;
	}

	public void setAccountName(Serializable accountName) {
		this.accountName = accountName;
	}

	@Column(name = "Reference", length = 10)
	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	@Column(name = "IsApplyCarLoanBefore", nullable = false)
	public boolean isIsApplyCarLoanBefore() {
		return this.isApplyCarLoanBefore;
	}

	public void setIsApplyCarLoanBefore(boolean isApplyCarLoanBefore) {
		this.isApplyCarLoanBefore = isApplyCarLoanBefore;
	}

	@Column(name = "ApplyCarLoanCompanyName")
	public Serializable getApplyCarLoanCompanyName() {
		return this.applyCarLoanCompanyName;
	}

	public void setApplyCarLoanCompanyName(Serializable applyCarLoanCompanyName) {
		this.applyCarLoanCompanyName = applyCarLoanCompanyName;
	}

	@Column(name = "ActiveCustomer", nullable = false, length = 1)
	public char getActiveCustomer() {
		return this.activeCustomer;
	}

	public void setActiveCustomer(char activeCustomer) {
		this.activeCustomer = activeCustomer;
	}

	@Column(name = "Notes")
	public Serializable getNotes() {
		return this.notes;
	}

	public void setNotes(Serializable notes) {
		this.notes = notes;
	}

	@Column(name = "IsCorporateCreditLine")
	public Boolean getIsCorporateCreditLine() {
		return this.isCorporateCreditLine;
	}

	public void setIsCorporateCreditLine(Boolean isCorporateCreditLine) {
		this.isCorporateCreditLine = isCorporateCreditLine;
	}

	@Column(name = "PlafondAmount", precision = 17)
	public BigDecimal getPlafondAmount() {
		return this.plafondAmount;
	}

	public void setPlafondAmount(BigDecimal plafondAmount) {
		this.plafondAmount = plafondAmount;
	}

	@Column(name = "CustomerGroup", nullable = false)
	public Serializable getCustomerGroup() {
		return this.customerGroup;
	}

	public void setCustomerGroup(Serializable customerGroup) {
		this.customerGroup = customerGroup;
	}

	@Column(name = "NoDocumentOfEstablished", length = 50)
	public String getNoDocumentOfEstablished() {
		return this.noDocumentOfEstablished;
	}

	public void setNoDocumentOfEstablished(String noDocumentOfEstablished) {
		this.noDocumentOfEstablished = noDocumentOfEstablished;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DateDocumentOfEstablished", length = 23)
	public Date getDateDocumentOfEstablished() {
		return this.dateDocumentOfEstablished;
	}

	public void setDateDocumentOfEstablished(Date dateDocumentOfEstablished) {
		this.dateDocumentOfEstablished = dateDocumentOfEstablished;
	}

	@Column(name = "NotaryPlace", length = 50)
	public String getNotaryPlace() {
		return this.notaryPlace;
	}

	public void setNotaryPlace(String notaryPlace) {
		this.notaryPlace = notaryPlace;
	}

	@Column(name = "NotaryName", length = 50)
	public String getNotaryName() {
		return this.notaryName;
	}

	public void setNotaryName(String notaryName) {
		this.notaryName = notaryName;
	}

	@Column(name = "LastNoDocumentOfEstablished", length = 50)
	public String getLastNoDocumentOfEstablished() {
		return this.lastNoDocumentOfEstablished;
	}

	public void setLastNoDocumentOfEstablished(
			String lastNoDocumentOfEstablished) {
		this.lastNoDocumentOfEstablished = lastNoDocumentOfEstablished;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LastDateDocumentOfEstablished", length = 23)
	public Date getLastDateDocumentOfEstablished() {
		return this.lastDateDocumentOfEstablished;
	}

	public void setLastDateDocumentOfEstablished(
			Date lastDateDocumentOfEstablished) {
		this.lastDateDocumentOfEstablished = lastDateDocumentOfEstablished;
	}

	@Column(name = "LastNotaryPlace", length = 50)
	public String getLastNotaryPlace() {
		return this.lastNotaryPlace;
	}

	public void setLastNotaryPlace(String lastNotaryPlace) {
		this.lastNotaryPlace = lastNotaryPlace;
	}

	@Column(name = "LastNotaryName", length = 50)
	public String getLastNotaryName() {
		return this.lastNotaryName;
	}

	public void setLastNotaryName(String lastNotaryName) {
		this.lastNotaryName = lastNotaryName;
	}

}