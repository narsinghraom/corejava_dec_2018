package com.vtalent.mamathasri1;

public abstract class Shape {
abstract void draw();  
}  
 
class Rectangle extends Shape{  
void draw(){System.out.println("drawing rectangle");}  
}  
class Circle1 extends Shape{  
void draw(){System.out.println("drawing circle");}  

	public static void main(String args[]){  
		Shape s=new Circle1();//In a real scenario, object is provided through method, e.g., getShape() method  
		s.draw();  
		}  
		}  
