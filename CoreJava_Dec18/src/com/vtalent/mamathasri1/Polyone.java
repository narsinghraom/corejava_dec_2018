package com.vtalent.mamathasri1;
public class Polyone {
	double a,b;
	static int x,y;
	public int function(double a) {
		this.a=this.a+a;
		b=b+a;
		return (int)a;
	}
	public double function(int x,int y, int n) {
		
		Polyone.x=Polyone.x+x;
		Polyone.y=Polyone.y+y;
		return(double)x+y;
	}
}
class PolyTwo extends Polyone
{
	double a;
	public int function(double a)
	{
		super.function(a);
	
		this.a=this.a+a;
		b=b+a;
		return(int)(a+b);
	}
public int function(double a,double b)
{
	this.a=this.a+a;
	this.b=this.b+b;
	return(int)(a+b);
}

}
class PolyThree extends PolyTwo{	
	double c;
	public int function(double a)
	{
		super.function(a);
		this.a=this.a+a;
		b=b+a;
		return(int)(a+b);
	
	}
		   public int function(double a,double b,double c) {
	
	this.a=this.a+a;
	this.b=this.b+b;
	this.c=this.c+c;
	return (int)(a+b+c);
}
}
class Test{
	public static void main(String args[]) {
		Polyone p1=new PolyTwo();
		int k=p1.function(2.0);
	//k=p1.function((double)k,(double)k);
		double d1=p1.function(k,k,k);
		System.out.println(d1);
		System.out.println(k);
		System.out.println(p1.a);
		System.out.println(p1.b);			
	}
}


