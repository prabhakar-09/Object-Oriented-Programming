package com.java.oop.introduction1;

// demo class to show initialization of static var's
public class StaticInitialize {

	static int a = 4;
	static int b;
	
//	to initialize the var's we can use a static block.
//	It will get executed exactly once when the class is loaded.
	
	static {
		System.out.println("I'm a static block");
		b = a*5; 
	}
	
	public static void main(String[]args) {
		StaticInitialize obj = new StaticInitialize();
		System.out.println(StaticInitialize.a +" 4x4 = "+StaticInitialize.b);
	}
	
}
