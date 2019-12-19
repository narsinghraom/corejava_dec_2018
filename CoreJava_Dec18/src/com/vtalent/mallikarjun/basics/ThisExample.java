package com.vtalent.mallikarjun.basics;

public class ThisExample {
	static int a,b;
	float f1,f2;
	public int function(float f1,float f2) {
		this.f1=this.f1+f1;
		this.f2=this.f2+f2;
		a=(int)this.f1;
		b=(int)this.f2;
		return a+b;
	}
	public static float function(int a,int b) {
		a=ThisExample.a+a;
		b=ThisExample.b+b;
		return a+b;
	}
	public static void main(String[] args) {
		ThisExample t=new ThisExample();
		t.f1=1.5f;
		t.f2=2.5f;
		a=t.function(t.f1, t.f2);
		t.f2=function(a,a+2);
		System.out.println(a+b);
		System.out.println(t.f1+t.f2);
		
	}

}
