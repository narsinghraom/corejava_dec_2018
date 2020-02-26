package com.vtalent.corejava.siva;

public class Nk {
	int x,y;

	Nk()
	{
	this(2,9);
	x=2;
	y=5;
	}

	Nk(int x)
	{
		this();
	this.x=this.x+x;
	y=y+x;
	}

	Nk(int x,int y)
	{
	this.x=this.x+x;
	this.y=this.y+y;
	}

	public static void main(String args[])
	{

	/*Nk c1=new Nk();
	System.out.println(c1.x+c1.y);*/


	Nk c2=new Nk(5);
	System.out.println(c2.x+c2.y);

	/*Nk c3=new Nk(2,5);
	System.out.println(c3.x+c3.y);*/
	}

}
