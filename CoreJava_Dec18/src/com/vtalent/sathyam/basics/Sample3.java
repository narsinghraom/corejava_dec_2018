package com.vtalent.sathyam.basics;

import com.vtalent.aasritha.basic.Sample;

public class Sample3 {
int x,y;
static float f1;
public void function()
{
	f1=2.5f;
}
public int function(int x,int y)
{
	x=x+(int)f1;
	y=y+(int)f1;
	return x+y;
}
public static void main(String[] args) {
	Sample3 s1=new Sample3();
	s1.function();
	int k=s1.function(2,3);
	System.out.println(k);
	System.out.println(s1.x+s1.y);
	System.out.println(f1);
	 
	
}
}
