package com.jspider.onetomany.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspider.onetomany.dto.Project;
import com.jspider.onetomany.dto.Student;

public class StudentProject {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;

	private static void opentConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("ManyToOne_2");
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
			opentConnection();
			entityTransaction.begin();
			
			Project project=new Project();
			//project.setId(1);
			project.setName("WirelessCharg");
			project.setTechnology("Electronics");
			entityManager.persist(project);			
			
			Student student1=new Student();
			//student1.setId(1);
			student1.setName("Vishal");
			student1.setEmail("vishal2526@gmail.com");
			student1.setContact(7507046889L);
			student1.setProject(project);
			entityManager.persist(student1);
			
			
			Student student2=new Student();
		//	student1.setId(1);
			student2.setName("Jayesh");
			student2.setEmail("jayesh123@gmail.com");
			student2.setContact(8897046889L);
			student2.setProject(project);
			entityManager.persist(student2);
			
			Student student3=new Student();
			//student1.setId(1);
			student3.setName("Kapil");
			student3.setEmail("kapil543@gmail.com");
			student3.setContact(8767046889L);
			student3.setProject(project);			
			entityManager.persist(student3);			

			entityTransaction.commit();

		} finally {
			clossConnection();
		}
	}
}
