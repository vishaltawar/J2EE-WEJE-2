package com.jspider.springmvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.jspider.springmvc.service.StudentService;

@Controller
public class StudentControler {

	@Autowired
	StudentService service;

	@GetMapping("/home")
	public String getHome() {
		return "Home";
	}

	@PostMapping
	public String login(HttpServletRequest request) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		service.login(username,password);

		return "";

	}

}
