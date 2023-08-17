package com.example.demo.service.customer;

import com.example.demo.dao.customer.CustomerRepository;
import com.example.demo.entity.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerRepository customerRepository;

	public List<Customer> getAllCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public List<Customer> listCustomer(Customer Customer) {
		Example<Customer> example = Example.of(Customer);
		return customerRepository.findAll(example);
	}

	public Customer getCustomerById(Long id) {
		return customerRepository.findById(id).orElse(null);
	}

	public Customer createCustomer(Customer Customer) {
		return customerRepository.save(Customer);
	}

	public Customer updateCustomer(Customer Customer) {
		return customerRepository.save(Customer);
	}

	public void deleteCustomer(Long id) {
		customerRepository.deleteById(id);
	}
}
