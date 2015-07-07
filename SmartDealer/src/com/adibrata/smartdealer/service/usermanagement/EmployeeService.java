/**
 * 
 */
package com.adibrata.smartdealer.service.usermanagement;

import java.util.List;

import com.adibrata.smartdealer.model.*;
import com.adibrata.smartdealer.service.SeviceBase;
/**
 * @author Henry
 *
 */
public interface EmployeeService extends SeviceBase {
	public void SaveAdd(Employee employee);
	public void SaveEdit(Employee employee);
	public void SaveDel(Employee employee);
	public List<Employee>  Paging(int CurrentPage, String WhereCond, String SortBy);
	public List<Employee> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast);
	
	
	public Employee View(long id);
}
