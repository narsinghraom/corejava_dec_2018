package com.vtalent.rakesh;

import java.io.Serializable;

public class Employeee implements Serializable {

	private int id = 100;
	private String name = "rrrrrrakeshhhh";
	transient double salary = 10000;
	private int x = 45;

	public int getId() {
		return id;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
