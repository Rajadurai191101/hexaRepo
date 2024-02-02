package com.hexaware;

class First {

	static int x = 10;
	int y = 20;

	public void regularMethod() {
		System.out.println("x = " + ++x);
		System.out.println("y = " + ++y);
	}

	public static void staticMethod() {
		System.out.println("x = " + x);
		//System.out.println("y = " + y);
	}
}

public class StaticEg {

	public static void main(String[] args) {
		First f = new First();
		f.regularMethod();
		First f1 = new First();
		f1.regularMethod();
		//First.staticMethod();
	}

}
