package com.java.oop.introduction;

public class Main {

	public static void main(String args[]) {

//		Storing 5 roll numbers 
		int[] nums = new int[5];
		
//		Storing 5 names 
		String[] names = new String[5];
		
//		What if we want to store a students data all combined ? 
//		what if we want to store students name, roll no., & marks at one place ?
//		basic approach is we create all different data types for each property?
//		Just like this ..
		int [] rno = new int[5];
		String[] name = new String[5];
		float[] marks = new float[5];
		
//		Now the above decelerations are separated ones,  what if we want to have it in one data type?
//		All the three properties should be included in one data type.. what would we do there? 
//		-- Now this is where you should think of Classes & Object oriented programming concepts..
		
//		Classes - are named group of properties(like rno, name & marks) & functions
//		Classes are our own data types.
		
//		Below defined Student data type 
		Student[] students = new Student[5];
		
//		creating reference 'prabhakar' to our own data type it will have 3 properties defined in class 
//		but it wont create object until we do it using new keyword. 
//		Student prabhakar; // declaring - happens at compile time references stored in stack memory
//		prabhakar = new Student(); // Happens at run time i.e., DMA allocates memory in Heap.
		
//		can also be written as 
		Student prabhakar = new Student();
		System.out.println(prabhakar); // out : com.java.oop.introduction.Student@1d251891 -- some random obj value 
		System.out.println(prabhakar.rno); // out : by default gives : 0
		System.out.println(prabhakar.name); // out : by default without initialization Str gives : null
		System.out.println(prabhakar.marks);
	}
	
}

//Creating a class 
//Consider class as a logical construct or a template.
//the template can be used to create many different constructs with different values out of it 
//but properties remain same.
//below student data type for every single student.
class Student{
//	properties of class aka instance variables.
//	Instance variables are those which are defined outside methods but inside the class.
	int rno;
	String name;
	float marks;	
}
