package com.jspider.manytomany_bidectional.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspider.manytomany_bidectional.dto.Customer;
import com.jspider.manytomany_bidectional.dto.Movie;
import com.mysql.cj.TransactionEventHandler;

public class Customer_Movie {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("ManyToMany_Bidirectional");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();

	}

	private static void closeConnection() {
		if (factory != null) {
			factory.close();
		}
		if (manager != null) {
			manager.close();
		}
		if (transaction != null) {
			try {
				transaction.rollback();
			}

			catch (TransactionException e) {
				System.out.println("Commited");

			}
		}
	}
	public static void main(String[] args) {
		try {
			openConnection();
			transaction.begin();
			
			Movie movie1=new Movie();
			movie1.setId(1);
			movie1.setName("KGF-2");
			movie1.setPrice(150);
			
			Movie movie2=new Movie();
			movie2.setId(2);
			movie2.setName("Katara");
			movie2.setPrice(130);
			
			List<Movie> movies=Arrays.asList(movie1,movie2);
			
			Customer customers1=new Customer();
			customers1.setId(1);
			customers1.setName("Vaibhav");
			customers1.setContact(7788996600L);
			
			Customer customers2=new Customer();
			customers2.setId(2);
			customers2.setName("Dipak");
			customers2.setContact(9878996600L);
			
			List<Customer> customers=Arrays.asList(customers1,customers2);
			
			customers1.setMovies(movies);
			customers2.setMovies(movies);
			manager.persist(customers1);
			manager.persist(customers2);
			
			
			movie1.setCustomers(customers);
			movie2.setCustomers(customers);
			manager.persist(movie1);
			manager.persist(movie2);
			
			transaction.commit();
			
			
		} finally {
			closeConnection();
		}
	}

}
