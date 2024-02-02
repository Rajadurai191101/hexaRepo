package com.hexaware;

import java.util.Arrays;

public class MainClass {

	public static void main(String[] args) {
	/*	Employee emp = new Employee(11,"Raja");
		System.out.println(emp);System.out.println("----------------------");
		
		emp.setEmpno(12);
		emp.setEname("Hari");
		
		System.out.println(emp);System.out.println("----------------------");
		
		int[] intArr = new int[3]; 
		intArr[0] = 11;
		intArr[1] = 12;
		intArr[2] = 13;
		System.out.println(intArr);
		System.out.println("----------------------");
		
		System.out.println(Arrays.toString(intArr));
		System.out.println("----------------------");
		
		for(int i=0; i<3 ; i++) {
			System.out.println("i = " + intArr[i]);
		}
		System.out.println("----------------------");
		//Enhanced for loop
		for(int i : intArr) {
			System.out.println("i = " + i);
		}
		System.out.println("----------------------");
		
		int j=0;
		while(j < intArr.length) {
			System.out.println("j = " + intArr[j]);
			j++;
		}
		System.out.println("----------------------");
		
		
		System.out.println("Do while");
		
		int k=0;
		do {
			System.out.println("k = " +intArr[k]);
			k++;
		}while(k < 3);System.out.println("----------------------");
		
		
		String[] strArr = {"Shiva","Hari","Bala","Seetha"};
		System.out.println(Arrays.toString(strArr));
		System.out.println("----------------------");
		
		Employee[] empArr = new Employee[3];
		empArr[0] = new Employee(11,"Shiva");
		empArr[1] = new Employee(12,"Ram");
		empArr[2] = new Employee(13,"Seetha");
		System.out.println(Arrays.toString(empArr));
		System.out.println("----------------------");
		
		
		for(Employee e : empArr) {
			System.out.println("e = " + e);
		}System.out.println("----------------------");
		*/
		
		System.out.println(new Employee().getClass());
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		e1.setEname("Asha");
		e2.setEname("Ashan");
		
		System.out.println(e1.getEname().equals(e2.getEname()));
		System.out.println(e1.getClass());
		System.out.println(e2.getClass());

	}

}
