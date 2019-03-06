package com.vtalent.ram;

 class Poly1 {
float f1,f2;
public void function(float f1)
{
	this.f1=f1+f1;
	f2=this.f1+f1;
}
public float function(float f1,float f2)
{
	this.f1=this.f1+f1;
	this.f2=this.f2+f2;
	return(int)(f1+f2);
	
}
public void function()
{
	System.out.println("f1 " + f1);
	System.out.println("f2  "+ f2);
}
}
class PolyOne extends Poly1{
	long l1,l2;
	float f1;
	public void function(long l1)
	{
		this.l1=l1+l1;
		l2=this.l1+l1;
		
	}
	public float function(float f1,float f2)
	{
		this.f1=this.f1+f1;
		this.f2=this.f2+f2;
		super.f1=super.f1+f1;
		return f1+f2;
	}
}
public class Poly{
	public static void main(String[] args) {
		Poly1 d1=new PolyOne();
		float f1=d1.function(2.5f, 1.5f);
		d1.function((long)f1);
		d1.function(f1);
		d1.function();
	}
}