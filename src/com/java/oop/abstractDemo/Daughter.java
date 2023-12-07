package com.java.oop.abstractDemo;

public class Daughter extends Parent {

	public Daughter(int age) {
		
		super(age);
	}
	
	@Override
	void career() {
		// TODO Auto-generated method stub
		
		System.out.println("I am going to be a coder");
		
	}

	@Override
	void partner() {
		// TODO Auto-generated method stub
		System.out.println("I love Iron Man");
		
		
	}

}
