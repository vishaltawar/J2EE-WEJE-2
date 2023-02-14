package com.jspider.productmvc.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.jspider.productmvc.pojo.Admin;
import com.jspider.productmvc.pojo.ProductPojo;
import com.jspider.productmvc.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository repository;

	public ProductPojo addProduct(String name, double price, String brand, String color) {

		ProductPojo product = repository.addProduct(name, price, brand, color);
		return product;

	}

	public ProductPojo serchProduct(int id) {
		ProductPojo product = repository.serchProduct(id);
		return product;

	}

	public ProductPojo updateProduct(int id) {
		ProductPojo product = repository.updateProduct(id);
		return product;

	}

	public ProductPojo updateProductDetails(int id, String name, double price, String brand, String color) {

		ProductPojo productDetails = repository.updateProductDetails(id, name, price, brand, color);
		return productDetails;
	}

	public List<ProductPojo> allProduct() {
		List<ProductPojo> allProduct = repository.allProduct();
		return allProduct;
	}

	public ProductPojo removeProduct(int id) {
		ProductPojo product = repository.removeProduct(id);
		return product;

	}
	
	// ***************** Admin Part **********************//

	public Admin adminLogin(String username, String password) {
		Admin login = repository.adminLogin(username,password);
		return login;
		
	}

}
