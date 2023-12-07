package com.java.oop.introduction1;

public class Main {

	public static void main(String[]args) {
		Human piku = new Human(22, "Piku", 10000, false);
		Human rahul = new Human(28, "Rahul", 15000, true);

		System.out.println(Human.population); // 1
		System.out.println(Human.population); // 1 
		
		/*		
		 * Both the above print give output as 1 & 1 when the population variable is not static 
		 * but they should give 2 as out put since 2 objects piku & rahul exist.
		 * They will give 2 when we make population as static.
		 * The population property is not related to object but is common for all the objects of the class
		 * say for piku population is 2 & for rahul also population is 2 
		 * such properties we declare as static.
		*/
		
//		greeting(); calling a non-static function inside a static method is not possible.
		/*
		 * A static method can only access static data but not a non static data.
		 * Because a non static data always belongs to an instance.		
		*/	
		}
//	doesnt depend on an object.
	static void fun() {
//		greeting(); not possible as the greeting method is depend on object. It should have an instance to get called.
	}
	
	void greeting() { // This is a non static function.
		System.out.println("Hi there!!");
		Main.fun(); // works
	}
}
