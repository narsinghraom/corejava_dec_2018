package com.vtalent.java.naveen;

public class InherSampleTwo extends InherSampleOne {
	int i;
	float f1;
	public void function(int i)
	{
		this.i=i+i;//10
	}
	public void function(float f1)
	{
		this.f1=f1+super.f1;
	}
}
