package com.jspider.product.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.product.entity.Product;
import com.jspider.product.repository.ProductRepository;

@Service
public class ProductSevices {
	
	@Autowired
	ProductRepository repository;

	public Product addProduct(Product product) {
		Product productResult = repository.save(product);
		return productResult;
	}

	public List<Product> getAllProduct() {
		List<Product> allProduct = repository.findAll();
		return allProduct;
	}

	public Product findProductById(int id) {
		Product product = repository.findById(id).orElse(null);
		return product;
	}

	public Product updteProduct(Product product) {
		Product product1 = repository.findById(product.getId()).orElse(null);
		if(product1!=null) {
			product1.setName(product.getName());
			product1.setPrice(product.getPrice());
			product1.setBrand(product.getBrand());
			product1.setColor(product.getColor());
			product1.setWeigth(product.getWeigth());
			product1.setDate(product.getDate());
			
			repository.save(product1);
			
			return product1;
		}
		return product1;
		
	}

	

	

	

}
