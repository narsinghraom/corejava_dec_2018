package com.vtalent.vinodreddy;

class PolyOne{
	static int x,y;
	double a ,b;
	
	public int function(double a) {
		this.a =this.a+a;
		b =b+a;
		return(int)a;
	}

public double function(int x,int y,int z) {
	PolyOne.x =PolyOne.x +x;
	PolyOne.y =PolyOne.y+y;
	
	
	return (double)(x+y);
	
}
}
class PolyTwo extends PolyOne{
	double a;
	public int function(double a) {
		super.function(a);
		this.a =this.a+b;
		b =b+a;
		return (int)(a+b);
	}
	public int function (double a ,double b) {
		this.a=this.a+a;
		b=b+a;
		return (int)(a+b);
	}
}
class PolyThree extends PolyTwo{
	
	int a,b;
	
	public int function(int a,int b) {
		this.a =this.a+b;
		super.b=this.b+super.b;
		return a+b;
		
	}
}

public class Polymorphism {
public static void main(String[] args) {
	PolyThree p1 =new PolyThree();
	int k =p1.function(2.0);
	k =p1.function((double)k,(double)k);
	double d1 =p1.function(k, k);
	System.out.println(d1);
	System.out.println(k);
	System.out.println(p1.a);
	System.out.println(p1.b);
	
}
}

