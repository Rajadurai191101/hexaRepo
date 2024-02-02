package com.hexaware;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOEg {
	public static void main(String[] arg) throws  IOException {
	       
	       System.out.println("Main Started");
	        try{
	        InputStreamReader isr  = new InputStreamReader(System.in);
	        BufferedReader  br = new BufferedReader(isr);
	        int x =0, y=0;
	        System.out.println("Enter x");
	        x= Integer.parseInt(br.readLine());
	        System.out.println("Enter y");
	        y = Integer.parseInt(br.readLine());
	         int  z =x/y;
	        System.out.println("z : " + z); 
	         }catch(NumberFormatException nfe){
	              System.out.println("Dont divide by a  Character");
	          }
	          catch(Exception e){
	              e.printStackTrace();
	          }
	          finally{
	    	  System.out.println("From Finally");
	           }

	        System.out.println("Main Ends");
	    }
}
