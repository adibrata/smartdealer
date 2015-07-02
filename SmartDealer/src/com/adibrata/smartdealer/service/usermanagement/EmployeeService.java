/**
 * 
 */
package com.adibrata.smartdealer.service.usermanagement;

import java.util.List;

import com.adibrata.smartdealer.model.*;
/**
 * @author Henry
 *
 */
public interface EmployeeService {
	public void SaveAdd(Employee employee);
	public void SaveEdit(Employee employee);
	public void SaveDel(Employee employee);
	public List<Employee>  Paging(int CurrentPage, String WhereCond, String SortBy);
	public long TotalRecord(String WherCond);
	
	public Employee View(long id);
}
