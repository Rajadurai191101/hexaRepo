package com.hexaware.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
	
	private String role;
	private String mName;
	private int eid; 
	
	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public String getmName() {
		return mName;
	}


	public void setmName(String mName) {
		this.mName = mName;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	
	
	
	public static void addManagerToList(List<? extends Employee> l1) {
		Scanner sc =new Scanner(System.in);
		String r = sc.next();
		//l1.add(r);
		String mName = sc.next();
		int eid = sc.nextInt();
		//l1.addAll
		if(r == "manager") {
			//l1.add(r);
			System.out.println();
		}
	}


	public static void main(String[] args) {
		List<? extends Employee> l1 = new ArrayList();
		addManagerToList(l1);
	}
}

