package com.jspider.productmvc.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.TransactionException;
import org.springframework.stereotype.Repository;

import com.jspider.productmvc.pojo.Admin;
import com.jspider.productmvc.pojo.ProductPojo;

@Repository
public class ProductRepository {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	private static Query query;
	private String jpql;

	public static void openConnection() {

		factory = Persistence.createEntityManagerFactory("product");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}

	public static void closeConnection() {

		if (factory != null) {
			factory.close();
		}

		if (manager != null) {
			manager.close();
		}
		if (transaction != null) {
			try {
				transaction.rollback();
			} catch (TransactionException e) {
				System.out.println("Transaction Already Commited");
			}
		}
	}

	public ProductPojo addProduct(String name, double price, String brand, String color) {
		openConnection();
		transaction.begin();
		
		ProductPojo pojo=new ProductPojo();
		pojo.setName(name);
		pojo.setPrice(price);
		pojo.setBrand(brand);
		pojo.setColor(color);
		
		manager.persist(pojo);
		transaction.commit();
		closeConnection();
		return pojo;
	}

	public ProductPojo serchProduct(int id) {
		openConnection();
		transaction.begin();
		
		ProductPojo product = manager.find(ProductPojo.class, id);
		transaction.commit();
		closeConnection();
		return product;
		
	}

	public ProductPojo updateProduct(int id) {
		openConnection();
		transaction.begin();
		
		ProductPojo product = manager.find(ProductPojo.class, id);
		transaction.commit();
		closeConnection();
		return product;
		
	}

	public ProductPojo updateProductDetails(int id, String name, double price, String brand, String color) {
		openConnection();
		transaction.begin();
		
		ProductPojo product = manager.find(ProductPojo.class, id);
		product.setName(name);
		product.setPrice(price);
		product.setBrand(brand);
		product.setColor(color);
		manager.persist(product);
		transaction.commit();
		closeConnection();
		return product;
		
	}

	public List<ProductPojo> allProduct() {
		openConnection();
		transaction.begin();
	
		jpql = "from ProductPojo";
		query = manager.createQuery(jpql);
		List<ProductPojo> producsList = (List<ProductPojo>) query.getResultList();
		transaction.commit();
		closeConnection();
		return producsList;
	}

	public ProductPojo removeProduct(int id) {
		openConnection();
		transaction.begin();
		ProductPojo product = manager.find(ProductPojo.class, id);
		if(product!=null) {
		manager.remove(product);
		}
		transaction.commit();
		closeConnection();
		
		return product;	
		
	}

	public Admin adminLogin(String username, String password) {
		openConnection();
		transaction.begin();
		jpql = "from Admin where username = '" + username + "' and password = '" + password + "'";
		query = manager.createQuery(jpql);
		List<Admin> resultList = query.getResultList();
		for (Admin admin : resultList) {
			return admin;
		}
		transaction.commit();
		closeConnection();
		return null;
		
	}

}
