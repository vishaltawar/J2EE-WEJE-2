package com.jspider.hibernate2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspider.hibernate2.dto.HusbandDTO;
import com.jspider.hibernate2.dto.WifeDTO;

public class HusbandWifeDAO {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;

	private static void openConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("OneToOne");
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
		try {
			entityTransaction.rollback();
		} catch (Exception e) {
			System.out.println("Transaction is Commited");
		}
	}
	public static void main(String[] args) {
		try {
		openConnection();
		entityTransaction.begin();
//		WifeDTO wife=new WifeDTO();
//		wife.setId(1);
//		wife.setName("Laila");
//		wife.setEmail("laila@gmail.com");
//		wife.setAge(24);
//		wife.setContact(8877897897L);
//		entityManager.persist(wife);
		
		//********** Jabardasti ki Shadi ***********//
		WifeDTO wife=entityManager.find(WifeDTO.class, 1);
		//******************************************//
		HusbandDTO husband=new HusbandDTO();
		husband.setId(4);
		husband.setName("Akash");
		husband.setEmail("akash@gmial.com");
		husband.setAge(25);
		husband.setContact(8978978978L);
		husband.setWife(wife);
		entityManager.persist(husband);
		entityTransaction.commit();
		} finally {
			clossConnection();

		}
	}

}
