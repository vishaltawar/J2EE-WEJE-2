package com.jspider.onetomay.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspider.onetomay.dto.Mobile;
import com.jspider.onetomay.dto.Mobile_Brand;

public class Mobile_Brands {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;

	private static void openConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("OneToMany_2");
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
				;
			} catch (TransactionException e) {
				System.out.println("Trasanction is commited");
			}
		}
	}

	public static void main(String[] args) {
		try {
			openConnection();
			entityTransaction.begin();
			Mobile mobile = new Mobile();
			mobile.setName("xiaomi");
			mobile.setMadeIn("China");

			Mobile_Brand mobileBrand1 = new Mobile_Brand();
			mobileBrand1.setId(4);
			mobileBrand1.setModelName("Redmi 9A");
			mobileBrand1.setPrice(6499.00);

			Mobile_Brand mobileBrand2 = new Mobile_Brand();
			mobileBrand2.setId(5);
			mobileBrand2.setModelName("Redmi Note 10");
			mobileBrand2.setPrice(11999.00);

			Mobile_Brand mobileBrand3 = new Mobile_Brand();
			mobileBrand3.setId(6);
			mobileBrand3.setModelName("Redmi Note 10T 5G");
			mobileBrand3.setPrice(13999.00);

			List<Mobile_Brand> mobiles = Arrays.asList(mobileBrand1, mobileBrand2, mobileBrand3);
			mobile.setBrands(mobiles);
			entityManager.persist(mobile);
			entityManager.persist(mobileBrand1);
			entityManager.persist(mobileBrand2);
			entityManager.persist(mobileBrand3);
			entityTransaction.commit();

		} finally {
			clossConnection();
		}
	}
}
