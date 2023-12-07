package com.java.oop.polymorphism;

public class Circle extends Shapes{
	/*
	 * Below method can be referred as method overriding, aka runtime polymorphism. 
	 * Here the child class Circle's method is same as parent class but it only differs in
	 * the implementation of the methods. Which is the same method area() prints different in
	 * Shapes class & something different in the child class.
	*/	
//	below method runs when obj of circle class is being created.
//	Hence it is overriding the parent method.
	@Override // An annotation 
	void area() {
		System.out.println("The area is pie * r * r");
	}
}
