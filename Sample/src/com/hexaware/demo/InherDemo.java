package com.hexaware.demo;

import static java.lang.Math.*;
class Employee {
	int empno = 101;
	String empname = "Ram";
	
	Employee() {
		System.out.println("Employee Constr");
	}
	
	public Employee(int eno, String ename) {
		this("Ganesh",103);
		System.out.println("From Param. COnstr");
		this.empno =eno;
		this.empname = ename;
	}


	public Employee(String ename,int eno){
		System.out.println("From Param. COnstr");
		System.out.println(eno + " " + ename);
	}
	
	public String getDetails() {
		return empno + " " + empname;
		
	}
	
	public int getSalaryInfo() {
		return 1000;
	}
	
	public String getSalaryInfo(int x) {
		return "2000";
	}
	
}


class Manager extends Employee{
	String dept ="CSE";
	
	public Manager () {
		super(102,"Raj");
		System.out.println("Manager Const");
	}
	
	public String getDetails() {
		return empno + " " + empname + " -- " + dept;
	}
}






public class InherDemo {

	public static void main(String[] args) {
		Employee emp = new Employee(104,"Anbu");
		
		System.out.println(emp.getSalaryInfo());
		System.out.println(emp.getSalaryInfo(35));
//		System.out.println(emp.getDetails());
//		Manager mgr = new Manager();
//		System.out.println(mgr.getDetails());
		System.out.println(pow(1.5,2.0));
		
		
	}

}
