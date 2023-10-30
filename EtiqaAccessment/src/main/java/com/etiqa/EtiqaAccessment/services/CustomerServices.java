package com.etiqa.EtiqaAccessment.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.etiqa.EtiqaAccessment.entity.Customer;

@Service
public interface CustomerServices {

	public Customer save(Customer book);
	public List<Customer> findAll();
	public Optional<Customer> findById(Long id);
	public void deleteById(Long id);
	public Customer updateCustomer(Customer customer);
}
