package com.fitness.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fitness.entity.FitnessEvent;
import com.fitness.service.FitnessEventService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class FitnessEventController {

	private static final String EVENT_URL = "events";
	
	@Autowired
	private FitnessEventService fitnessEventService;
	
	@PostMapping(EVENT_URL)
	public FitnessEvent createEvent(@RequestBody FitnessEvent event) {
		return fitnessEventService.createEvent(event);
	}
	
	@GetMapping(EVENT_URL)
	public List<FitnessEvent> getAllEvents() {
		return fitnessEventService.getAllEvents();
	}
	
	@GetMapping(EVENT_URL + "/{location}")
	public List<FitnessEvent> getEventsByLocation(@PathVariable("location") String location) {
		return fitnessEventService.getFitnessEventByLocation(location);
	}
}
