package com.revature.beanfun;

public class Car {
	
	private String name;
	
	private String make;
	
	//constructors
		public Car () {}
		public Car(String name, String make) {
			this.name=name;
			this.make=make;
		
		}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}
	

}
