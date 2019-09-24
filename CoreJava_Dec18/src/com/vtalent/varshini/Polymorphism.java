package com.vtalent.varshini;

class polyOne1{
	double a,b;
	static int x,y;
	public int function(double a) {
		this.a=this.a+a;
		b=b+a;
		return (int)a;
	}
public double function(int x,int y,int z) {
	polyOne1.x=polyOne1.x+x;
	polyOne1.y=polyOne1.y+y;
	return (double)(x+y);
	}
}
class polyTwo1 extends polyOne1{
	double a;
	public int  function(double a) {
		super.function(a);
		this.a=this.a+a;
		b=b+a;
		return (int)(a+b);
	}
	public int function(double a,double b) {
		this.a=this.a+a;
		this.b=this.b+b;
		return (int)(a+b);
	}
}
class polyThree extends polyTwo1{
	double a;
	public int  function(double a) {
		super.function(a);
		//this.a=this.a+a;
		b=b+a;
		return (int)b;
	}
	public double function(int a,int b) {
		this.a=this.a*a;
		this.b=this.b+b;
		return (double)(a+b);
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		polyOne1 p1=new polyThree();
		int k=p1.function(2.0);
		//k=p1.function((double)k,(double)k);
		double d1=p1.function(k,k,k);
		System.out.println(d1);
		System.out.println(p1.a);
		System.out.println(p1.b);
		
			}

}
