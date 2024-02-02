package com.hexaware;

public class Samp1
{
  enum Months
  {
    JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVMBER, DECEMBER
  }
	public static void main(String[] args) {
		int[][] arr2d = {{1,2,3},{4,5,6,},{7,8,9}};
		
		for(int i =0;i<arr2d.length;i++) {
			for(int j=0;j<arr2d[i].length;j++) {
				System.out.println(arr2d[i][j]);
			}
		}
		
		System.out.println("*************");
		int[][] jaggedArr = new int[3][];
		jaggedArr[0] = new int[] {11,12,13};
		jaggedArr[1] = new int[] {14,15};
		jaggedArr[2] = new int[] {16,17,18,19};
		
		for (int i = 0; i < jaggedArr.length; i++) {
			for (int j = 0; j < jaggedArr[i].length; j++) {
				System.out.println(jaggedArr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("***************");
		
		Months[] mons = Months.values();
		for (Months mon : mons) {
			System.out.println(mon);
		}
		
		System.out.println("****Ordinally*****");
		for (Months mon : mons) {
			System.out.println(mon+" - "+mon.ordinal());
		}
	}

}
