package com.java.oop.introduction1;

public class Human {

	int age;
	String name;
	int salary;
	boolean married; 

	/*
	 * Properties which are not directly related to the objects are known as Static var's/methods.
	 * When a member is declared static it can be accessed before any of the object of the class is being
	 * created and without referencing to that object..Static var's are not dependent on objects.	
	*/	
//	long population; non static 
	static long population;
	
	static void message() {
		System.out.println("hiii");
//		System.out.println(this.name); this isn't possible since name var belongs to class and is object dependent.
//		object dependent stuff cant be called into static methods.
	}
	
	public Human(int age, String name, int salary, boolean married) {
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.married = married;
		
//		this.population +=1; accessing this when not declared as static 
//		this.population = population; will also work when we declare the var as static. By convention we always put class name only.
		Human.population = population; // We access the static variable/methods with the help of Class name directly.
	}
	
	
	
}
