package com.hexaware.controller;

public interface EmployeeInterface {
	public void addEmployee();

	public void viewEmployee();

	public void sortByEmpnoUsingComparable();

	public void sortByEnamUsingComparator();

	public void removeEmployee(int removeId);
}
