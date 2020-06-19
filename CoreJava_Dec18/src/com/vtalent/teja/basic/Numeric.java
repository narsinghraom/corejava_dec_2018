package com.vtalent.teja.basic;

public class Numeric {
public static void main (String[] args) {
	String String = "12345.15";
	boolean numeric=true;
	try {
		Double num=Double.parseDouble(String);
	}
	catch (NumberFormatException e) {
		numeric=false;
	}
	if(numeric)
		System.out.println(String + "is a number");
	else
		System.out.println(String + "is not a number");
	
}
}
