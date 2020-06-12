package com.vtalent.corejava.siva;

public class Second extends First {
	int x,y;
	public void function(int x,int y)
	{
		this.x=this.x+x;
		this.y=this.y+y;
		super.x=super.x+x;
	}
}
