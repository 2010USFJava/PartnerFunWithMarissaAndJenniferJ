package com.revature.beans;

public class Engine {
	public String name;
	
	public Engine(){
		
	}
	
	public Engine(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Engine [name=" + name + "]";
	}
	
}
