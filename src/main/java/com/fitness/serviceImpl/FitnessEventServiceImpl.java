package com.fitness.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fitness.entity.FitnessEvent;
import com.fitness.repository.FitnessEventRepository;
import com.fitness.service.FitnessEventService;

@Service
public class FitnessEventServiceImpl implements FitnessEventService {

	@Autowired
	private FitnessEventRepository fitnessEventRepository; 
	
	@Override
	public FitnessEvent createEvent(FitnessEvent event) {
		return fitnessEventRepository.save(event);
	}

	@Override
	public List<FitnessEvent> getAllEvents() {
		return fitnessEventRepository.findAll();
	}

	@Override
	public List<FitnessEvent> getFitnessEventByLocation(String location) {
		return fitnessEventRepository.getFitnessEventByLocation(location);
	}

}
