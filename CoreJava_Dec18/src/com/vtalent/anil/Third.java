package com.vtalent.anil;

public class Third extends Second
{
	int j;
	public void fun(int j)
	{
	super.fun(j);
	this.j=this.j+j;
	super.j=super.j+j;
	
	}

}
