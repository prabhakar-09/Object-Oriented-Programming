package com.java.oop.inheritance;

/*This class is going to be the inherited one of Box class
this class will inherit all properties of box class & also 
will have some extra properties such as weight*/

public class BoxWeight extends Box {

	double weight; // additional field weight 
	
	public BoxWeight() {
		this.weight = -1;
	}

	/*
	 * Below is an example of copy constructor where we sending an obj reference of type
	 * BoxWeight, tho we sent of BoxWeight type obj reference, it will still in the parent class
	 * would consider the (Box box){...}  type of constructor because it is allowed in Java.
	*/	
	BoxWeight(BoxWeight other){
		super(other);
	}
	
	BoxWeight(double side, double weight){
		super(side);
		this.weight = weight;
	}
	
	public BoxWeight(double l, double h, double w, double weight) {
		super(l,h,w); // this simply calls parent class constructor which has the fields initialized 
//						and these fields can be used in child class as they are inherited.
//		If we do not assign/use the super in child class then the default 
//		constructor of the parent class will be called.
		this.weight = weight;
	}
	
	
	
}
