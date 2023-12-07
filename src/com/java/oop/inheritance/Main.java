package com.java.oop.inheritance;

public class Main {

	public static void main(String[]args) {
		
		Box box = new Box(); // it will call no args constructor which we initialized to -1
		
		Box box1 = new Box(4); // it will call constructor with one parameter
		
		Box box2 = new Box(7, 7, 7); // it will call constructor with 3 parameters
		
		Box box3 = new Box(box1); // this will call the constructor which takes box1 as parameter
		
		System.out.println(box3.l + " " + box3.h + " " + box3.w); 
		
		BoxWeight box4 = new BoxWeight();
		
		System.out.println(box4.h + " " + box4.weight);
		
		BoxPrice boxP = new BoxPrice(5,8,200); // side, weight, cost
		 
	}
}
