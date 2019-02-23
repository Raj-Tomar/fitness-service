package com.fitness.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fitness.entity.User;
import com.fitness.service.FitnessService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class FitnessController {

	private static final String BASE_URL = "users";

	@Autowired
	private FitnessService fitnessService;

	@PostMapping(BASE_URL)
	public User createUser(@RequestBody User user) {
		return fitnessService.createUser(user);
	}

	@GetMapping(BASE_URL)
	public List<User> getAllUser() {
		return fitnessService.getAllUser();
	}

	@GetMapping(BASE_URL + "/{uerId}")
	public ResponseEntity<User> getUserById(@PathVariable("uerId") int uerId) {
		Optional<User> user = fitnessService.getUserById(uerId);
		if (user.isPresent()) {
			return new ResponseEntity<>(user.get(), HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@PutMapping(BASE_URL)
	public ResponseEntity<User> updateUser(@PathVariable("userId") int userId, @RequestBody User user) {
		Optional<User> savedUser = fitnessService.getUserById(userId);
		if (savedUser.isPresent()) {
			User usr = savedUser.get();
			usr.setFirstName(user.getFirstName());
			usr.setLastName(user.getLastName());
			usr.setMyLocation(user.getMyLocation());
			return new ResponseEntity<>(fitnessService.createUser(usr), HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

	@DeleteMapping(BASE_URL + "/{userId}")
	public ResponseEntity<String> deleteUserById(@PathVariable("userId") int userId) {
		Optional<User> user = fitnessService.getUserById(userId);
		if (user.isPresent()) {
			fitnessService.deleteUserById(userId);
			return new ResponseEntity<>("User is deleted", HttpStatus.OK);
		}
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}

}
