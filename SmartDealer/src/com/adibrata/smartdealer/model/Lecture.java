package com.adibrata.smartdealer.model;

// Generated Jun 8, 2015 10:21:14 AM by Hibernate Tools 4.3.1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Lecture generated by hbm2java
 */
@Entity
@Table(name = "Lecture", catalog = "SmartDealer", uniqueConstraints = @UniqueConstraint(columnNames = "LastName"))
public class Lecture implements java.io.Serializable {

	private int id;
	private Date dtmCrt;
	private Date dtmUpd;
	private String firstName;
	private String lastName;

	public Lecture() {
	}

	public Lecture(int id, String lastName) {
		this.id = id;
		this.lastName = lastName;
	}

	public Lecture(int id, Date dtmCrt, Date dtmUpd, String firstName,
			String lastName) {
		this.id = id;
		this.dtmCrt = dtmCrt;
		this.dtmUpd = dtmUpd;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dtmCrt", length = 23)
	public Date getDtmCrt() {
		return this.dtmCrt;
	}

	public void setDtmCrt(Date dtmCrt) {
		this.dtmCrt = dtmCrt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dtmUpd", length = 23)
	public Date getDtmUpd() {
		return this.dtmUpd;
	}

	public void setDtmUpd(Date dtmUpd) {
		this.dtmUpd = dtmUpd;
	}

	@Column(name = "firstName")
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "LastName", unique = true, nullable = false, length = 50)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
