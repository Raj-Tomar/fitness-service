package com.fitness.service;

import java.util.List;
import java.util.Optional;

import com.fitness.entity.User;

public interface FitnessService {

	public User createUser(User user);
	
	public List<User> getAllUser();
	
	public Optional<User> getUserById(int id);
	
	public void deleteUserById(int id);
}
