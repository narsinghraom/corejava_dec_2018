package com.vtalent.java.mahesh;
class polythree extends polytwo{
	double b;
	public int function(double a){
		super.function(a);
		b=b+a;
		return (int)b;
	}
	public double function(int a,int b){
		this.a=this.a/a;
		this.b=this.b*b;
		return (double)(a+b);
		}
}