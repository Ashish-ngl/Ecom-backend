package com.ashish.ecom.service;


import com.ashish.ecom.dto.Purchase;
import com.ashish.ecom.dto.PurchaseResponse;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
