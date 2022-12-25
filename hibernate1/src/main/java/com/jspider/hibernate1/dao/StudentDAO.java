package com.jspider.hibernate1.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.TransactionException;

import com.jspider.hibernate1.dto.StudentDTO;

public class StudentDAO {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	private static String query;

	private static void openConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("student");
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
		} catch (TransactionException e) {
			System.out.println("Transation is commited");

		}
	}

	public static void main(String[] args) {
		try {
			openConnection();
			entityTransaction.begin();

//		*************Insert Operation *************

//			StudentDTO studentDTO = new StudentDTO();
//			studentDTO.setId(1);
//			studentDTO.setName("Vishal");
//			studentDTO.setEmail("vishal@gmail.com");
//			studentDTO.setContact(9994567894L);
//			studentDTO.setCity("Dhule");
//			entityManager.persist(studentDTO);
//			entityTransaction.commit();

//			*************Select Operation *************

			// StudentDTO studentDTO=entityManager.find(StudentDTO.class, 6);
			// System.out.println(studentDTO);
			// entityTransaction.commit();

//			******************* Update using JPQL *****************************//
			query="from StudentDTO";
			Query createQuery =entityManager.createQuery(query);
			List<StudentDTO> studentList=createQuery.getResultList();
			for(int i=0;i<studentList.size();i++) {
				System.out.println(studentList.get(i));
			}
//			*************Update Operation *************		

			//StudentDTO studentDTO = entityManager.find(StudentDTO.class, 6);
			//studentDTO.setName("Vishal");
			//entityTransaction.commit();
//			******************* Update using JPQL *****************************//

//			query = "update StudentDTO set name='Aakash' where id=6";
//			Query createQuery = entityManager.createQuery(query);
//			int result=createQuery.executeUpdate();
//			System.out.println(result);
//			*************Delete Operation *************		

//			StudentDTO studentDTO=entityManager.find(StudentDTO.class, 3);
//			entityManager.remove(studentDTO);
//			entityTransaction.commit();
//			

		} finally {
			clossConnection();

		}
	}

}
