//package com.jspider.springmvc.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//
//import com.jspider.springmvc.pojo.AdminPojo;
//import com.jspider.springmvc.repository.AdminRepository;
//
//public class AdminServices {
//
//	@Autowired
//	AdminRepository repository;
//	
//	public AdminPojo adminLogin(String username, String password) {
//		AdminPojo adminPojo = repository.adminLogin(username, password);
//
//		return adminPojo;
//	}
//
//	public AdminPojo addAdmin(String name, String username, String password) {
//		AdminPojo adminPojo = repository.addAdmin(name, username, password);
//		return adminPojo;
//	}
//}
