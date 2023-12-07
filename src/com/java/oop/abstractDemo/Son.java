package com.java.oop.abstractDemo;

/*
 * This is a child class of the Parent class & every child class has to override 
 * the abstract methods in the parent class.
*/
public class Son extends Parent{

	public Son(int age) {
	
		super(age);
	}
	
	@Override
	void career() {
		// TODO Auto-generated method stub
		System.out.println("I am going to be a doctor");
		
	}

	@Override
	void partner() {
		// TODO Auto-generated method stub
		
		System.out.println("I love Pepper Potts ");
		
		
	}

	
}
