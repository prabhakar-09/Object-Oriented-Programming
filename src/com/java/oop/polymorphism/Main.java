package com.java.oop.polymorphism;

public class Main {

	public static void main(String args[]) {
		Shapes shapes = new Shapes();
		
		Circle circle = new Circle();
		
		Square square = new Square();
		
		Triangle triangle = new Triangle();
		
		/*		
		 * Below shapes is common..here the act of representing the same thing in 
		 * multiple ways is called polymorphism.
		*/
		shapes.area();
		circle.area();
		square.area();
		triangle.area();
		
	}
}

// Dynamic method dispatch part of dynamic polymorphism. Due - revisit.
