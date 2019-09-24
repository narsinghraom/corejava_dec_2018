package com.vtalent.java.srikarreddy;

class PolyOne1{
	double a,b;
	static int x,y;
	public int function(double a) {
		this.a=this.a+a;
		b=b+a;
		return (int) a ;
	} 
 
public double function(int x,int y,int z ) {
	PolyOne1.x=PolyOne1.x+x;
	PolyOne1.y=PolyOne1.y+y;
	return(double)(x+y);
}
}
class PolyTwo2 extends PolyOne1{
	double a;
	public int function(double a) {
		super.function(a);
		this.a=this.a+a;
		b=b+a;
		return (int)(a+b);
	}
	 public int function(double a,double b ) {
		 this.a=this.a+a;
		 this.b=this.b+b;
		 return (int)(a+b);
	 }
}

public class TestP1 {
public static void main(String[] args) {
	PolyOne1 p1=new PolyTwo2();
	int k=p1.function(2.0);
	//k=p1.function ((double)k, (double)k); 
	double d1=p1.function(k, k, k);
	System.out.println(d1);
	System.out.println(k);
	System.out.println(p1.a);
	System.out.println(p1.b);
}}