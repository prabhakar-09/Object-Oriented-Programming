package com.java.oop.interfaces;

public class NiceCarr {

	private Engine engine;
	private Media player = new CDPlayer();
	
	public NiceCarr() { // by default power engine start message will printed.. from PowerEngine method.
		engine = new PowerEngine();
	}
	
	public NiceCarr(Engine engine) {
		this.engine = engine;
	}
	
	public void start() {
		engine.start();
	}
	
	public void stop() {
		engine.stop();
	}
	
	public void startMusic() {
		player.start();
	}
	
	public void stopMusic() {
		player.stop();
	}
	
	public void upgradeEngine() {
		this.engine = new ElectricEngine();
	}
}
