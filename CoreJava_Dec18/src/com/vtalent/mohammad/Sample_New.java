package com.vtalent.mohammad;

public class Sample_New {

	int x,y;
	static float f1;
	public void function()
	{
		f1=2.5f;
	}
	public static int function(int x,int y)
	{
		x= x+(int)f1;
		y=y+(int)f1;
		return x+y;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample_New s1=new Sample_New();
		s1.function();
		int k=function(2,3);
		System.out.println("K Value "+k);
		System.out.println("X + Y Value "+(s1.x+s1.y));
		System.out.println("f1 value "+f1);
	}
}
