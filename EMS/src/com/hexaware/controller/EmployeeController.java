package com.hexaware.controller;

import com.hexaware.dao.EmployeeDao;
import com.hexaware.model.Employee;
import com.hexaware.model.Salary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class EmployeeController implements EmployeeInterface {
	
	List empList = new ArrayList();
	
	Employee emp;
	Salary sal;
	Scanner sc = new Scanner(System.in);
	EmployeeDao dao = new EmployeeDao();
	
	public void addEmployee() {
		emp = new Employee();
//		System.out.println("Enter emp no");
//		int eid = sc.nextInt();
//		emp.setEmpno(eid);
		System.out.println("Enter ename");
		String ename = sc.next();
		emp.setEname(ename);
		
		sal = new Salary();
		System.out.println("Enter basic salary");
		int basic= sc.nextInt();
		sal.setBasic(basic);
		sal.setHra();
		sal.setPf();
		sal.setGross();
		sal.setNet();
		
		emp.setSal(sal);
		
		
		empList.add(emp);
		dao.createEmployee(emp);
	}
	
	public void viewEmployee() {
		
		//System.out.println("Eid : " + emp.getEmpno() +" " + "Ename : " +emp.getEname());
		System.out.println("*******" + empList +"*********");
		
		dao.showEmployee(emp);
	}
	
	
	public void removeEmployee(int id) {
		Iterator<Employee> it = empList.iterator();
		while(it.hasNext()) {
			Employee emp = (Employee) it.next();
			if(emp.getEmpno() == id) {
				it.remove();
			}
		}
		dao.deleteEmployee(id);
	}
	
	public void sortByEmpnoUsingComparable() {
		System.out.println("******Name  Comparator *********");
		//Collections.sort(empList, new Employee().empnoComparator);
		System.out.println(emp.compareTo(emp));
	}
	
	public void sortByEnamUsingComparator() {
		System.out.println("******Name  Comparator *********");
		Collections.sort(empList, new Employee().nameComparator);
		System.out.println(empList);
	}
	

}
