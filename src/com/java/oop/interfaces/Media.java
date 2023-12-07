package com.java.oop.interfaces;

public interface Media {

	void start();
	void stop();
	
//	every static method inside an interface should have the method body implemented here itself 
//	because static methods cannot get inherited.
	static void greet() {
		System.out.println("Media started!");
	}
	
}
