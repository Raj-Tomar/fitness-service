package com.fitness.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fitness.entity.FitnessGoal;

@Repository
public interface FitnessGoalRepository extends JpaRepository<FitnessGoal, Integer> {

}
