package com.lgs.lab.interface1;

public class Application {

	public static void main(String[] args) {
		
		
		FixedWorker worker1 = new FixedWorker("Bryan Johnson", 2);
		HourlyWorker worker2 = new HourlyWorker("John Doe", 30, 170);
		
		worker1.ToCalculateSalary();
		System.out.println("The salary of " + worker1.getWorkerName() + " is realy " + worker1.getSalary() + "$");
		System.out.println("");
		
		worker2.ToCalculateSalary();
		System.out.println("The salary of " + worker2.getWorkerName() + " is realy " + worker2.getSalary() + "$");
		
		
		
		
		
		
	}

}
