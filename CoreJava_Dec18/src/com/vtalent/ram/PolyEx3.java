package com.vtalent.ram;
class Demoo {
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
class Demo3 extends Demoo{
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
public class PolyEx3{
	public static void main(String[] args) {
		Demoo d3=new Demoo();
		float f2=d3.function(3.0f, 1.5f);
		d3.function((long)f2);
		d3.function(f2);
		d3.function();
	}
}
 
