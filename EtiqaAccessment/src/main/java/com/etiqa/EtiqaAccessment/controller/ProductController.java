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

import com.etiqa.EtiqaAccessment.entity.Product;
import com.etiqa.EtiqaAccessment.services.ProductServices;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/product")
@Slf4j
@Tag(name = "Product Controller", description = "Product Api")
public class ProductController {

	@Autowired
	ProductServices productServices;

	@PostMapping("/addProduct")
	public String saveProduct(@RequestBody Product product) {
		productServices.save(product);
		return "Added Product with id : " + product.getId();
	}

	@GetMapping("/findAllProducts")
	public List<Product> getProducts() {
		return productServices.findAll();
	}

	@PutMapping("/updateProduct/{id}")
	public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
		log.debug("Update Product updateProduct {}", product);
		product.setId(id);
		return productServices.updateProduct(product);
	}

	@GetMapping("/findAllProducts/{id}")
	public Optional<Product> getProduct(@PathVariable Long id) {
		return productServices.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteProduct(@PathVariable Long id) {
		productServices.deleteById(id);
		return "Product deleted with id : " + id;
	}
}
