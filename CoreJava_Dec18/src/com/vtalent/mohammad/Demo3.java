package com.vtalent.mohammad;

public class Demo3 {
	int x,y;
	static float f1,f2;
	public int function(int x,int y) {
		this.x=this.x+x;
		this.y=this.y*y;
		return this.x+this.y;
		}
	public static float function(float f1) {
		Demo3 d2=new Demo3();
		f1=f1+d2.function(2,3);
		f2=f1;
		return f2;
	}
	public static void main(String[] args) {
		Demo3 d1=new Demo3();
		f1=function(1.5f);
		System.out.println(f1+f2);
		System.out.println(d1.x+d1.y);
		System.out.println(f1);
		System.out.println(f2);
	}

}