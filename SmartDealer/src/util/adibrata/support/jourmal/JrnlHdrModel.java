/**
 * 
 */
package util.adibrata.support.jourmal;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType; import javax.persistence.GeneratedValue; import javax.persistence.GenerationType;
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
/*	private static final long serialVersionUID = 1L;
	*/
/*	@TableGenerator(name="jrnlhdrmodel")*/
	@Column(name="jrnlhdrreffno")
	private String jrnlhdrreffno;
	
	/*@TableGenerator(name="jrnlhdrmodel")*/
	@Column(name="jrnlhdramount")
	private long jrnlhdramount;
	
	
	/**
	 * 
	 */
	public JrnlHdrModel() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the jrnlhdrreffno
	 */
	public String getJrnlhdrreffno() {
		return jrnlhdrreffno;
	}


	/**
	 * @return the jrnlhdramount
	 */
	public long getJrnlhdramount() {
		return jrnlhdramount;
	}


	/**
	 * @param jrnlhdrreffno the jrnlhdrreffno to set
	 */
	public void setJrnlhdrreffno(String jrnlhdrreffno) {
		this.jrnlhdrreffno = jrnlhdrreffno;
	}


	/**
	 * @param jrnlhdramount the jrnlhdramount to set
	 */
	public void setJrnlhdramount(long jrnlhdramount) {
		this.jrnlhdramount = jrnlhdramount;
	}



}
