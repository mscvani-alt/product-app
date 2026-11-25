package com.wipro.product.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.wipro.product.entity.Product;
import com.wipro.product.repository.ProductRepository;

@Service
public class ProductService {

	private final ProductRepository repository;
	
	public ProductService(ProductRepository repository)
	{
		this.repository=repository;
	}
	public Product saveProduct(Product p) {
		return repository.save(p);
			}
	public List<Product> getAllProducts()
	{
		return repository.findAll();
	}
	public Optional<Product> getProductById(Long pid)
	{
		return repository.findById(pid);
	}
	
	public void deleteProduct(Long pid)
	{
		repository.deleteById(pid);
	}
}
