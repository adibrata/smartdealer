package com.adibrata.smartdealer.service.purchase;

import java.util.List;

import com.adibrata.smartdealer.model.PurchaseInvoice;

import com.adibrata.smartdealer.model.PurchaseOrderHdr;

public interface PurchaseInvoiceService {
	public void Save(PurchaseInvoice purchaseInvoice);

	public List<PurchaseOrderHdr> Paging(int CurrentPage, String WhereCond,
			String SortBy);

	public long TotalRecord(String WherCond);

	public PurchaseInvoice View(long id);

}
