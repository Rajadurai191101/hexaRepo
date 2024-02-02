package com.hexaware.view;

import java.util.Scanner;
import com.hexaware.controller.EmployeeController;
import com.hexaware.controller.EmployeeInterface;
import com.hexaware.exception.EmployeeNotFoundException;


public class MainClass {

	public static void main(String[] args) {
		try {
		System.out.println("Welcome to EMS");
		EmployeeInterface ec = new EmployeeController();
		Scanner sc = new Scanner(System.in);
		
		String userName = "root";
		System.out.println("Enter username");
		String un = sc.next();
		String password = "root";
		System.out.println("Enter password");
		String pw = sc.next();
		
		if(un.equals(userName) && pw.equals(password)) {
			System.out.println("Welcome "+un);
			String ch =null;
			do {
			System.out.println("Enter your choice");
			System.out.println("1. Add Employee");
			System.out.println("2. View Employee");
			System.out.println("3. sortByEmpnoUsingComparable");
			System.out.println("4. sortByNameUsingComparator");
			int choice = sc.nextInt();
			switch (choice) {
			case 1: {
				ec.addEmployee();
				break;
			}
			case 2: {
				ec.viewEmployee();
				break;
			}
			case 3: {
				ec.sortByEmpnoUsingComparable();
				break;
			}
			case 4:{
				ec.sortByEnamUsingComparator();
				break;
			}
			case 5:
				System.out.println("Enter Empid: ");
				int removeId = sc.nextInt();
				ec.removeEmployee(removeId);
				break;
			default: {
				System.out.println("Enter a valid Choice !!!");
				break;
			}
			}
			System.out.println("Do u wnt to continue ? Y or y");
			ch = sc.next();
			
			}while(ch.equals("Y") || ch.equals("y"));
			System.out.println("Thanks for using our system !!!");
			System.exit(0);
			sc.close();
		} else {
			throw new EmployeeNotFoundException("Check your credentials");
		}
		}catch(EmployeeNotFoundException enfe){
			//System.out.println("From enfe catch...");
			System.out.println(enfe);
		}
	}

}
