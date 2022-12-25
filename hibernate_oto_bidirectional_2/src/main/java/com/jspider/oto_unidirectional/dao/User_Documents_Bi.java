package com.jspider.oto_unidirectional.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspider.oto_unidirectional.dto.Documents;
import com.jspider.oto_unidirectional.dto.User;

public class User_Documents_Bi {
	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;

	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("UserDocument");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}

	private static void clossConnection() {
		if (factory != null) {
			factory.close();
		}
		if (manager != null) {
			manager.close();
		}
		try {
			if(transaction!=null) {
				transaction.rollback();				
			}
		} catch (TransactionException e) {
			System.out.println("Transation is commited");

		}
	}
	public static void main(String[] args) {
		try {
			openConnection();
			transaction.begin();
			User user1=new User();
			//user1.setId(1);
			user1.setName("Dipak");
			user1.setEmail("dipak1818@gamil.com");
			user1.setContact(9989879870L);
			
			User user2=new User();
			//user2.setId(2);
			user2.setName("Tejas");
			user2.setEmail("tejas 0909@gamil.com");
			user2.setContact(7899879870L);
			
			
			Documents documents1=new Documents();
			//documents1.setId(1);
			documents1.setAdharNumber(5656566458333L);
			documents1.setPanNumber("BBTPT1167");
			documents1.setVoterID(45321);
			
			Documents documents2=new Documents();
			//documents2.setId(2);
			documents2.setAdharNumber(878766458333L);
			documents2.setPanNumber("BNPNT3357");
			documents2.setVoterID(68621);
			
			user1.setDocuments(documents1);
			user2.setDocuments(documents2);
			
			documents1.setUser(user1);
			documents2.setUser(user2);
			manager.persist(user1);
			manager.persist(user2);
			manager.persist(documents1);
			manager.persist(documents2);
			
			user2.setDocuments(documents2);
			manager.persist(user2);
			manager.persist(documents2);
			transaction.commit();			
			
		} finally {
			clossConnection();
		}
	}

}
