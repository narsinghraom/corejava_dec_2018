package com.vtalent.corejava.krishnavardhan;

public class Java1 {
	public static float function(float f,float f1){
		f=f+f1;
		return f;
	}
	public static void method(int j){
		 j=j+j;
		 System.out.println(j);
	}
	public static void main(String[] args) {
		method(5);
		float f2=function(1.5f,1.5f);
		System.out.println(f2);
	}
}
