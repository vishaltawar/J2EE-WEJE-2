package com.jspider.springmvc.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspider.springmvc.pojo.StudentPojo;
import com.mysql.cj.Query;

@Repository
public class StudentRepository {

	@Autowired
	StudentPojo pojo;

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	//private static Query query;

	public static void openConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("student");
		entityManager = entityManagerFactory.createEntityManager();
		entityTransaction = entityManager.getTransaction();

	}

	public static void clossConnection() {
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
				System.out.println("Transaction Already Commited");
			}
		}
	}

	public StudentPojo login(String username, String password) {
		openConnection();
		entityTransaction.begin();
		
		// Write logic here...
		
		String custumQuery=" from StudentPojo where username='vtawar' AND password='2526'";
//		entityManager.createQuery(custumQuery);
		
		
		
		entityTransaction.commit();
		clossConnection();
		return pojo;

	}

}
