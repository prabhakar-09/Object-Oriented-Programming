package com.java.oop.introduction;

public class Premitivess {

	public static void main(String [] args) {
		
//		Why don't we use new keyword while creating primitive data types?
//		- Because primitives are not objects & are stored in stack memory in java & also objects are stored in heap memory

//		Creating object 
		Student1 one = new Student1();
		
		one.name = "random"; // this will make change for the 'two' reference as well 
		
		Student1 two = one;  
		
		System.out.println("Name "+two.name); // out : 'random' since we pointing same reference as 'one' is 
		
	}
}

class Student1{
	String name;
	int rno;
	float marks;
}