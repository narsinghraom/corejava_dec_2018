package com.vtalent.corejava.alekya;

interface Drawable1{
	void draw();
	
}
class Rectangle1 implements Drawable1{
	public void draw(){
	System.out.println("draw a rectangle");
	}
	
}
class Circle2 implements Drawable1{
	public void draw(){
	System.out.println("draw a circle");
	}
	
}
public class Interface1 {
	 public static void main(String args[]) {
		 Drawable1 d=new Circle2();
		 Drawable1 d1=new Rectangle1();
		 // we cannot instantiate this becoz Drawable is interface Rectangle1 d2=new Drawable1();
		 
		 d.draw();
		 d1.draw();
		 
	 }
}

