package com.hexaware.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenUbLb {
	
	//Integer is LowerBound
	public static void addNumberToList(List<? super Integer> list) {
		for(int i=0;i<10;i++) {
			list.add(i);
			
		}System.out.println(list);
	}
	
	//Number is UpperBound
	public static void sumNumber(List<? extends Number> list) {
		double d=0;
		for(Number n:list) {
			d=d+n.doubleValue();
		}System.out.println(d);
	}
	
	
	
	public static void main(String[] args) {
		List<Object> l1 = new ArrayList();
		addNumberToList(l1);
		List<Number> l2 = new ArrayList();
		addNumberToList(l2);
		
		List<Double> l3 = Arrays.asList(1.1,2.2,3.3); 
		sumNumber(l3);
		List<Integer> l4 = Arrays.asList(10,20,30); 
		sumNumber(l4);
		
	}
	
}
