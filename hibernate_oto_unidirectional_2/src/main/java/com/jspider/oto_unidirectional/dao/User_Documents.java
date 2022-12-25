package com.jspider.oto_unidirectional.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspider.oto_unidirectional.dto.Documents;
import com.jspider.oto_unidirectional.dto.User;

public class User_Documents {
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
			user1.setId(1);
			user1.setName("Aakash");
			user1.setEmail("aakash1012@gamil.com");
			user1.setContact(8889879870L);
			
			User user2=new User();
			user2.setId(2);
			user2.setName("Vishal");
			user2.setEmail("vishal2526@gamil.com");
			user2.setContact(7579879870L);
			
			
			Documents documents1=new Documents();
			documents1.setId(1);
			documents1.setAdharNumber(637666458333L);
			documents1.setPanNumber("BSNPT4367");
			documents1.setVoterID(10321);
			
			Documents documents2=new Documents();
			documents2.setId(2);
			documents2.setAdharNumber(765666458333L);
			documents2.setPanNumber("BsPNT4457");
			documents2.setVoterID(13621);
			
			user1.setDocuments(documents1);
			manager.persist(user1);
			manager.persist(documents1);
			
			user2.setDocuments(documents2);
			manager.persist(user2);
			manager.persist(documents2);
			transaction.commit();			
			
		} finally {
			clossConnection();
		}
	}

}
