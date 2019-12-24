package com.vtalent.sathish;

public class ThisExample {
int x,y;
ThisExample(){
	this(2);
	x=5;
	y=7;
	
}
ThisExample(int x){
	this.x=this.x+x;
	y=x+y;
}
ThisExample(int x,int y){
	this();
	this.x=this.x+x;
	this.y=this.y+y;
}
 public static void main(String[] args) {
	/*ThisExample t1 =new ThisExample();
	System.out.println(t1.x);
	System.out.println(t1.y);
 
 ThisExample t2 =new ThisExample(5);
	System.out.println(t2.x);
	System.out.println(t2.y); */

	ThisExample t3 =new ThisExample(5,6);
	System.out.println(t3.x);
	System.out.println(t3.y);

	
 }
}
