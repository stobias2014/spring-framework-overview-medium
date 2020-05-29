package com.tobias.saul.bean;

public class Car {
	
	private String make;
	private Engine engine;
	
	public Car() {}

	public String getModel() {
		return make;
	}

	public void setModel(String make) {
		this.make = make;
	}
	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", engine=" + engine + "]";
	}

	


	
	
	
}
