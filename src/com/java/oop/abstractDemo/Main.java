package com.java.oop.abstractDemo;

public class Main {

	public static void main(String[]args) {
		Son son = new Son(30);
		
		son.career();
		
		Daughter daughter = new Daughter(20);
		
		daughter.career();
		
//		Parent mom = new Parent(); // Result in err, since we cannot create obj of abstract classes
	}
}
