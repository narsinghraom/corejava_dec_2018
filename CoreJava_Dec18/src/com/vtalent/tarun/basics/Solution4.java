package com.vtalent.tarun.basics;

import java.util.*;

public class Solution4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AutonomousCar[] ac = new AutonomousCar[4];
		for (int i = 0; i < ac.length; i++) {
			int a = sc.nextInt();sc.nextLine(); // cardId
			String b = sc.nextLine(); // brand
			int c = sc.nextInt(); // noOfTestsConducted
			int d = sc.nextInt();sc.nextLine(); // noOfTestsPassed 
			String e = sc.nextLine(); //env
			ac[i] = new AutonomousCar(a, b, c, d, e);
		}
		//sc.nextLine();
		String en = sc.nextLine();
		String bd = sc.nextLine();
		int res = findTestPassedByEnv(ac, en);
		if (res > 0) {
			System.out.println(res);
		}
		AutonomousCar temp = updateCarGrade(ac, bd);
		if (temp == null)
			System.out.println("No car is avalable with specified brand");
		else
			System.out.println(temp.getBrand() + "::" + temp.getGrade());
	}

	public static int findTestPassedByEnv(AutonomousCar[] ac, String en) {
		int s = 0, j = 0;
		for (int i = 0; i < ac.length; i++) {
			if (en.equalsIgnoreCase(ac[i].getEnvironment())) {
				s = s + ac[i].getNoOfTestsPassed();
				j++;
			}
		}
		if (j > 0) {
			return s;
		} else {
			return 0;
		}
	}

	public static AutonomousCar updateCarGrade(AutonomousCar[] ac, String bd) {
		AutonomousCar ac2 = new AutonomousCar();
		int rating;
		for (int i = 0; i < ac.length; i++) {
			rating = (ac[i].getNoOfTestsPassed() * 100) / ac[i].getNoOfTestsConducted();
			if (rating >= 80 && (ac[i].getBrand().equalsIgnoreCase(bd))) {
				ac2.brand = bd;
				ac2.grade = "A1";
			} else
				ac2.brand = bd;
				ac2.grade = "B2";
}
		return ac2;
}
}
class AutonomousCar {
	int carId, noOfTestsConducted, noOfTestsPassed;
	String environment, brand, grade;

	AutonomousCar(int carId, String brand, int noOfTestsConducted, int noOfTestsPassed, String environment) {
		super();
		this.carId = carId;
		this.brand = brand;
		this.noOfTestsConducted = noOfTestsConducted;
		this.noOfTestsPassed = noOfTestsPassed;
		this.environment = environment;
	}

AutonomousCar() {
		// TODO Auto-generated constructor stub
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}

	public int getNoOfTestsConducted() {
		return noOfTestsConducted;
	}

	public void setNoOfTestsConducted(int noOfTestsConducted) {
		this.noOfTestsConducted = noOfTestsConducted;
	}

	public int getNoOfTestsPassed() {
		return noOfTestsPassed;
	}

	public void setNoOfTestsPassed(int noOfTestsPassed) {
		this.noOfTestsPassed = noOfTestsPassed;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
}