package com.adibrata.smartdealer.model;

// Generated Jul 8, 2015 2:12:08 PM by Hibernate Tools 4.3.1

import java.math.BigDecimal;
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
 * ServiceDtl generated by hbm2java
 */
@Entity
@Table(name = "ServiceDtl", schema = "dbo", catalog = "SmartDealer")
public class ServiceDtl implements java.io.Serializable {

	private long id;
	private ServiceHdr serviceHdr;
	private BigDecimal servicePrice;
	private String assetType;
	private String assetBrand;
	private String assetModel;
	private String assetCode;
	private String bpkbno;
	private String bpkbname;
	private String bpkbaddress;
	private String vehicleColor;
	private String machineNo;
	private String chasisNo;
	private String cylinder;
	private String licensePlate;
	private String manufacturingMonth;
	private String manufacturingYear;
	private Date dtmUpd;
	private String usrUpd;
	private Date dtmCrt;
	private String usrCrt;
	private Set<ServiceItem> serviceItems = new HashSet<ServiceItem>(0);

	public ServiceDtl() {
	}

	public ServiceDtl(long id) {
		this.id = id;
	}

	public ServiceDtl(long id, ServiceHdr serviceHdr, BigDecimal servicePrice,
			String assetType, String assetBrand, String assetModel,
			String assetCode, String bpkbno, String bpkbname,
			String bpkbaddress, String vehicleColor, String machineNo,
			String chasisNo, String cylinder, String licensePlate,
			String manufacturingMonth, String manufacturingYear, Date dtmUpd,
			String usrUpd, Date dtmCrt, String usrCrt,
			Set<ServiceItem> serviceItems) {
		this.id = id;
		this.serviceHdr = serviceHdr;
		this.servicePrice = servicePrice;
		this.assetType = assetType;
		this.assetBrand = assetBrand;
		this.assetModel = assetModel;
		this.assetCode = assetCode;
		this.bpkbno = bpkbno;
		this.bpkbname = bpkbname;
		this.bpkbaddress = bpkbaddress;
		this.vehicleColor = vehicleColor;
		this.machineNo = machineNo;
		this.chasisNo = chasisNo;
		this.cylinder = cylinder;
		this.licensePlate = licensePlate;
		this.manufacturingMonth = manufacturingMonth;
		this.manufacturingYear = manufacturingYear;
		this.dtmUpd = dtmUpd;
		this.usrUpd = usrUpd;
		this.dtmCrt = dtmCrt;
		this.usrCrt = usrCrt;
		this.serviceItems = serviceItems;
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
	@JoinColumn(name = "ServiceHdrId")
	public ServiceHdr getServiceHdr() {
		return this.serviceHdr;
	}

	public void setServiceHdr(ServiceHdr serviceHdr) {
		this.serviceHdr = serviceHdr;
	}

	@Column(name = "ServicePrice", precision = 17)
	public BigDecimal getServicePrice() {
		return this.servicePrice;
	}

	public void setServicePrice(BigDecimal servicePrice) {
		this.servicePrice = servicePrice;
	}

	@Column(name = "AssetType", length = 20)
	public String getAssetType() {
		return this.assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	@Column(name = "AssetBrand", length = 20)
	public String getAssetBrand() {
		return this.assetBrand;
	}

	public void setAssetBrand(String assetBrand) {
		this.assetBrand = assetBrand;
	}

	@Column(name = "AssetModel", length = 20)
	public String getAssetModel() {
		return this.assetModel;
	}

	public void setAssetModel(String assetModel) {
		this.assetModel = assetModel;
	}

	@Column(name = "AssetCode", length = 200)
	public String getAssetCode() {
		return this.assetCode;
	}

	public void setAssetCode(String assetCode) {
		this.assetCode = assetCode;
	}

	@Column(name = "BPKBNo", length = 50)
	public String getBpkbno() {
		return this.bpkbno;
	}

	public void setBpkbno(String bpkbno) {
		this.bpkbno = bpkbno;
	}

	@Column(name = "BPKBName", length = 50)
	public String getBpkbname() {
		return this.bpkbname;
	}

	public void setBpkbname(String bpkbname) {
		this.bpkbname = bpkbname;
	}

	@Column(name = "BPKBAddress", length = 100)
	public String getBpkbaddress() {
		return this.bpkbaddress;
	}

	public void setBpkbaddress(String bpkbaddress) {
		this.bpkbaddress = bpkbaddress;
	}

	@Column(name = "VehicleColor", length = 50)
	public String getVehicleColor() {
		return this.vehicleColor;
	}

	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}

	@Column(name = "MachineNo", length = 50)
	public String getMachineNo() {
		return this.machineNo;
	}

	public void setMachineNo(String machineNo) {
		this.machineNo = machineNo;
	}

	@Column(name = "ChasisNo", length = 50)
	public String getChasisNo() {
		return this.chasisNo;
	}

	public void setChasisNo(String chasisNo) {
		this.chasisNo = chasisNo;
	}

	@Column(name = "Cylinder", length = 8)
	public String getCylinder() {
		return this.cylinder;
	}

	public void setCylinder(String cylinder) {
		this.cylinder = cylinder;
	}

	@Column(name = "LicensePlate", length = 15)
	public String getLicensePlate() {
		return this.licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	@Column(name = "ManufacturingMonth", length = 50)
	public String getManufacturingMonth() {
		return this.manufacturingMonth;
	}

	public void setManufacturingMonth(String manufacturingMonth) {
		this.manufacturingMonth = manufacturingMonth;
	}

	@Column(name = "ManufacturingYear", length = 4)
	public String getManufacturingYear() {
		return this.manufacturingYear;
	}

	public void setManufacturingYear(String manufacturingYear) {
		this.manufacturingYear = manufacturingYear;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "serviceDtl")
	public Set<ServiceItem> getServiceItems() {
		return this.serviceItems;
	}

	public void setServiceItems(Set<ServiceItem> serviceItems) {
		this.serviceItems = serviceItems;
	}

}
