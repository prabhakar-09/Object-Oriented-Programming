package com.java.oop.interfaces;

public class Main {

	public static void main(String[] args) {

		Car car = new Car();
		
		car.excerlate();
		car.start();
		car.stop();
		
		
//		Media carMedia = new Car();
//		carMedia.stop();
		
		
		NiceCarr carr = new NiceCarr();
		carr.start();
		carr.startMusic();
		carr.upgradeEngine();
	}

}
