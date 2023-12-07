package com.java.oop.polymorphism;

public class Shapes {

//	If we add final to this method then the overriding won't work at all. 
//	Overriding won't work for final methods
//	Early binding.
//	final void area() {
//		System.out.println("I am in shapes.");
//	}
	
	void area() {
		System.out.println("I am in shapes.");
	}
}
