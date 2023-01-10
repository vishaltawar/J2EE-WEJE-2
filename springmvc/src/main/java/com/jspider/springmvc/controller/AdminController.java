//package com.jspider.springmvc.controller;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpSession;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.ui.ModelMap;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//
//import com.jspider.springmvc.pojo.AdminPojo;
//import com.jspider.springmvc.service.AdminServices;
//
//public class AdminController {
//	
//	@Autowired
//	AdminServices service;
//	
//	@GetMapping("/adminlogin")
//	public String geAdminLogin() {
//		return "AdminLogin";
//	}
//
//	@PostMapping("/adminlogin")
//	public String Adminlogin(HttpServletRequest request, @RequestParam String username, @RequestParam String password,
//			ModelMap map) {
//		AdminPojo admin = service.adminLogin(username, password);
//		if (admin != null) {
//			HttpSession session = request.getSession();
//			session.setAttribute("login", admin);
//			session.setMaxInactiveInterval(60);
//			return "Home";
//		}
//		map.addAttribute("msg", "Inavlid username or password..!!");
//		return "AdminLogin";
//	}
//
//	@GetMapping("/logout")
//	public String geLogout(HttpSession session, ModelMap map) {
//		session.invalidate();
//		map.addAttribute("msg", "Successfully Logout...!");
//
//		return "AdminLogin";
//	}
//
//	// Add Admin
//
//	@PostMapping("/addadmin")
//	public String addAdmin(@RequestParam String name, @RequestParam String username, @RequestParam String password,
//			ModelMap map) {
//
//		AdminPojo admin = service.addAdmin(name, username, password);
//		if (admin != null) {
//			map.addAttribute("admin", admin);
//		} else {
//			map.addAttribute("msg", "Data not added in Database!");
//		}
//		return "AdminRegistration";
//	}
//
//	@GetMapping("/addadmin")
//	public String getAdd() {
//
//		return "AdminRegistration";
//	}
//}
