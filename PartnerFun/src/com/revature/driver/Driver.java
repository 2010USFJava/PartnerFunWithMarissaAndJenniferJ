package com.revature.driver;

import com.revature.beans.Car;
import com.revature.beans.Engine;

public class Driver {

	public static void main(String[] args) {
		Engine engine1 = new Engine("V8");
		Car car1 = new Car("Little Buggie", "Audi", "R8", engine1);
		System.out.println(car1);
		
		Engine engine2 = new Engine("V10");
		Car car2 = new Car("Big Betty", "Ford", "IDK", engine2);
		System.out.println(car2);
		
		System.out.println("This is the Main Branch");
		
		
	}

}
