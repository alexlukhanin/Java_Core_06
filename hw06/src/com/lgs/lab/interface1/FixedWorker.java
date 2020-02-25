package com.lgs.lab.interface1;

public class FixedWorker implements Salary {

	static double STARTEDLEVEL = 2000.00;
	private String workerName;
	private int level = 2;
	private double salary;

	public FixedWorker(String workerName, int level) {
		super();
		this.workerName = workerName;
		this.level = level;
		
	}

	public static double getSTARTEDLEVEL() {
		return STARTEDLEVEL;
	}

	public static void setSTARTEDLEVEL(double sTARTEDLEVEL) {
		STARTEDLEVEL = sTARTEDLEVEL;
	}

	public String getWorkerName() {
		return workerName;
	}

	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void ToCalculateSalary() {
		this.salary = STARTEDLEVEL + 750 * this.level;
		System.out.println("Salary of " + this.workerName + " is :" + this.salary + "$");

	}

}
