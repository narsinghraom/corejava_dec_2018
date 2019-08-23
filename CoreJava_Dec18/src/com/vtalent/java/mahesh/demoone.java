package com.vtalent.java.mahesh;

public class demoone {
	int x,y;
	static float f1,f2;
public void function(int x,int y){
	this.x=this.x+x;
	this.y=this.y*y;
}
public static void function(float f1){
demoone.f1=f1+f2;
}
public static void main(String args[]){
	demoone d1=new demoone();
	d1.function(2,3);
	function(1.5f);
System.out.println(d1.x+d1.y);
System.out.println(f1+f2);
}
}