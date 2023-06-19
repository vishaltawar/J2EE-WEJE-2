package com.jspider.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jspider.user.entity.User;

public interface UserService {
	
	public User save(User user);
	public List<User> getAlluser();
	public User getUser(int id);
	public User deleteUserbyId(int userId);
	
//	TODO:
	// 1: update

}
