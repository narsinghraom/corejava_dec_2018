package com.vtalent.corejava.sunild;


public class Demo2 {
int x,y;
static float f1,f2;
public void function(int x,int y){
	this.x=x+y;
	this.y=x+y;
}
public static void function(float f1){
	Demo2.f1=f1+f2;
	}
public static void main(String[] args){
	Demo2 d1= new Demo2();
	d1.function(2,3);
	function(1.5f);
	System.out.println(d1.x+d1.y);
	System.out.println(f1+f2);
	
}
}