package com.vtalent.mamathasri1;


public class Demo2 {
	int x,y;
	static float f1,f2;
	public void function(int x,int y) {
	this.x=this.x+x;
	this.y=this.y+y;
	
	}
	public static void function(float f1) {
		Demo2.f1=f1+f2;
	}

	public static void main(String[] args) {
		
     Demo2 d2=new Demo2();
     d2.function(2, 3);
     function(1.5f);
     System.out.println(d2.x+d2.y);
     System.out.println(f1+f2);
	}


}
