package com.vtalent.corejava.siva;

class Sample
{
	int x;
	public void function(int x)
	{
		this.x=this.x+x;
	}
	public void function()
	{
		System.out.println(x);
	}
}
class SampleOne extends Sample
{
	int x,y;
	public void function(int x)
	{
		this.x=x+this.x+2;
		y=x;
	}
	public void function(int x,int y)
	{
		this.x=this.x+x;
		this.y=this.y+y;
	}
}

public class Test2 {
public static void main(String[] args) {
	SampleOne s1=new SampleOne();
	s1.function(2);
	s1.function(2,3);
	s1.function();
	System.out.println(s1.x);
	System.out.println(s1.y);
}
}
