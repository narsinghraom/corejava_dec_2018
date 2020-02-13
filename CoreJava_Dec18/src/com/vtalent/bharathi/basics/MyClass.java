package com.vtalent.bharathi.basics;

class Outer{
	int x = 20;
	public String toSting() {
		return "WelCome to Outer Class";
	}	
	
	class Inner{
		int y = 30;
		
	
	
public String toSting() {
	return "WelCome to Inner Class";
}	
}
}
public class MyClass{
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		System.out.println(outer);
		System.out.println(inner);
		
		
		
	}
}
