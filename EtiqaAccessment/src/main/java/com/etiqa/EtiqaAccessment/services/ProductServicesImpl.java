package com.etiqa.EtiqaAccessment.services;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etiqa.EtiqaAccessment.entity.Product;
import com.etiqa.EtiqaAccessment.repository.ProductRepository;

@Service
public class ProductServicesImpl implements ProductServices {

	@Autowired
	ProductRepository productRepository;

	@Override
	public Product save(Product product) {
		return productRepository.save(product);

	}

	@Override
	public Product updateProduct(Product product) {
		Product prod = new Product();
		prod.setId(product.getId());
		prod.setBookAuther(product.getBookAuther());
		prod.setBookPrice(product.getBookPrice());
		prod.setBookQuantity(product.getBookQuantity());
		prod.setBookTitle(product.getBookTitle());
		return productRepository.save(prod);

	}

	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public Optional<Product> findById(Long id) {
		return productRepository.findById(id);
	}

	@Override
	public void deleteById(Long id) {
		productRepository.deleteById(id);

	}

}
