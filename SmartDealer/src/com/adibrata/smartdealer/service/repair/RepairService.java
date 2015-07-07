/**
 * 
 */
package com.adibrata.smartdealer.service.repair;

import java.util.List;

import com.adibrata.smartdealer.model.BankAccount;
import com.adibrata.smartdealer.model.ServiceDtl;
import com.adibrata.smartdealer.model.ServiceHdr;
import com.adibrata.smartdealer.model.Workshop;
import com.adibrata.smartdealer.service.SeviceBase;

/**
 * @author Henry Setiap perbaikan menyimpan account payable untuk ditagih
 *
 */
public interface RepairService  extends SeviceBase {
	public void Save(ServiceHdr serviceHdr, List<ServiceDtl> serviceDtls);

	public List<Workshop> Paging(int CurrentPage, String WhereCond,
			String SortBy);
	public List<Workshop> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast);
	public long TotalRecord(String WherCond);

	public ServiceHdr View(long id);
}
