package com.vtalent.corejava.anusha;

public class Basic2 {
	static int i,  j;	
	float f1, f2;
	public static void function(int i, float j)
	{
		method();
		i=i+ (int) j;
		j= (float) i;
		System.out.println((int)(i+j));
	}
	
	public static void method()
	{
		System.out.println("My Name is "+"Anusha");
		
	}
	
	public float fun(float f1, float f2)
	{
		f1=f1+f2;
		this.f1=f1+f2;
		f2=this.f1+f2;
		this.f2=this.f1+f2;
		System.out.println(f1);
		System.out.println(this.f1);
		System.out.println(f2);
		System.out.println(this.f2);
		return (int) (this.f1+this.f2);
	}

	public static void main(String[] args) {
		function(10, 1.5f);
		Basic2 basic2=new Basic2();
		float x=basic2.fun(10.0f, 2.0f);
		System.out.println(x);		
		
	}
}
