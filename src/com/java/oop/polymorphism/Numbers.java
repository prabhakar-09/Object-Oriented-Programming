package com.java.oop.polymorphism;

public class Numbers {

	int sum(int a, int b) {
		return a+b;
	}
	
	int sum(int a, int b, int c) {
		return a+b+c;
	}
	
	/*
	 * // Here we are getting parameter as double. When passed as argument it is
	 * passed as integer from the sum() method. In such cases, Java automatically converts the type to double.
	 * But it cannot happen ulta, like if parameter defined is 
	 * int and if we pass double then it may result in error. Ref; casting rules in java.
	 */		
	double sum(double a, int b, int c, int d) {
	
		return a+b+c+d;
	}
	
	public static void main(String[] args) {

		Numbers obj = new Numbers();
		
		/*	
		 * The below two methods are executed at compile time & also
		 * the memory allocation happens at compile time only.
		 * This could be referred as compile/static time polymorphism.	
		*/
		obj.sum(5, 6);
		
		obj.sum(5, 6, 7);
		
//		Consider the below e.g., for the auto conversion of double.
		obj.sum(4, 5, 6, 7);
	}

}
