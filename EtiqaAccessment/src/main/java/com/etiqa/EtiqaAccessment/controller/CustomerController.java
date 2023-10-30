package com.etiqa.EtiqaAccessment.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etiqa.EtiqaAccessment.entity.Customer;
import com.etiqa.EtiqaAccessment.services.CustomerServices;

@RestController
@RequestMapping("/Customer")
public class CustomerController {

	@Autowired
	CustomerServices customerServices;

	@PostMapping("/addCustomer")
	public String saveCustomer(@RequestBody Customer customer) {
		customerServices.save(customer);
		return "Added Customer with id : " + customer.getId();
	}

	@GetMapping("/findAllCustomers")
	public List<Customer> getCustomers() {
		return customerServices.findAll();
	}

	@PutMapping("/updateCustomer/{id}")
	public Customer updateCustomer(@PathVariable Long id, @RequestBody Customer customer) {
		customer.setId(id);
		return customerServices.save(customer);
	}

	@GetMapping("/findAllCustomers/{id}")
	public Optional<Customer> getCustomer(@PathVariable Long id) {
		return customerServices.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteCustomer(@PathVariable Long id) {
		customerServices.deleteById(id);
		return "Customer deleted with id : " + id;
	}

}
