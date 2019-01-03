package com.vtalent.hanu.oop;

public class Test_Oop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BikeImpl b= new Duke();
		b.cc();
		b.cost();
		b.fuelType();
		b.speed();
		b.version();
		
		Duke d= new Duke();
		System.out.println("--------");
		d.cc();
		d.cost();
		d.fuelType();
		d.speed();
		d.version();
		
		BikeImpl bike= new BikeImpl();
		System.out.println("--------");
		bike.cc();
		bike.cost();
		bike.fuelType();
		bike.speed();
		bike.version();
		
		Engine e=new Duke();
		System.out.println("Interface implemented classe");
		e.cc();
		e.fuelType();
		
		Bike bi=new Duke();
		System.out.println("-----------");
		
		
		bi.cc();
		bi.cost();
		bi.speed();
		

	}

}
