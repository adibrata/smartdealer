package com.adibrata.smartdealer.service.purchase;

import java.util.List;

import com.adibrata.smartdealer.model.BankAccount;
import com.adibrata.smartdealer.model.PurchaseInvoice;
import com.adibrata.smartdealer.model.PurchaseOrderHdr;
import com.adibrata.smartdealer.model.SalesOrderHdr;
import com.adibrata.smartdealer.service.SeviceBase;

public interface PurchaseInvoiceService  extends SeviceBase {
	public void Save(PurchaseInvoice purchaseInvoice);

	
	public SalesOrderHdr viewSalesOrderHdr (long id);
	public PurchaseInvoice View(long id);

}
