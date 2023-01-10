//package com.jspider.springmvc.repository;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.EntityTransaction;
//import javax.persistence.Persistence;
//import javax.persistence.Query;
//
//import org.hibernate.TransactionException;
//
//import com.jspider.springmvc.pojo.AdminPojo;
//
//public class AdminRepository {
//	
//	
//	private static EntityManagerFactory entityManagerFactory;
//	private static EntityManager entityManager;
//	private static EntityTransaction entityTransaction;
//	private static Query query;
//	private String jpql;
//
//	public static void openConnection() {
//		entityManagerFactory = Persistence.createEntityManagerFactory("student");
//		entityManager = entityManagerFactory.createEntityManager();
//		entityTransaction = entityManager.getTransaction();
//
//	}
//
//	public static void clossConnection() {
//		if (entityManagerFactory != null) {
//			entityManagerFactory.close();
//		}
//		if (entityManager != null) {
//			entityManager.close();
//		}
//		if (entityTransaction != null) {
//			try {
//
//				entityTransaction.rollback();
//			} catch (TransactionException e) {
//				System.out.println("Transaction Already Commited");
//			}
//		}
//	}
//	
//	public AdminPojo adminLogin(String username, String password) {
//		openConnection();
//		entityTransaction.begin();
//
//		jpql = "from AdminPojo where username = '" + username + "' and password = '" + password + "'";
//		query = entityManager.createQuery(jpql);
//		List<AdminPojo> resultList = query.getResultList();
//		for (AdminPojo adminPojo : resultList) {
//			return adminPojo;
//		}
//
//		entityTransaction.commit();
//		clossConnection();
//
//		return null;
//
//	}
//
//	public AdminPojo addAdmin(String name, String username, String password) {
//		openConnection();
//		entityTransaction.begin();
//		AdminPojo adminPojo = new AdminPojo();
//		adminPojo.setName(name);
//		adminPojo.setUsername(username);
//		adminPojo.setPassword(password);
//		entityManager.persist(adminPojo);
//		entityTransaction.commit();
//
//		clossConnection();
//		return adminPojo;
//	}
//
//}
