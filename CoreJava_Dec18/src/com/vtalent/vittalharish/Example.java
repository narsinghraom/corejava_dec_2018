package com.vtalent.vittalharish;

public class Example {
	
	double d1 , d2;
	
	public double  functionOne(double d1,double d2){
		
		d1=d1+d2;
		this.d2=this.d1+d2;
		return (long) d1+d2;
	}
	public static void main(String[] args) {
		Example emp = new Example();
		emp.functionOne(10.0,15.0);
		System.out.println(emp.d1+emp.d2);
		System.out.println(emp);
		
	}

}
