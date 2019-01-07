package com.vtalent.chamu.OOPS;

public class InterfaceSample 
{	
	float f1,f2;
	public void function(float f1,float f2)
	{
		this.f1 = f1+f2;
		this.f2 = f2+this.f2;
	}
	public void function(long l)
	{
		this.f1 = this.f1+(float)l;
	}

}
