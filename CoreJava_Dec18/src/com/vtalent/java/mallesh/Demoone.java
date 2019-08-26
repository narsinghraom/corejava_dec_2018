package com.vtalent.java.mallesh;

public class Demoone {
	int x,y;
	static float f1;
	public void function(){
		x=5;
		y=x+5;
	}
	public static float function(int x){
		f1=x+0.5f;
		return f1;
		
	}
	public static void main(String[] args) {
		Demoone dm=new Demoone();
		dm.function();
		f1=function(dm.y);
		System.out.println(dm.x+dm.y);
		System.out.println(f1);
	}

}
