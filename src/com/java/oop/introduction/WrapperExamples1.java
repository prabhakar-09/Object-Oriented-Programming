package com.java.oop.introduction;

public class WrapperExamples1 {
	
	public static void main(String[]args) {
//		continuing with the previous swapping example 
		/*
		 * consider sending wrapper classes to the swap() function assume - which would send the
		 * data as reference to the method
		 */
		
		Integer a = 10;
		Integer b = 20;
		
		swap(a, b);
		System.out.println("Inside main method "+" a "+ a + " b "+b); // out a 10 b 20 - no swap happened
		
		final A piku = new A("Piku Niku"); // making an object final here
		
		piku.name = "Prabhakar"; // even though we made it final we can still edit the name of class property via object
		System.out.println(piku.name); // out : Prabhakar name modified 
		
//		piku = new A("New Obj"); err
		/*
		 * we cannot do the above it is not allowed because when a non primitive is
		 * final we cannot reassign it again.
		 */
		
//		creating few objects 
		A obj;
		for(int i=0;i<1000000000;i++) {
			obj = new A("random obj"); // every time the obj points to a new reference here the prev obj is destroyed..
		}

	}
	
	static void swap(Integer a, Integer b) {
		int temp = a;
		a = b;
		b = temp;
		
		System.out.println("Inside swap method "+" a "+ a + " b "+b); // out a 20 b 10 
	}
	/*
	 * Above we expected the swap after sending the wrapper class but it did not
	 * swap because the Integer is a final class. Final simply means we cannot modify
	 * the value of the var once we term it as final & Integer class exactly does the same
	 * since it's a final class.
	 */
	
	/*
	 * Note 1 : This immutability thing only holds true for the primitive data types
	 * but not objects. In case of objects we can still modify the values of it.
	 */
}

class A{
	final int num = 5;
	String name;
	
	public A(String name) {
		System.out.println("Object created!!");
		this.name = name;
	}
	
//	Whenever an object of a class A is freed from the memory the below method gets called by java
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object is destroyed!!");
	}
}
