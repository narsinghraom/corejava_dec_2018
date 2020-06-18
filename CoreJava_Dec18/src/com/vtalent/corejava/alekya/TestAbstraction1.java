package com.vtalent.corejava.alekya;

abstract class Shape{  
abstract void draw();  
}  
//In real scenario, implementation is provided by others i.e. unknown by end user  
class Rect extends Shape{  
void draw(){System.out.println("drawing rectangle");}  
}  
class Circle1 extends Shape{  
void draw(){System.out.println("drawing circle");}  
}  
//In real scenario, method is called by programmer or user  
class TestAbstraction1{  
public static void main(String args[]){  
Shape s=new Circle1();
Shape s1=new Rect();
//invalid Circle1 s2=new Rect();
//invalid Rect s12=new Circle1();
//valid Circle1 s12=new Circle1();
//valid Rect s2=new Rect();
s.draw();
s1.draw();


}  
}  
