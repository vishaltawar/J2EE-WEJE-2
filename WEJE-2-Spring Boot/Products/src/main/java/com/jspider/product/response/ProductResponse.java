package com.jspider.product.response;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.jspider.product.entity.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductResponse {

	private String status;
	private String description;
	private Product product;
	private List<Product> products;
}
