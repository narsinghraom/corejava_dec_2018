package com.vtalent.varshini;

class polyOne{
	double a,b;
	static int x,y;
	public int function(double a) {
		this.a=this.a+a;
		b=b+a;
		return (int)a;
	}
public double function(int x,int y,int z) {
	polyOne.x=polyOne.x+x;
	polyOne.y=polyOne.y+y;
	return (double)(x+y);
	}
}
class polyTwo extends polyOne{
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
public class Test6 {

	public static void main(String[] args) {
		polyOne p1=new polyTwo();
		int k=p1.function(2.0);
		//k=p1.function((double)k,(double)k);
		double d1=p1.function(k,k,k);
		System.out.println(d1);
		System.out.println(p1.a);
		System.out.println(p1.b);
	}
}
