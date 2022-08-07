package com.debanjan.demo1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


// URL : http://localhost:80/add
//  http://localhost:80/sub
//  http://localhost:80/mul
//  http://localhost:80/divide
// http://localhost:80/complexcalculator/add/4/4

// SOLID

@RestController
public class MyCalculator {

	@GetMapping(path = "v1/add/{aCopy}/{bCopy}")
	public String add(@PathVariable("aCopy") int a, @PathVariable("bCopy")int b)
	{
		
		return a+b+"";
		
	}
	
	@GetMapping(path = "v1/sub/{aCopy}/{bCopy}")
	public String sub(@PathVariable("aCopy") int a, @PathVariable("bCopy")int b)
	{
		
		return (a-b)+"";
		
	}
	
	@GetMapping(path = "v1/multiply/{aCopy}/{bCopy}")
	public String multiply(@PathVariable("aCopy") int a, @PathVariable("bCopy")int b)
	{
		
		return (a*b)+"";
		
	}
	
	@GetMapping(path = "v1/divide/{aCopy}/{bCopy}")
	public String divide(@PathVariable("aCopy") int a, @PathVariable("bCopy")int b)
	{
		
		return (a/b)+"";
		
	}
	
}
