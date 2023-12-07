package com.java.oop.abstractDemo;

public abstract class Parent {

	int age;
	
	public Parent(int age) { // We can create constructors in abstract classes as well.
		this.age = age;
	}
	
//	abstract Parent() {} //We cannot create abstract constructors as well.
	/*
	 * If one class has one or more abstract methods then that class should also be 
	 * declared as abstract class.
	*/
	abstract void career(); // This is an abstract class who's impl will be in child class
	abstract void partner();
	
	
	
//	Creating of static methods is allowed in abstract methods.. cause there cannot be objs for abstract classes
	static void hello() {
		System.out.println("Hey bro!");
	}
	
}
/*
 * We cannot create objects of abstract classes because if we do then what if we try to access 
 * the abstract methods in abstract classes? The impl is somewhere else so it would fail. That's the reason.
 * For the same reason we cannot abstract constructors as well.
*/
// The use case for this abstract thing is more cleaner code proper impl maintainability.
// Multiple Inheritance not possible in abstract classes also...