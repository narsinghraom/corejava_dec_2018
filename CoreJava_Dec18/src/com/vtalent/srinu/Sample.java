package com.vtalent.srinu;

public class Sample {
	int x,y;
	static float f1,f2;
	public int  functionone(int x,int y)
	{
		x=x+y;
		y=x+y;
		this.x=this.x+y;
		this.y=this.y+y;
		return x+y;
	}
	public static float functiontwo(float f1,float f2)
	{
		f1=f1+f2;
		f2=f1+f2;
		Sample.f1=Sample.f1+f1;
		Sample.f2=Sample.f2+f2;
		return f1+f2;		
	}
		public static void main(String[] args) {
			float f1=functiontwo(1.5f,1.5f);
					
		Sample s1=new Sample();
		f1=f1+s1.functiontwo((int)f1,(int)f1+f2);
		System.out.println(f1);
		System.out.println(s1.x+s1.y);
		System.out.println(s1.f1+f2);
		}
}
		
		
		
		
		

