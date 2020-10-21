package com.revature.beans;

public class Car {
	String name;
	String model;
	String make;
	Engine engine;
	
	public Car(){
		
	}
	
	public Car(String name, String model, String make, Engine engine){
		this.name = name;
		this.make = make;
		this.model = model;
		this.engine = engine;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", model=" + model + ", make=" + make + ", engine=" + engine + "]";
	}
	
	
}
