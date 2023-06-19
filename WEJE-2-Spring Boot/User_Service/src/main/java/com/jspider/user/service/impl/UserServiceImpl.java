package com.jspider.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspider.user.entity.User;
import com.jspider.user.exception.ResourceNotFoundException;
import com.jspider.user.repository.UserRepository;
import com.jspider.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User save(User user) {
		User user1 = userRepository.save(user);
		return user1;
	}

	@Override
	public List<User> getAlluser() {
		return userRepository.findAll();
	}

	@Override
	public User getUser(int id) {

		return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("UserId is Not Found" + id));
	}

	@Override
	public User deleteUserbyId(int userId) {
		User deletedUser= userRepository.findById(userId).orElseThrow(()-> new ResourceNotFoundException("User Id is Not Found.!!"));
		return deletedUser;
	}

}
