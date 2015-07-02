/**
 * 
 */
package com.adibrata.smartdealer.service.repair;

import java.util.List;

import com.adibrata.smartdealer.model.ServiceDtl;
import com.adibrata.smartdealer.model.ServiceHdr;

/**
 * @author Henry Setiap perbaikan menyimpan account payable untuk ditagih
 *
 */
public interface RepairService {
	public void Save (ServiceHdr serviceHdr, List<ServiceDtl> serviceDtls);
	
	public List Paging(int CurrentPage, String WhereCond, String SortBy);
	public double TotalRecord(String WherCond);
	public ServiceHdr View (long id);
}
