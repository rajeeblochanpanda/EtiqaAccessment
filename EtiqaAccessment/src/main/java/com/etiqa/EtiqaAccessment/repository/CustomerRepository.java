package com.etiqa.EtiqaAccessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etiqa.EtiqaAccessment.entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

}
