package com.vtalent.anil;

public class Second extends First
{
	int i;
	public void fun(int i,int j)
	{
	super.fun(i,j);
	this.i=this.i+i;
	this.j=this.j+j;
	super.i=super.i+i;
	}
}
