package com.lgs.lab.interface1;

public class HourlyWorker implements Salary {

	private String workerName;
	private double hourlySalary;
	private int hoursPerMonth;
	private double salary;

	public HourlyWorker(String workerName, double hourlySalary, int hoursPerMonth) {
		super();
		this.workerName = workerName;
		this.hourlySalary = hourlySalary;
		this.hoursPerMonth = hoursPerMonth;
	}

	public String getWorkerName() {
		return workerName;
	}

	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}

	public double getHourlySalary() {
		return hourlySalary;
	}

	public void setHourlySalary(double hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

	public int getHoursPerMonth() {
		return hoursPerMonth;
	}

	public void setHoursPerMonth(int hoursPerMonth) {
		this.hoursPerMonth = hoursPerMonth;
	}

	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void ToCalculateSalary() {
		
		this.salary = this.hourlySalary * this.hoursPerMonth; 
		System.out.println("Salary of " + this.workerName + " is :" + this.salary + "$");
	}

}
