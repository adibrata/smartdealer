/**
 * 
 */
package util.adibrata.support.jourmal;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * @author Henry

 *
 */
@Entity
public class JrnlHdrModel implements java.io.Serializable {
	
	private String trxNo;
	private long officeIdX;
	private String reffNo;
	private long bankAccId;
	private long currId;
	private long HeaderId;
	private double currRate;
	private int bankPortion;
	
	private long cashierId;
	private int cashierOpen;
	private double amountTrx;
	private String wop;
	private String receivedFrom;
	private String receiptNo;
	private String jrnlNoCode;
	private String rcvDisbFlag;
	/**
	 * @return the trxNo
	 */
	public String getTrxNo() {
		return trxNo;
	}
	/**
	 * @param trxNo the trxNo to set
	 */
	public void setTrxNo(String trxNo) {
		this.trxNo = trxNo;
	}
	/**
	 * @return the officeIdX
	 */
	public long getOfficeIdX() {
		return officeIdX;
	}
	/**
	 * @param officeIdX the officeIdX to set
	 */
	public void setOfficeIdX(long officeIdX) {
		this.officeIdX = officeIdX;
	}
	/**
	 * @return the reffNo
	 */
	public String getReffNo() {
		return reffNo;
	}
	/**
	 * @param reffNo the reffNo to set
	 */
	public void setReffNo(String reffNo) {
		this.reffNo = reffNo;
	}
	/**
	 * @return the bankAccId
	 */
	public long getBankAccId() {
		return bankAccId;
	}
	/**
	 * @param bankAccId the bankAccId to set
	 */
	public void setBankAccId(long bankAccId) {
		this.bankAccId = bankAccId;
	}
	/**
	 * @return the currId
	 */
	public long getCurrId() {
		return currId;
	}
	/**
	 * @param currId the currId to set
	 */
	public void setCurrId(long currId) {
		this.currId = currId;
	}
	/**
	 * @return the currRate
	 */
	public double getCurrRate() {
		return currRate;
	}
	/**
	 * @param currRate the currRate to set
	 */
	public void setCurrRate(double currRate) {
		this.currRate = currRate;
	}
	/**
	 * @return the bankPortion
	 */
	public int getBankPortion() {
		return bankPortion;
	}
	/**
	 * @param bankPortion the bankPortion to set
	 */
	public void setBankPortion(int bankPortion) {
		this.bankPortion = bankPortion;
	}
	/**
	 * @return the cashierId
	 */
	public long getCashierId() {
		return cashierId;
	}
	/**
	 * @param cashierId the cashierId to set
	 */
	public void setCashierId(long cashierId) {
		this.cashierId = cashierId;
	}
	/**
	 * @return the cashierOpen
	 */
	public int getCashierOpen() {
		return cashierOpen;
	}
	/**
	 * @param cashierOpen the cashierOpen to set
	 */
	public void setCashierOpen(int cashierOpen) {
		this.cashierOpen = cashierOpen;
	}
	/**
	 * @return the amountTrx
	 */
	public double getAmountTrx() {
		return amountTrx;
	}
	/**
	 * @param amountTrx the amountTrx to set
	 */
	public void setAmountTrx(double amountTrx) {
		this.amountTrx = amountTrx;
	}
	/**
	 * @return the wop
	 */
	public String getWop() {
		return wop;
	}
	/**
	 * @param wop the wop to set
	 */
	public void setWop(String wop) {
		this.wop = wop;
	}
	/**
	 * @return the receivedFrom
	 */
	public String getReceivedFrom() {
		return receivedFrom;
	}
	/**
	 * @param receivedFrom the receivedFrom to set
	 */
	public void setReceivedFrom(String receivedFrom) {
		this.receivedFrom = receivedFrom;
	}
	/**
	 * @return the receiptNo
	 */
	public String getReceiptNo() {
		return receiptNo;
	}
	/**
	 * @param receiptNo the receiptNo to set
	 */
	public void setReceiptNo(String receiptNo) {
		this.receiptNo = receiptNo;
	}
	/**
	 * @return the jrnlNoCode
	 */
	public String getJrnlNoCode() {
		return jrnlNoCode;
	}
	/**
	 * @param jrnlNoCode the jrnlNoCode to set
	 */
	public void setJrnlNoCode(String jrnlNoCode) {
		this.jrnlNoCode = jrnlNoCode;
	}
	/**
	 * @return the rcvDisbFlag
	 */
	public String getRcvDisbFlag() {
		return rcvDisbFlag;
	}
	/**
	 * @param rcvDisbFlag the rcvDisbFlag to set
	 */
	public void setRcvDisbFlag(String rcvDisbFlag) {
		this.rcvDisbFlag = rcvDisbFlag;
	}
	/**
	 * @return the headerId
	 */
	public long getHeaderId() {
		return HeaderId;
	}
	/**
	 * @param headerId the headerId to set
	 */
	public void setHeaderId(long headerId) {
		HeaderId = headerId;
	}
	
		
}
