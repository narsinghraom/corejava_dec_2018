package com.vtalent.java.venkatesh;

class PolyOne {
double a,b;
static int x,y;
public int function(double a) {
	this.a=this.a+a;
	b=b+a;
	return(int)(a);
}
public double function(int x,int y,int z) {
	PolyOne.x=PolyOne.x+x;
	PolyOne.y=PolyOne.y+y;
	return(double)(x+y);
}
}
class PolyTwo extends PolyOne{
	double a;
	public int function (double a) {
		this.a=this.a+a;
		b=b+a;
		return (int)(a+b);
	}
	public int function(double a, double b) {
		this.a=this.a+a;
		this.b=this.b+b;
		return (int)(a+b);
	}
	}
class PolyTest {
public static void main(String[] args) {
	PolyTwo p1=new PolyTwo();
	int k=p1.function(2.0);
	k=p1.function((double)k,(double)k);
	double d1=p1.function(k,k,k);
	System.out.println(d1);
	System.out.println(k);
	System.out.println(p1.a);
	System.out.println(p1.b);
}
}

