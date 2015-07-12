package util.adibrata.support.jourmal;

import java.util.Date;

import com.adibrata.smartdealer.model.TrxConfigHdr;

public class JrnlDtlModel {
	
	private int sequenceNo;
	private String coacode;
	private String coaName;
	private String isCoaHeader;
	private String post;
	private double amountjrnl;
	private Short isMultipleDtl;
	private Long departId;
	private String coacode_x;

	
	public JrnlDtlModel() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the sequenceNo
	 */
	public int getSequenceNo() {
		return sequenceNo;
	}


	/**
	 * @param sequenceNo the sequenceNo to set
	 */
	public void setSequenceNo(int sequenceNo) {
		this.sequenceNo = sequenceNo;
	}


	/**
	 * @return the coacode
	 */
	public String getCoacode() {
		return coacode;
	}


	/**
	 * @param coacode the coacode to set
	 */
	public void setCoacode(String coacode) {
		this.coacode = coacode;
	}


	/**
	 * @return the coaName
	 */
	public String getCoaName() {
		return coaName;
	}


	/**
	 * @param coaName the coaName to set
	 */
	public void setCoaName(String coaName) {
		this.coaName = coaName;
	}


	/**
	 * @return the isCoaHeader
	 */
	public String getIsCoaHeader() {
		return isCoaHeader;
	}


	/**
	 * @param isCoaHeader the isCoaHeader to set
	 */
	public void setIsCoaHeader(String isCoaHeader) {
		this.isCoaHeader = isCoaHeader;
	}


	/**
	 * @return the post
	 */
	public String getPost() {
		return post;
	}


	/**
	 * @param post the post to set
	 */
	public void setPost(String post) {
		this.post = post;
	}


	/**
	 * @return the amountjrnl
	 */
	public double getAmountjrnl() {
		return amountjrnl;
	}


	/**
	 * @param amountjrnl the amountjrnl to set
	 */
	public void setAmountjrnl(double amountjrnl) {
		this.amountjrnl = amountjrnl;
	}


	/**
	 * @return the isMultipleDtl
	 */
	public Short getIsMultipleDtl() {
		return isMultipleDtl;
	}


	/**
	 * @param isMultipleDtl the isMultipleDtl to set
	 */
	public void setIsMultipleDtl(Short isMultipleDtl) {
		this.isMultipleDtl = isMultipleDtl;
	}


	/**
	 * @return the departId
	 */
	public Long getDepartId() {
		return departId;
	}


	/**
	 * @param departId the departId to set
	 */
	public void setDepartId(Long departId) {
		this.departId = departId;
	}


	/**
	 * @return the coacode_x
	 */
	public String getCoacode_x() {
		return coacode_x;
	}


	/**
	 * @param coacode_x the coacode_x to set
	 */
	public void setCoacode_x(String coacode_x) {
		this.coacode_x = coacode_x;
	}

}
