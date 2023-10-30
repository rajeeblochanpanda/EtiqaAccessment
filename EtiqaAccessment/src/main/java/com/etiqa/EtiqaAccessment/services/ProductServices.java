package com.etiqa.EtiqaAccessment.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.etiqa.EtiqaAccessment.entity.Product;

@Service
public interface ProductServices {

	Product save(Product product);

	List<Product> findAll();

	Optional<Product> findById(Long id);

	void deleteById(Long id);

	Product updateProduct(Product product);

}
