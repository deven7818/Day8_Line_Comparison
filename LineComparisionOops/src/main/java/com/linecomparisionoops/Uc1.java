package com.linecomparisionoops;

import java.util.Scanner;

public class Uc1 {

	public static void main(String[] args) {
		
		System.out.println("Welcome to Line Comparison Computation Program!!");
		System.out.println(lengthCal());
	}
		/*
		 * length calculation
		 */
		public static double lengthCal() {
			Scanner sc = new Scanner(System.in);
			double x1,x2,y1,y2;
			
			System.out.println("Enter Values For x1 and y1");
			x1 = sc.nextDouble();
			y1 = sc.nextDouble();
			
			System.out.println("Enter Values For x2 and y2");
			x2 = sc.nextDouble();
			y2 = sc.nextDouble();
			
			double val1 = Math.pow((x2-x1), 2);
			double val2 = Math.pow((y2-y1), 2);
			double result = Math.sqrt(val1 + val2);
			return result;
		
	}
	
}
