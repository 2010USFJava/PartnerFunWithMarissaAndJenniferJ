package com.revature.beanfun;

public class Engine {
	
	private String type;
	
	private int noofengines;
	
	//constructors
		public Engine () {}
		public Engine(String type, int noofengines) {
			this.type=type;
			this.noofengines=noofengines;
			
		}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoofengines() {
		return noofengines;
	}

	public void setNoofengines(int noofengines) {
		this.noofengines = noofengines;
	}

}
