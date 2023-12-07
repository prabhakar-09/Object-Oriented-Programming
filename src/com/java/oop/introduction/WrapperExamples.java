package com.java.oop.introduction;

// in java there is no such thing as pass by reference its all pass by value..
public class WrapperExamples {

	public static void main(String[]args) {
		
//		below deceleration is of type primitive data type
		int a = 10; // so when we pass 'a' somewhere the reference will not be passed the value directly will be passed which is 10
		int b = 20;
		
//		below deceleration is of type Wrapper class
		Integer num = 5; // num will not act as an object... Simply we can use this primitive type as object for us.
		
		
//		Swapping number function to explain this 
		swap(a,b); // passing only the copy of a & b not the original reference of it.
		
		System.out.println(a + " " + b); // Out : 10 20 | it won't swap because pass by reference not possible in java.
//		only in primitives there is no pass by reference everything is pass by value only..
	}
	
	static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("In swap method "+"a "+a+" b "+b); 
		/*
		 * Out : 20 & 10 because the swap is valid inside this method scope only and it
		 * won't work outside of this method scope because we are passing the copy of a
		 * & b and not the original reference. Therefore the change won't reflect in the main method & the values of 
		 * a & b would remain same unchanged.
		 */
	}
	
}
