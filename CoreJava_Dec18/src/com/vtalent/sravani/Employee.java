package com.vtalent.sravani;

public class Employee {

	 
	public Employee(int id, long salary) {
		super();
		this.id = id;
		this.salary = salary;
	}

	private int id;
	private long salary;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("Employee [id=%s, salary=%s]", id, salary);
	}

}

