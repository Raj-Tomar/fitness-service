package com.fitness.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fitness.entity.FitnessEvent;

@Repository
public interface FitnessEventRepository extends JpaRepository<FitnessEvent, Integer> {
	
	public List<FitnessEvent> getFitnessEventByLocation(String location);
}
