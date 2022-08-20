package com.debanjan.demo1.utils;

import java.util.Arrays;

public class PrintNumber {
public static void main(String[] args) {
	
	Object []arr = new Object[100];
	
	Arrays.fill(arr, new Object() {
		
		int count = 0;
		
		@Override
		public String toString() {
			return ++count+"";
		}
	});
	
	System.out.println(Arrays.toString(arr));
}
}
