package com.talento.java.proyecto3;

public class FizzBuzz {
	
	public  String fizzBuzz(int number) {
	String z= "";
	int i= number;
	
	 if(i %3==0 && i%5==0) {
		z="FizzBuzz";
	}
	 else if(i % 3 ==0) {
			z="Fizz";
		}
		else if(i % 5 ==0) {
			z="buzz";	
		}
		else {
		 z= String.valueOf(number);
		}
		return z;
 }
	
}