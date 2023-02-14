package com.jspider.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.jspider.product.entity.Product;
import com.jspider.product.response.ProductResponse;
import com.jspider.product.services.ProductSevices;

@Controller
public class ProductController {
	
	@Autowired
	ProductSevices service;
	
	// ADD Product
	@PostMapping("/add")
	public ResponseEntity<ProductResponse> addProduct(@RequestBody Product product) {
		Product productResult = service.addProduct(product);
		if(productResult!=null) {
			return new ResponseEntity< ProductResponse>(new ProductResponse("OK", "Product Successfully Added", productResult, null), HttpStatus.OK);
		}
		return new ResponseEntity< ProductResponse>(new ProductResponse("FAIL", "Product Not Added", productResult, null), HttpStatus.NOT_FOUND);
		
	}
	
	// Get All Product
	@GetMapping("/getAllProduct")
	public ResponseEntity<ProductResponse>  getAllProduct(){
		List<Product> allProduct =service.getAllProduct();
		if(allProduct!=null) {
			return new ResponseEntity< ProductResponse>(new ProductResponse("OK", "Product Successfully Found", null, allProduct), HttpStatus.OK);
		
		}
		return new ResponseEntity< ProductResponse>(new ProductResponse("FAIL", "Product Not Added", null, allProduct), HttpStatus.NOT_FOUND);
	}

	// Get product by Id
	@GetMapping("/getById{id}")
	public ResponseEntity<ProductResponse> findProductById(@PathVariable int id){
		Product product = service.findProductById(id);
		if(product!=null) {
			return new ResponseEntity<ProductResponse>(new ProductResponse("OK", "Product Successfully Found", product, null),HttpStatus.OK);
		}
		return new ResponseEntity<ProductResponse>(new ProductResponse("FAIL", "Product Not Found", product, null),HttpStatus.NOT_FOUND);
	}
	
	@PutMapping("/updateProduct")
	public ResponseEntity<ProductResponse> updteProduct(@RequestBody Product product){
		Product updteProduct = service.updteProduct(product);
		if(updteProduct!=null) {
			return new ResponseEntity<ProductResponse>(new ProductResponse("OK", "Product Successfully Updeted", updteProduct, null),HttpStatus.OK);
		}
		return new ResponseEntity<ProductResponse>(new ProductResponse("FAIL", "Product Not Found", updteProduct, null),HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/deleteProduct{id}")
	public ResponseEntity<ProductResponse> deleteProductById(@PathVariable int id){
		Product product = service.deleteProductById(id);
		if(product!=null) {
			return new ResponseEntity<ProductResponse>(new ProductResponse("OK", "Product Deleted Successfully", product, null),HttpStatus.OK);
		}
		return new ResponseEntity<ProductResponse>(new ProductResponse("FAIL", "Product Not Found", product, null),HttpStatus.NOT_FOUND);
	}}
