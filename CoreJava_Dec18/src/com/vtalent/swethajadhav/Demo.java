package com.vtalent.swethajadhav;

public class Demo {
 int a,b;
 public void functionOne(int a, int b){
	 this.a = a + b ;
	 this.b = a * b;
	 
	 }
 public static void main(String[] args) {
	Demo d = new Demo();
	d.functionOne(4,6);
	System.out.println(d.a + d.b);
}
}
