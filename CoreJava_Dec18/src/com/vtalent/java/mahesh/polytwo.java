package com.vtalent.java.mahesh;

public class polytwo extends Polyone{
	double a;
	public int function(double a){
	super.function(a);
	this.a=this.a+a;
	b=b+a;
	return (int)(a+b);
	}
	public int function(double a,double b){
	this.a=this.a+a;
	this.b=this.b+b;
	return (int)(a+b);
	}
}
