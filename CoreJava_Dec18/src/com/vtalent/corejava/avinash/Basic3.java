package com.vtalent.corejava.avinash;

public class Basic3 {
	static {
		System.out.println("hi");
	}
	public static float function(float f,float f1){
		f=f+f1;
		return f;
	}
	public static int method(int i){
		 i=i+i;
		 return i;
	}
	public static void main(String[] args) {
		int i=method(5);
		System.out.println(i);
		float f2=function(5.5f,5.5f);
		System.out.println(f2);
	}
}

