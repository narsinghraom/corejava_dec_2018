package com.vtalent.java.haritha;

public class Basic1 {
	int i,j;
	static float f1,f2;
	public void functionOne() {
		i=5;
		j=7;
	}
	public static int functionTwo(float f1) {
		Basic1.f1=f1+Basic1.f1;
		f2=Basic1.f1+f2;
		return(int)f1;
	}
	public static void main(String[] args) {
		Basic1 obj=new Basic1();
		obj.functionOne();
		int k=functionTwo((float)obj.i);
		obj.functionOne();
		System.out.println(obj.i+obj.j);
		System.out.println(f1+f2);
	}
	}
