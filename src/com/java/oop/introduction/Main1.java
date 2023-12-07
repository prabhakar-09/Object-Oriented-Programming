package com.java.oop.introduction;

public class Main1 {
	
	public static void main(String[]args) {
		Students prabhakar = new Students(); // here 'Students()' is a constructor 
//		what if we wanted to add such  100 properties we cannot use the below approach 
//		and its not a good practice but instead we would go for a constructor 
//		prabhakar.rno = 15;
//		prabhakar.name = "prabhakar";
//		prabhakar.marks = 84.5f;
		
//		---------
//		calling second parameter constructor 
		Students rahul = new Students(25, "Rahul Gandhi", 35.4f); 
		
//		without argument constructor 
		System.out.println(prabhakar.rno);
		System.out.println(prabhakar.name);
		System.out.println(prabhakar.marks);
		
//		argument wala constructor
		System.out.println(rahul.rno);
		System.out.println(rahul.name);
		System.out.println(rahul.marks);
		
//		above if we call constructor with 3 values it will call argument wala constructor 
//		if not that then it will call the constructor without arguments..
		
//		calling change name method
		prabhakar.changeName("Dog Lover");
		
//		calling greeting method 
		prabhakar.greeting();
		


	}
}

class Students{
	int rno;
	String name;
	float marks;
	
//	Constructor basically defines what happens when our object is created..
//	if constructor is not present java will create one by default.
	Students(){
//		the 'this' keyword acts as a object reference once its created 
//		in our case this.rno same as 'prabhakar.rno' this is how it works internally 
		this.rno = 15;
		this.name = "Prabhakar";
		this.marks = 85.9f;
	}
	
	void greeting() {
		System.out.println("Hello my name is " + this.name);
	}
	
	void changeName(String newName) {
		this.name = newName;
	}
	
//	Lets say we want to have to initialize some obj creation with 3 properties 
//	we would go for a parameterized constructor 
//	there are two constructors now this is called constructor overloading..
	Students(int rno, String name, float marks){
		this.rno = rno; // here assigning rno = rno will result in error as we have to specify which name we referencing..
		this.name = name;
		this.marks = marks;
	}
}
