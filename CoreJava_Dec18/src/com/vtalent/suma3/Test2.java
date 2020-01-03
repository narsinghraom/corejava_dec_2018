package com.vtalent.suma3;

class Ssample
{
	static float f1;
	int x,y;
	public float function( int x, int y)
	{
		this.x=this.x+x;
		this.y=this.y+y;
		return this.x+this.y;
	}
	public void function (int x)
	{
		this.x=this.x+x;
		f1=f1+this.x;
	}
}
class SampleOne extends Ssample
{
	int y;
	public float function ( int x, int y) 
	{
		Ssample.f1= Ssample.f1+super.function(2, 5);
		this.y=this.y+super.y+y;
	    this.x=this.x+x;
	    return this.y+this.x;
	}
	public void function()
	{
		float f1=function(2,5);
		System.out.println(f1);
	}
}

public class Test2 {
	public static void main(String args[]) 
	{
		Ssample s1= new SampleOne();

		Ssample.f1=Ssample.f1+s1.function(2,5);
		s1.function((int)(Ssample.f1));
		System.out.println(s1.x+s1.y);
		System.out.println(Ssample.f1);
	}	
		
	}


