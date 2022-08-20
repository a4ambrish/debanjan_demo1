package com.debanjan.demo1.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.debanjan.demo1.entity.CalculatorAttempt;
import com.debanjan.demo1.entity.MathematicalCalculator;
import com.debanjan.demo1.repository.CalculatorAttemptRepository;
import com.debanjan.demo1.service.MyCalculatorService;

@RestController()
public class MyComplexCalculator {
	
	
	@Autowired
	MyCalculatorService myCalculatorService;
	
	@Autowired
	CalculatorAttemptRepository calculatorAttemptRepository;
	
	@GetMapping("/v2/whoiam")
	public String whoIAm()
	{
		return "I am a Complex Caluculator";
		
	}

	@PostMapping(path = "/v2/calculate/{myFlag}")
	public String doCaluculation(@RequestBody MathematicalCalculator mathematicalCalculator, 
			@PathVariable("myFlag") String myFlag)
	{
		
		int result;
		//store data in database
		// preparing obejct to be store
		
		CalculatorAttempt calculatorAttempt = new CalculatorAttempt();
		calculatorAttempt.setA(mathematicalCalculator.getA());
		calculatorAttempt.setB(mathematicalCalculator.getB());
		calculatorAttempt.setMyFlag(myFlag);
		calculatorAttempt.setOpDt(new Date());
		result = Integer.parseInt(myCalculatorService.calculate(mathematicalCalculator.getA(),  mathematicalCalculator.getB(), myFlag));
		calculatorAttempt.setRes(result);
		
		// now save this entity into database
		calculatorAttemptRepository.save(calculatorAttempt);
		
		
		return result+"";
		
	}
	
}
