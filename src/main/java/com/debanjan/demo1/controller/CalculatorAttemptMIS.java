package com.debanjan.demo1.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.debanjan.demo1.entity.CalculatorAttempt;
import com.debanjan.demo1.repository.CalculatorAttemptRepository;

@RestController
public class CalculatorAttemptMIS {

	
	@Autowired
	CalculatorAttemptRepository calculatorAttemptRepository;
	// 
	@GetMapping(path = "/v2/attempts")
	public List<CalculatorAttempt> getAllCalculatorAttemp() {
		
		return (List<CalculatorAttempt>) calculatorAttemptRepository.findAll();
		
		
	}
	
	@GetMapping(path = "/v2/attempts/{id}")
	public Optional<CalculatorAttempt> getAllCalculatorAttempById(@PathVariable("id") Long id) {
		
		return  calculatorAttemptRepository.findById(id);
		
		
	}
	
	@GetMapping(path = "/v2/attempts/operationwise/{myFlag}")
	public List<Optional<CalculatorAttempt>> getAllCalculatorAttempByOperationWise(@PathVariable("myFlag") String  myFlag) {
		
		return  calculatorAttemptRepository.findAllByMyFlag(myFlag);
		
		
	}
	
	@GetMapping(path = "/v2/attempts/maxvalue/{maxvalue}")
	public List<Optional<CalculatorAttempt>> getAllCalculatorAttempByOperationWise(@PathVariable("maxvalue") int  maxValue) {
		
		return  calculatorAttemptRepository.findAllByAGreaterThan(maxValue);
		
		
	}
	
	@GetMapping(path = "/v2/attempts/maxvalue/{maxA}/{maxB}")
	public List<Optional<CalculatorAttempt>> getAllCalculatorAttempByOperationWise2
	(@PathVariable("maxA") int  maxA, @PathVariable("maxB") int  maxB ) {
		
		return  calculatorAttemptRepository.findAllByAGreaterThanAndBGreaterThan(maxA , maxB);
		
		
	}
	
	
	
	@DeleteMapping(path = "/v2/attempts/{id}")
	public String deleteCalculatorAttempById(@PathVariable("id") Long id) {
		String response = "Record Not Found";
		Optional<CalculatorAttempt> obj =  calculatorAttemptRepository.findById(id);
		if(!obj.isEmpty())
		{
		 calculatorAttemptRepository.delete(obj.get());
		response = "Record deleted successfully";
		}
		
		return response;
		
		
		
	}
	
	
}
