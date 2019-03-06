package com.vtalent.ram;

class Poly2 {
float f1,f2;
long l1,l2;


public void function(float f1)
{
	this.f1=f1+f1;
	f2=this.f1+f1;
}
public float function(float f1,float f2)
{
	this.f1=this.f1+f1;
	this.f2=this.f2+f2;
	return (int)(f1+f2);
	
}
public void function()
{
	System.out.println("f1 " + f1);
	System.out.println("f2 " + f2);
}
public void function(long l1)
{
	this.l1=l1+l1;
	l2=this.l1+l1;
	
}

}
class PolyTwo extends Poly2{
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
 class PolyEx2{
	public static void main(String[] args) {
	Poly2 d2=new PolyTwo();
	float f1=d2.function(2.5f, 1.5f);
	d2.function(5l);
	d2.function(f1);
	d2.function();
	System.out.println(d2.f1);
	System.out.println(d2.f2);
	//System.out.println(d2.l1);
	//System.out.println(d2.l2);
	
	PolyTwo t=new PolyTwo();
	
	
	}
}


