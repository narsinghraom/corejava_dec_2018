package com.vtalent.java.prashanth;

public class Demo5 {

	int x,y;//object level
	static float f1,f2;//context level 0.0,.0.0
	public int function(int x,int y) {
		this.x=this.x+x;
		this.y=this.y*y;
		return this.x+this.y;
	}
	public static float function(float f1) {
		Demo5 d=new Demo5();//object creation
		f1=f1+d.function(2,3);
		d.f2=f1;
		return f1;
	}
	public static void main(String[] args) {
		Demo5 d1=new Demo5();
		d1.f1=d1.function(1.5f);//1.5f
		System.out.println(f1+f2);//
		System.out.println(d1.x+d1.y);
		

	}

}
