package com.jspider.onetomay.dao;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspider.onetomay.dto.ChildDTO;
import com.jspider.onetomay.dto.FatherDTO;

public class FatherChildDAO {

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;

	private static void openConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("OneToMany");
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
			FatherDTO father = new FatherDTO();
			father.setId(1);
			father.setName("Ganapatrao");
			father.setAge(75);
			entityManager.persist(father);

			ChildDTO child1 = new ChildDTO();
			child1.setId(1);
			child1.setName("Baburao");
			child1.setAge(55);
			entityManager.persist(child1);

			ChildDTO child2 = new ChildDTO();
			child2.setId(2);
			child2.setName("Shamrao");
			child2.setAge(52);
			entityManager.persist(child2);

			ChildDTO child3 = new ChildDTO();
			child3.setId(3);
			child3.setName("Bhimrao");
			child3.setAge(50);
			entityManager.persist(child3);

			List<ChildDTO> children = Arrays.asList(child1, child2, child3);
			father.setChildren(children);
			entityTransaction.commit();

		} finally {
			clossConnection();
		}
	}
}
