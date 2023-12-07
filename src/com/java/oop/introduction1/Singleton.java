package com.java.oop.introduction1;

// is a type of class from which we can only create one object outta it.
public class Singleton {
	
	/*
	 * Basic funda is to not allow create constructor of class.
	 * Because when a constructor is called a new object is created.
	 * One option is to make it private.
	*/
	private Singleton() { // this will not let the constructor call outside the class scope.
		
		
	}
}
