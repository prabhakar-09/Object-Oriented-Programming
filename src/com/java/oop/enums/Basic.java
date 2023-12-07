package com.java.oop.enums;

public class Basic {

	enum Week{
		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
//		These are enum constants
//		every member here is public, static & final member
//		since its final we cannot create child enums
//		the type of all of these is week
	}
	
	public static void main(String []args) {
//		accessing enums
		Week week;
		week = Week.Friday;
		
		System.out.println(week.ordinal()); // will print the position of the enum pos or index.
		
//		Iterating through them
		for(Week day : Week.values()) {
			System.out.println(day);  // Monday Tuesday Wednesday Thursday Friday Saturday Sunday
		}
	}
}
