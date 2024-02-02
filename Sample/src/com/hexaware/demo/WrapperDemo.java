package com.hexaware.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WrapperDemo {

	public static void main(String[] args) {
		int x = 100;
		Integer i = x; //Boxing
		
		int j=i.intValue(); //unBoxing
		
		System.out.println(x+" "+i);
		
		System.out.println(x+i+j);
		System.out.println(i+j+x);
		
		
		//typeCasting
		int a = 4; // int is 4byte
		float b = a; // float 8 byte
		byte c=(byte)b; //byte 1 byte so it cannot hold
						//8 byte value so we use(byte)
		
		System.out.println(c);
		
		List<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(3);
		intList.add(5);
		intList.add(2);
		intList.add(9);
		System.out.println(intList);
		
		int Y= Collections.max(intList);
		System.out.println(Y);
		
		//This is one method to find max
		int max = intList.get(0);
		for(int num:intList) {
			if(num>max) {
				max = num;
			}
		}System.out.println(max);
		
		
	}

}
