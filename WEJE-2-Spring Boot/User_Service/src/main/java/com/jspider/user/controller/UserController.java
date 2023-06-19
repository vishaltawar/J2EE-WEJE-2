package com.jspider.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jspider.user.entity.User;
import com.jspider.user.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {

	@Autowired
	UserService userService;

	@PostMapping("/add")
	public ResponseEntity<User> save(@RequestBody User user) {
		User user1 = userService.save(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}

	@GetMapping("/{userId}")
	public ResponseEntity<User> getUser(@PathVariable int userId) {
		User user = userService.getUser(userId);
		return ResponseEntity.status(HttpStatus.FOUND).body(user);
	}

	@GetMapping("/getall")
	public ResponseEntity<List<User>> getAlluser() {
		List<User> allUser = userService.getAlluser();
		return ResponseEntity.status(HttpStatus.FOUND).body(allUser);
	}
	
	@DeleteMapping("/{userId}")
	public ResponseEntity<User> deleteUserById(@PathVariable int userId) {
		User user = userService.getUser(userId);
		return ResponseEntity.status(HttpStatus.OK).body(user);
	}


}
