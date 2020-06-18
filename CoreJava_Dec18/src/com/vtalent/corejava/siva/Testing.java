package com.vtalent.corejava.siva;

public class Testing {
	int x,y;
	Testing()
	{
	System.out.println("Default constructor");
	x=2;
	y=5;
	}
	Testing(int x)
	{
	this(2,8);
	this.x=this.x+x;
	y=this.x+y;
	}
	Testing(int x,int y)
	{
	this();
	x=this.x+y;
	this.y=this.y+x;
	}
	public static void main(String args[])
	{
	Testing obj=new Testing(9);

	System.out.println(obj.x+obj.y);
	}

}
