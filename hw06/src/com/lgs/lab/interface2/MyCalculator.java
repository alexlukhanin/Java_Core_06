package com.lgs.lab.interface2;

public class MyCalculator implements Numerable {

	public double Add(double a, double b) {
		
		return a + b;
	}

	public double Subtract(double a, double b) {
		
		return a-b;
	}

	public double ToMultiply(double a, double b) {
		
		return a * b;
	}

	public double ToDevide(double a, double b) {
		if ( b != 0) {
			return a / b;
		}
		else {
			System.out.println("We cannot devide to 0 (zero) and b must not to be ZERO!!!");
			return 0;
		} 
			
		
	}

	

	
}
