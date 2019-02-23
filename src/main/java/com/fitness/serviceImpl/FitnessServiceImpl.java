package com.fitness.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.entity.User;
import com.fitness.repository.FitnessRepository;
import com.fitness.service.FitnessService;

@Service
public class FitnessServiceImpl implements FitnessService {
	
	@Autowired
	private FitnessRepository fitnessRepository;

	@Override
	public User createUser(User user) {
		return fitnessRepository.save(user);
	}

	@Override
	public List<User> getAllUser() {
		return fitnessRepository.findAll();
	}

	@Override
	public Optional<User> getUserById(int id) {
		return fitnessRepository.findById(id);
	}

	@Override
	public void deleteUserById(int id) {
		fitnessRepository.deleteById(id);
	}

}
