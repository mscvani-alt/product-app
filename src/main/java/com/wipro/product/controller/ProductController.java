package com.wipro.product.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.product.entity.Product;
import com.wipro.product.service.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
private final ProductService service;

public ProductController(ProductService service)
{
	this.service=service;
}

@PostMapping
public Product createProduct(@RequestBody Product p)
{
	return service.saveProduct(p);
}

@GetMapping
public List<Product> getAllProducts()
{
	return service.getAllProducts();
}

/*@GetMapping("/{id}")
public ResponseEntity<Product> getProductById(@PathVariable("id") Long pid)
{
	return service.getProductById(pid).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
}*/
}


		


