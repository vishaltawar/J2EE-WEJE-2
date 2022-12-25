package com.jspider.manytomanybidirectional.dao;

import java.util.List;

import java.util.Arrays;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspider.manytomanybidirectional.dto.CustomerDTO;
import com.jspider.manytomanybidirectional.dto.ProductDTO;

public class customerProductDAO {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;

	private static void opentConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("ManyToMany_Bidirectional1");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();
	}

	private static void clossConnection() {
		if (entityManagerFactory != null) {
			entityManagerFactory.close();
		}
		if (entityManager != null) {
			entityManager.close();
		}
		if (entityTransaction != null) {
			try {
				entityTransaction.rollback();
			} catch (TransactionException e) {
				System.out.println("Trasaction is commited");
			}
		}
	}

	public static void main(String[] args) {
		try {
			opentConnection();
			entityTransaction.begin();

			CustomerDTO customer1 = new CustomerDTO();
			customer1.setId(1);
			customer1.setName("Vishal");
			customer1.setEmail("vishal2526@gmail.com");
			customer1.setContact(9876987609L);

			CustomerDTO customer2 = new CustomerDTO();
			customer2.setId(2);
			customer2.setName("Aakash");
			customer2.setEmail("aakash1012@gmail.com");
			customer2.setContact(8876987609L);

			CustomerDTO customer3 = new CustomerDTO();
			customer3.setId(3);
			customer3.setName("Dipak");
			customer3.setEmail("dipak18@gmail.com");
			customer3.setContact(7777987609L);

			ProductDTO product1 = new ProductDTO();
			product1.setId(1);
			product1.setName("Bat");
			product1.setPrice(1500.00);
			product1.setCatergory("Sport");

			ProductDTO product2 = new ProductDTO();
			product2.setId(2);
			product2.setName("t-Shurt");
			product2.setPrice(500.00);
			product2.setCatergory("Clothing");
			
			List<ProductDTO> product= Arrays.asList(product1,product2);
			List<CustomerDTO> customer=Arrays.asList(customer1,customer2,customer3);
			
			customer1.setProduct(product);
			customer2.setProduct(product);
			customer3.setProduct(product);
			
			product1.setCustomer(customer);
			product2.setCustomer(customer);
			
			entityManager.persist(customer1);
			entityManager.persist(customer2);
			entityManager.persist(customer3);
			
			entityManager.persist(product1);
			entityManager.persist(product2);
			entityTransaction.commit();

		} finally {
			clossConnection();
		}
	}
}
