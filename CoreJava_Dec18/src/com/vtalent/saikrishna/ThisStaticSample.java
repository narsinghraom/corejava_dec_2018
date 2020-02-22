package com.vtalent.saikrishna;

public class ThisStaticSample {

	int a, b;// this 
	static float x,y; //uses class name or context
	public int m1(int a,int b)
	{
	this.a=a+b;//25
	this.b=a+b;//25
		
	return this.a+this.b; 	
	}
		
	public static float m2(float x,float y)
	{
		ThisStaticSample.x=x+y;
		ThisStaticSample.y=x+y;
		return ThisStaticSample.x+ThisStaticSample.y;
		
	}
		
		public static void main(String[] args) 
		{
		ThisStaticSample t=new ThisStaticSample();
		int d=2+t.m1(10, 15);//52
		System.out.println(d);//52
		float f1=t.m2(10.0f, 15.0f);
		System.out.println(f1);
		System.out.println(t.x+t.y);//static //50.0
		System.out.println(t.a+t.b);//instance//50
		
		
		}

}
