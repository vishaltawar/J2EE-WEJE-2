package com.jspider.onetomany.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.TransactionException;

import com.jspider.onetomany.dto.CompanyDTO;
import com.jspider.onetomany.dto.EmployeeDTO;

public class CompanyemployeeDAO {
	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;

	private static void opentConnection() {
		entityManagerFactory = Persistence.createEntityManagerFactory("ManyToOne");
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
			CompanyDTO company = new CompanyDTO();
			company.setId(3);
			company.setName("Google");
			company.setLocation("Mumbai");
			entityManager.persist(company);

			EmployeeDTO employee1 = new EmployeeDTO();
			employee1.setId(6);
			employee1.setName("Sandip");
			employee1.setEmail("nil@gmail.com");
			employee1.setSalary(75000);
			employee1.setCompany(company);
			entityManager.persist(employee1);

			EmployeeDTO employee2 = new EmployeeDTO();
			employee2.setId(7);
			employee2.setName("Rajesh");
			employee2.setEmail("dip@gmail.com");
			employee2.setSalary(75000);
			employee2.setCompany(company);
			entityManager.persist(employee2);

//			EmployeeDTO employee3 = new EmployeeDTO();
//			employee3.setId(6);
//			employee3.setName("Vikash");
//			employee3.setEmail("vik@gmail.com");
//			employee3.setSalary(30000);
//			employee3.setCompany(company);
//			entityManager.persist(employee3);

			entityTransaction.commit();

		} finally {
			clossConnection();
		}
	}
}
