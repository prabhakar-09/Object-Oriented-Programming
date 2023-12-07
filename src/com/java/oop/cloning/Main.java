package com.java.oop.cloning;

import java.util.Arrays;

public class Main {

	public static void main(String[]args) throws CloneNotSupportedException {
		
		Human peeku = new Human(23, "Peeku");
		
		// making a copy of peeku problem is it'll take much processing time due to that new keyword.
//		Human twin = new Human(peeku); 
		
//		Instead we can use object cloning 
		Human twin = (Human)peeku.clone(); // shallow copying 
		
		System.out.println(twin.age + " " + twin.name); // will have same values as peeku had, object cloned.
		
//		twin.arr[0] = 100;
//		System.out.println(Arrays.toString(peeku.arr));
		System.out.println(Arrays.toString(twin.arr));
	}
}
