package com.vtalent.java.prashanth;

public class DemoFirst {
int x,y;
static float f1;
public void function() {
	x=5;
	y=x+5;
}
public static float function(int x)
{
	f1=x+0.5f;
	return f1;
	
}
public static void main(String[] args) {
	DemoFirst samp=new DemoFirst();
	samp.function();
	//System.out.println(samp.y);
	f1=function(samp.y);
	System.out.println(samp.x+samp.y);
	System.out.println(f1);
	
}
}
