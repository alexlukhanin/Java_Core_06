package com.lgs.lab.interface2;

public class Application {

	public static void main(String[] args) {

		
		double a = 4.5;
		double b = 7.1;
		
		MyCalculator myCalculator = new MyCalculator();
		
		System.out.println("Result of adding a and b is: "+ myCalculator.Add(a, b));
		System.out.println("Result of substracting a and b is: "+ myCalculator.Subtract(a, b));
		System.out.println("Result of multiplying a and b is: "+ myCalculator.ToMultiply(a, b));
		System.out.println("Result of deviding a and b is: "+ myCalculator.ToDevide(a, b));
		
		
	}

}
