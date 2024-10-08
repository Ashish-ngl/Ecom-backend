package com.ashish.ecom.dto;


import com.ashish.ecom.entities.Address;
import com.ashish.ecom.entities.Customer;
import com.ashish.ecom.entities.Order;
import com.ashish.ecom.entities.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
