package com.debanjan.demo1.entity;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;



public class MathematicalCalculator {


	private int a;
	private int b;
	
	public String add( )
	{
		
		return a+b+"";
		
	}
	
	public String sub( )
	{
		
		return a-b+"";
		
	}
	
	public String multiply( )
	{
		
		return a*b+"";
		
	}
	public String divide( )
	{
		
		return a/b+"";
		
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	
	
}
