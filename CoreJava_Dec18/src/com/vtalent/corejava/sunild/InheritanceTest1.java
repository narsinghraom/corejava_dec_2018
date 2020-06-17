package com.vtalent.corejava.sunild;

 class Demo1{
	 int x,y;
public void functionthree(int x,int y){
this.x=this.x+x;
this.y=this.y+y;
}
}
 class Demoi extends Demo1{
	 static int z;
	 int x;
	 public void functiontwo(int x){
		 this.x=this.x+x+z;
	 }
 }
 class Demo3 extends Demoi{
	 public void functionone(){
		 System.out.println(x);
		 System.out.println(y);
	 }
 }
 public class InheritanceTest1{
	 public static void main(String[] args) {
		Demo1 d=new Demo3();
		d.functionthree(5,2);
		
		Demoi d2=new Demo3();
		d2.functiontwo(3);
		d2.functionthree(3,2);
		
		Demo3 d3=new Demo3();
		d3.functiontwo(3);
		d3.functionthree(3,2);
		d3.functionone();
		
		System.out.println(d.x+" "+d.y);
		System.out.println(d2.x+" "+d2.y);
		System.out.println(d3.x+" "+d3.y);
	}
 }
 