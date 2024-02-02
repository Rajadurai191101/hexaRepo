package com.hexaware.exception;

public class EmployeeNotFoundException extends Exception {

	public EmployeeNotFoundException() {
		super();
		System.out.println("From enfe cons...");
	}

	public EmployeeNotFoundException(String message) {
		super(message);
		System.out.println(message);
	}

	@Override
	public String toString() {
		return "EmployeeNotFoundException From toString";
	}

}
