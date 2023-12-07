package com.java.oop.interfaces;

public class ElectricEngine implements Engine{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Electric engine start!");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Electric engine stop!");
	}

	@Override
	public void excerlate() {
		// TODO Auto-generated method stub
		System.out.println("Electric engine accerlate!");
	}

}
