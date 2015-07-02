package com.adibrata.smartdealer.action.usermanagement;

/**
 * @author Henry
 *
 */
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.Preparable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import util.adibrata.framework.exceptionhelper.ExceptionEntities;
import util.adibrata.framework.exceptionhelper.ExceptionHelper;
import util.adibrata.support.common.*;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.setting.AssetDocMasterService;
import com.adibrata.smartdealer.service.usermanagement.EmployeeService;

public class EmployeeAction extends ActionSupport implements Preparable {

	private String mode;
	private EmployeeService employeeService;
	private Partner partner;
	private Office office;
	private Employee employee;
	private List<Employee> lstEmployee;

	/**
	 * @return the mode
	 */
	public String getMode() {
		return mode;
	}

	/**
	 * @return the employeeService
	 */
	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	/**
	 * @return the partner
	 */
	public Partner getPartner() {
		return partner;
	}

	/**
	 * @return the office
	 */
	public Office getOffice() {
		return office;
	}

	/**
	 * @return the employee
	 */
	public Employee getEmployee() {
		return employee;
	}

	/**
	 * @return the lstEmployee
	 */
	public List<Employee> getLstEmployee() {
		return lstEmployee;
	}

	/**
	 * @param mode the mode to set
	 */
	public void setMode(String mode) {
		this.mode = mode;
	}

	/**
	 * @param employeeService the employeeService to set
	 */
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	/**
	 * @param partner the partner to set
	 */
	public void setPartner(Partner partner) {
		this.partner = partner;
	}

	/**
	 * @param office the office to set
	 */
	public void setOffice(Office office) {
		this.office = office;
	}

	/**
	 * @param employee the employee to set
	 */
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	/**
	 * @param lstEmployee the lstEmployee to set
	 */
	public void setLstEmployee(List<Employee> lstEmployee) {
		this.lstEmployee = lstEmployee;
	}

	public EmployeeAction() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void prepare() throws Exception {
		// TODO Auto-generated method stub

	}

}
