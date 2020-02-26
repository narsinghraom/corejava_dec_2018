package com.vtalent.corejava.rajeshkumar;

public class Basic3 {	
	public static float function(float f,float f1){
		f=f+f1;
		return f;
	}
	public static void method(int i){
		 i=i+i;
		 System.out.println(i);
	}
	public static void main(String[] args) {
		method(5);
		float f2=function(5.5f,5.5f);
		System.out.println(f2);
	}


	}


