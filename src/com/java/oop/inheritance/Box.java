package com.java.oop.inheritance;

public class Box {

	double l;
	double h;
	double w;
	
	Box(){
		this.l = -1;
		this.h = -1;
		this.w = -1;
	}
	
	Box(double side){
//		say we call super(); here 
//		It will reference to an object class as the super of the current parent class 
//		which means in java every parent class also has a super class which is of type 
//		Object.
		this.l = side;
		this.h = side;
		this.w = side;
	}
	
	Box(double l, double h, double w){
		this.l = l;
		this.h = h;
		this.w = w;
	}
	
	Box(Box box1){
		this.l = box1.l;
		this.h = box1.h;
		this.w = box1.w;
	}
}
