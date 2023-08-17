package com.example.demo.controller.customer;

import com.example.demo.service.customer.CustomerService;
import com.example.demo.entity.customer.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value={"/rest/customers","/api/customers"})
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	/**
	 * 取得所有數據
	 * @return
	 */
	@GetMapping
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}

	/**
	 * 依照PK取得數據
	 * @return
	 */
	@GetMapping("/{id}")
	public Customer getCustomerById(@PathVariable Long id) {
		return customerService.getCustomerById(id);
	}

	/**
	 * 依照條件取得所有數據
	 * @return
	 */
	@GetMapping("/list")
	public List<Customer> listCustomer(@RequestBody Customer Customer) {
		return customerService.listCustomer(Customer);
	}

	/**
	 * 建立數據
	 * @return
	 */
	@PostMapping(value = "")
	public Customer createCustomer(@RequestBody Customer Customer) {
		return customerService.createCustomer(Customer);
	}


	/**
	 * 依照PK更新數據
	 * @return
	 */
	@PutMapping("/{id}")
	public Customer updateCustomer(@PathVariable Long id, @RequestBody Customer Customer) {
		// check Customer exist or other logic...
		Customer.setId(id);
		return customerService.updateCustomer(Customer);
	}


	/**
	 * 依照PK刪除數據
	 * @return
	 */
	@DeleteMapping("/{id}")
	public void deleteCustomer(@PathVariable Long id) {
		customerService.deleteCustomer(id);
	}
}
