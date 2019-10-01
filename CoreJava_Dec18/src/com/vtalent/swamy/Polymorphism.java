package com.vtalent.swamy;
class One{
	double a,b;
	static int  x,y;
	public  int function(double a) {
		this.a=this.a+a;
		b=b+a;
		return(int) a;
	}
	public double function(int x , int y,int z) {
		One.x= One.x+x;
		One. y=One.y+y;
	z=x+y+z;
		return (double)(x+y);
	}
}
class Two extends One{
	double a;
	public int function(double a) {
		this.a=this.a+a;
		b=b+a;
		return (int)(a+b);
	}
	public int function(double a,double b) {
		this.a=this.a+a;
	this.b=b+a;
		return (int)(a+b);
	}
}
  class Polymorphism{
	 public static void main(String[] args) {
		Two t=new Two();
		int k=t.function(2.0);
		k=t.function((double)k,(double)k);
		double d=t.function(k, k,k);
		System.out.println(k);
		System.out.println(t.a);
		System.out.println(t.b);
		System.out.println(d);
	}
 }