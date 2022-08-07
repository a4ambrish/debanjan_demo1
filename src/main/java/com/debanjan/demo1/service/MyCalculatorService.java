package com.debanjan.demo1.service;

import org.springframework.stereotype.Service;

import com.debanjan.demo1.entity.MathematicalCalculator;

@Service
// i will business logic here
public class MyCalculatorService {

	/**
	 * 
	 * @param a this is first value
	 * @param b this is second value
	 * 
	 * @param myFlag this is a indicator for the calculation type i
	 * i.e 1 - add, 2- sub , 3- multiply , 4 - divide
	 * 
	 * @return this method will return the calculated value based on input myflag
	 *  
	 * **/
	public String calucate(int a, int b, int myFlag) {
		String result="";
		MathematicalCalculator obj = new MathematicalCalculator();
		obj.setA(a);
		obj.setB(b);
		
		// if property a is public property
		//obj.a = a;
		
		
		// this is the business logic
		switch (myFlag) {
		case 1:
			result = obj.add();
			break;

		case 2:
			result = obj.sub();
			break;

		case 3:
			result = obj.multiply();
			break;

		case 4:
			result = obj.divide();
			break;

		default:
			break;
		}
		return result;

	}

}
