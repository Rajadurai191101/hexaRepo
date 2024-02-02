package com.hexaware.java8;

interface Calculator{
	public int add(int a,int b);
}


public class FuncInter{
	public static void main(String[] args) {
		Calculator res = (a,b) -> {return a+b;};
		System.out.println(res.add(13, 10));
	}
}
//Java 7
//public class FuncInter implements Calculator {
//
//	public static void main(String[] args) {
//		
//		FuncInter fi = new FuncInter();
//		System.out.println(fi.add(50, 10));		
//
//	}
//
//	@Override
//	public int add(int a, int b) {
//		// TODO Auto-generated method stub
//		return a+b;
//	}
//
//}
