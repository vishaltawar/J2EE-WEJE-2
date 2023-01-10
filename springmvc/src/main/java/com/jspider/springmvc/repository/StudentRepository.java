package com.jspider.springmvc.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.TransactionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jspider.springmvc.pojo.AdminPojo;
import com.jspider.springmvc.pojo.StudentPojo;

@Repository
public class StudentRepository {

	@Autowired
	StudentPojo pojo;

	private static EntityManagerFactory entityManagerFactory;
	private static EntityManager entityManager;
	private static EntityTransaction entityTransaction;
	private static Query query;
	private String jpql;

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

//	public StudentPojo login(String username, String password) {
//		openConnection();
//		entityTransaction.begin();
//		jpql = "from StudentPojo where username = '" + username + "' and password = '" + password + "'";
//		query = entityManager.createQuery(jpql);
//		List<StudentPojo> resultList = query.getResultList();
//		for (StudentPojo pojo : resultList) {
//			return pojo;
//		}
//		entityTransaction.commit();
//		clossConnection();
//
//		return null;
//	}

	public StudentPojo addStudent(String name, String email, long mobile, String city, String username,
			String password) {
		openConnection();
		entityTransaction.begin();
		StudentPojo pojo = new StudentPojo();
		pojo.setName(name);
		pojo.setEmail(email);
		pojo.setContact(mobile);
		pojo.setCity(city);
		pojo.setUsername(username);
		pojo.setPassword(password);
		entityManager.persist(pojo);
		entityTransaction.commit();

		clossConnection();
		return pojo;
	}

	public StudentPojo search(int id) {
		openConnection();
		entityTransaction.begin();
		StudentPojo pojo = entityManager.find(StudentPojo.class, id);
		entityTransaction.commit();
		clossConnection();

		return pojo;
	}

	public List<StudentPojo> searchAll() {
		openConnection();
		entityTransaction.begin();

		jpql = "from StudentPojo";
		query = entityManager.createQuery(jpql);
		List<StudentPojo> pojos = (List<StudentPojo>) query.getResultList();
		entityTransaction.commit();
		clossConnection();
		return pojos;

	}

	public StudentPojo removeStudent(int id) {
		openConnection();
		entityTransaction.begin();

		StudentPojo pojo = entityManager.find(StudentPojo.class, id);
		if (pojo != null) {
			entityManager.remove(pojo);
		}

		entityTransaction.commit();
		clossConnection();

		return pojo;
	}

	public StudentPojo updateDeatails(int id, String name, String email, long mobile, String city, String username,
			String password) {
		openConnection();
		entityTransaction.begin();
		StudentPojo student = entityManager.find(StudentPojo.class, id);

		// student.setId(id);
		student.setName(name);
		student.setEmail(email);
		student.setContact(mobile);
		student.setCity(city);
		student.setUsername(username);
		student.setPassword(password);
		entityManager.persist(student);
		entityTransaction.commit();
		clossConnection();

		return student;

	}

	public AdminPojo adminLogin(String username, String password) {
		openConnection();
		entityTransaction.begin();

		jpql = "from AdminPojo where username = '" + username + "' and password = '" + password + "'";
		query = entityManager.createQuery(jpql);
		List<AdminPojo> resultList = query.getResultList();
		for (AdminPojo adminPojo : resultList) {
			return adminPojo;
		}

		entityTransaction.commit();
		clossConnection();

		return null;

	}

	public AdminPojo addAdmin(String name, String username, String password) {
		openConnection();
		entityTransaction.begin();
		AdminPojo adminPojo = new AdminPojo();
		adminPojo.setName(name);
		adminPojo.setUsername(username);
		adminPojo.setPassword(password);
		entityManager.persist(adminPojo);
		entityTransaction.commit();

		clossConnection();
		return adminPojo;
	}

}
