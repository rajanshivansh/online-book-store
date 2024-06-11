package com.onlinebookstore.service;

import java.util.List;

import com.onlinebookstore.entity.User;

public interface UserService {

	public List<User> getAllUsers();
	
	public User getUserByUsername(String username);
}
