package com.fitness.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fitness.entity.User;

@Repository
public interface FitnessRepository extends JpaRepository<User, Integer> {

}
