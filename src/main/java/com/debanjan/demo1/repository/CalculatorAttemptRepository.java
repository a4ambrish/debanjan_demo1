package com.debanjan.demo1.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.debanjan.demo1.entity.CalculatorAttempt;

@Repository
public interface CalculatorAttemptRepository  extends CrudRepository<CalculatorAttempt, Long> {

	//HQL
	// Native SQL
	// JPQL
	// DSL query
	// Criteria 

	// this is a DSL query
	//Optional<CalculatorAttempt> findAllByMyFlag(String myFlag);
	List<Optional<CalculatorAttempt>> findAllByMyFlag(String myFlag);
	
	//Optional<CalculatorAttempt> findAllByMyFlag(String myFlag);
	List<Optional<CalculatorAttempt>> findAllByAGreaterThan(int maxValue);
	
	List<Optional<CalculatorAttempt>> findAllByAGreaterThanAndBGreaterThan(int maxA, int maxB);
		
	
}
