package com.onlinebookstore.service;

import java.util.Set;

import com.onlinebookstore.entity.Customer;
import com.onlinebookstore.entity.PurchaseDetail;
import com.onlinebookstore.entity.PurchaseHistory;

public interface PaymentService {

	String createTransaction(Customer customer);
	
	Set<PurchaseHistory> getPurchaseHistories(Customer customer);
	
	Set<PurchaseDetail> getPurchaseDetails(PurchaseHistory purchaseHistory);

	PurchaseHistory getPurchaseHistory(Customer customer, String transId);
}
