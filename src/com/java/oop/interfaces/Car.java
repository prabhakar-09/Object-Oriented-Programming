package com.java.oop.interfaces;

// Now assume this car needs to implement both Engine & Brake, it wasn't possible in 
// the multiple inheritance by extending so in such cases Interfaces come handy.
public class Car implements Engine, Brake{

	@Override // These annotations are also interfaces
	public void brake() {
		// TODO Auto-generated method stub
		System.out.println("I brake like a normal CAR.");
		
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("I start engine like a normal CAR.");

	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("I stop engine like a normal CAR.");

	}

	@Override
	public void excerlate() {
		// TODO Auto-generated method stub
		System.out.println("I accerlate engine like a normal CAR.");

	}

	
	
}
