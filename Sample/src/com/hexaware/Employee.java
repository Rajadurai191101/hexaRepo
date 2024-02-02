package com.hexaware;

import java.util.Objects;

public class Employee {

	private int empno;
	private String ename;
	
	public Employee(){
		System.out.println("From Employee Constr...");
	}
	
	
	public Employee(int eno,String ename) {
		this.empno = eno;
		this.ename = ename;
	}
	
	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public String toString() {
		return empno +"--"+ ename;
	}


	@Override
	public int hashCode() {
		return Objects.hash(ename);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(ename, other.ename);
	}

	

}
