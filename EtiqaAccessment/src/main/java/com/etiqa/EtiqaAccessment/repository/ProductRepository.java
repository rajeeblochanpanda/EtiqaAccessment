package com.etiqa.EtiqaAccessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.etiqa.EtiqaAccessment.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
