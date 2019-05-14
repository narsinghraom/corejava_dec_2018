package com.vtalent.mohammad;

public class Example {
	
	double d1, d2;
	
	public long funtionOne(double d1,double d2) {
		d1= d1+d2;
		this.d2=this.d1+d2;
		return (long)d1+d2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example exp=new Example();
		exp.funtionOne(10.0, 15.0);
		System.out.println(exp.d1+exp.d2);
		System.out.println(exp);
		
	}

}
