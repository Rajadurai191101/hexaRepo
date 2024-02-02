package com.hexaware;

abstract class Vehicle {
	
	int x;
	int y = 20;
	
	public Vehicle() {
		
	}
	
	public void start() {
		System.out.println("Starting Vehicle...");
	}

	public abstract void move();
	
	public void applyHandBrake() {
		System.out.println("Use Handbrake");
	}
}

class Car extends Vehicle {
	public void move() {
		System.out.println("Car Moving...");
	}
	
	public void applyHandBrake() {
		System.out.println("Use Handbrake in the car");
	}
	public void applyBrake() {
		System.out.println("applying brake");
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
//		Vehicle v;
		Car c = new Car();
		c.move();
		c.start();
		
		Vehicle vech = new Car();   //Polymorphic Object
		vech.move();      //Virtual Method invocation
		vech.applyHandBrake();
		vech.start();	  // Can invoke a regular method in Parent
		//vech.applyBrake();// Cant invoke a regular method in Child

	}

}
