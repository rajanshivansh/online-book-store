package com.onlinebookstore.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import com.onlinebookstore.dao.UserRepository;
import com.onlinebookstore.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository theUserRepository;
	
	@Override
	@Transactional
	public List<User> getAllUsers() {
		List<User> users = new ArrayList<User>();
		users.addAll(theUserRepository.findAll());
		return users;
	}

	@Override
	@Transactional
	public User getUserByUsername(String username) {
		
		Optional<User> userOpt = theUserRepository.findById(username);
		
		User theUser = null;
		
		if(userOpt.isPresent())
			theUser = userOpt.get();
		
		return theUser;
	}
}
