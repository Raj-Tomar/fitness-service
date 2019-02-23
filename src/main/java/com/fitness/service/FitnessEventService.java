package com.fitness.service;

import java.util.List;

import com.fitness.entity.FitnessEvent;

public interface FitnessEventService {

	public FitnessEvent createEvent(FitnessEvent event);

	public List<FitnessEvent> getAllEvents();
	
	public List<FitnessEvent> getFitnessEventByLocation(String location);
}
