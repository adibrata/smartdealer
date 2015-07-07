package com.adibrata.smartdealer.service.purchase;

import java.util.List;

import com.adibrata.smartdealer.model.BankAccount;
import com.adibrata.smartdealer.model.PurchaseInvoice;
import com.adibrata.smartdealer.model.PurchaseOrderHdr;
import com.adibrata.smartdealer.model.SalesOrderHdr;

public interface PurchaseInvoiceService {
	public void Save(PurchaseInvoice purchaseInvoice);

	public List<PurchaseOrderHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy);
	public List<PurchaseOrderHdr> Paging(int CurrentPage, String WhereCond, String SortBy, boolean islast);
	public long TotalRecord(String WherCond);
	public SalesOrderHdr viewSalesOrderHdr (long id);
	public PurchaseInvoice View(long id);

}
