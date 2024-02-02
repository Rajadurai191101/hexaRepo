package com.hexaware.demo;

interface Abc{
	public void fly();
	
}

interface Vehicle {
	
	//int x;   Declare is not possible
	int y =19;
	void move();
}


class Xyz {
	
}

class Car extends Xyz implements Vehicle {

	@Override
	public void move() {
		System.out.println("Moving---");
		
	}
	public void applyHandBrake() {
		System.out.println("Use Handbrake in the car");
	}
	public void applyBrake() {
		System.out.println("applying brake");
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		Vehicle v = new Car();
		v.move();
	}

}
