package com.debanjan.demo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.debanjan.demo1.entity.MathematicalCalculator;
import com.debanjan.demo1.service.MyCalculatorService;

@RestController()
public class MyComplexCalculator {
	
	
	@Autowired
	MyCalculatorService myCalculatorService;
	
	
	@GetMapping("/v2/whoiam")
	public String whoIAm()
	{
		return "I am a Complex Caluculator";
		
	}

	@PostMapping(path = "/v2/calculate/{myFlag}")
	public String doCaluculation(@RequestBody MathematicalCalculator mathematicalCalculator, 
			@PathVariable("myFlag") int myFlag)
	{
		
		return myCalculatorService.calucate(mathematicalCalculator.getA(),  mathematicalCalculator.getB(), myFlag);
		
	}
	
}
