package com.java.oop.cloning;

// this implements an interface Cloneable which allows object cloning.
public class Human implements Cloneable{

	int age;
	String name;
	int[] arr;
	
//	public Human(Human other) {
//		this.age = other.age;
//		this.name = other.name;
//		
//	}

	public Human(int age, String name) {
		// TODO Auto-generated constructor stub
		this.age = age;
		this.name = name;
		this.arr = new int[]{3,4,5,6};
	}
	
	
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
