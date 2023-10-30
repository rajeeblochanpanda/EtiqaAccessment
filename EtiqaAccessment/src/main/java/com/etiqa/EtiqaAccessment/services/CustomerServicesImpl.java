package com.etiqa.EtiqaAccessment.services;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.etiqa.EtiqaAccessment.entity.Customer;
import com.etiqa.EtiqaAccessment.entity.Product;
import com.etiqa.EtiqaAccessment.repository.CustomerRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CustomerServicesImpl implements CustomerServices {

	
	@Autowired
	CustomerRepository customerRepository;
	
	public Customer save(Customer customer) {
		return customerRepository.save(customer);
	}
	@Override
	public Customer updateCustomer(Customer customer) {
		log.info("updateCustomer  {} ",customer);
		try {
		Customer cust = new Customer();
		cust.setId(customer.getId());
		cust.setFirstName(customer.getFirstName());
		cust.setLastName(customer.getLastName());
		cust.setOfficeEmail(customer.getOfficeEmail());
		cust.setPersonalEmail(customer.getPersonalEmail());
		cust.setFamilyMembers(customer.getFamilyMembers());
		return customerRepository.save(cust);
		}
		catch (Exception e) {
			log.error("Data not Updated updateCustomer {}"+e);
			return customer;
		}
	}


	public List<Customer> findAll() {		
		return customerRepository.findAll();
	}

	public Optional<Customer> findById(Long id) {		
		return customerRepository.findById(id);
	}

	public void deleteById(Long id) {
		customerRepository.deleteById(id);
		
	}

}
