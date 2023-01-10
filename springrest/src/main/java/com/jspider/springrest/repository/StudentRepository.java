package com.jspider.springrest.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.TransactionException;
import org.springframework.context.support.StaticApplicationContext;
import org.springframework.stereotype.Repository;

import com.jspider.springrest.pojo.StudentPojo;

@Repository
public class StudentRepository {

	private static EntityManagerFactory factory;
	private static EntityManager manager;
	private static EntityTransaction transaction;
	private static String jpql;
	private static Query query;

	private static void openConnection() {
		factory = Persistence.createEntityManagerFactory("student");
		manager = factory.createEntityManager();
		transaction = manager.getTransaction();
	}

	private static void closeConnection() {
		if (factory != null) {
			factory.close();
		}
		if (manager != null) {
			manager.close();
		}
		if (transaction != null) {
			try {
				transaction.rollback();
			} catch (TransactionException e) {
				System.out.println("transaction already committed");
			}
		}
	}

	public StudentPojo add(StudentPojo student) {

		openConnection();
		transaction.begin();

		manager.persist(student);
		transaction.commit();

		closeConnection();

		return student;

	}

	public StudentPojo search(int id) {
		openConnection();
		transaction.begin();

		StudentPojo pojo = manager.find(StudentPojo.class, id);
		transaction.commit();
		closeConnection();
		return pojo;

	}

	public StudentPojo delete(int id) {
		openConnection();
		transaction.begin();
		StudentPojo pojo = manager.find(StudentPojo.class, id);
		if (pojo != null) {
			manager.remove(pojo);
		}
		transaction.commit();
		closeConnection();
		return pojo;
		
	}

	public StudentPojo update(StudentPojo student) {
		openConnection();
		transaction.begin();
		StudentPojo pojo = manager.find(StudentPojo.class, student.getId());
		if(pojo!=null) {
			pojo.setName(student.getName());
			pojo.setEmail(student.getEmail());
			pojo.setContact(student.getContact());
			pojo.setAddress(student.getAddress());
			pojo.setUsername(student.getUsername());
			pojo.setPassword(student.getPassword());
			manager.persist(pojo);
		}
		transaction.commit();
		closeConnection();
		return pojo;
		
	}
	

	public List<StudentPojo> getAll() {
		openConnection();
		transaction.begin();
		jpql = "from StudentPojo";
		query = manager.createQuery(jpql);
		List<StudentPojo> pojos = (List<StudentPojo>)query.getResultList();
		transaction.commit();
		closeConnection();
		return pojos;
		
	}

}
