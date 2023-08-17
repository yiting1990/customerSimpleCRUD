package com.example.demo.service.customer;

import com.example.demo.entity.customer.Customer;

import java.util.List;

public interface CustomerService {
    Customer createCustomer(Customer Customer);
    void deleteCustomer(Long id);
    Customer updateCustomer(Customer Customer);
    List<Customer> getAllCustomers();
    List<Customer> listCustomer(Customer Customer);
    Customer getCustomerById(Long id);
}
