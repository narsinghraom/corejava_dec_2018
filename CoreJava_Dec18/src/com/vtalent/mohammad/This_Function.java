package com.vtalent.mohammad;

public class This_Function {
	static int a,b;
	float f1,f2;
	public int function(float f1,float f2)
	{
		this.f1=this.f1+f1;
		this.f2=this.f2+f2;
		a=(int)this.f1;
		b=(int)this.f2;
		return a+b;
	}
	public static float funtion(int a, int b)
	{
		a=This_Function.a+a;
		b=This_Function.b+b;
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_Function thisfunc= new This_Function();
		thisfunc.f1=1.5f;
		thisfunc.f2=2.5f;
		a=thisfunc.function(thisfunc.f1, thisfunc.f2);
		thisfunc.f2=This_Function.funtion(a, a+b);
		System.out.println("A + B Value : "+(a+b));
		System.out.println("F1 + F2 Value : "+(thisfunc.f1+thisfunc.f2));
	}

}
