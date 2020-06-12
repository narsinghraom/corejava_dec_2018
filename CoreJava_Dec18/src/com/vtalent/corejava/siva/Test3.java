package com.vtalent.corejava.siva;

class Sample1
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
class SampleOne1 extends Sample1
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

public class Test3 {
	public static void main(String[] args) {
		Sample1 s2=new SampleOne1();
		s2.function(2);
		//s2.function(2,3);
		s2.function();
		System.out.println(s2.x);
		//System.out.println(s2.y);
	}
}
