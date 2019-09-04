package com.vtalent.java.naveen;
 class Demo{
	int i,j;
	public void function(int i) {
		this.i=this.i*i;
		j=this.i;
	}
}
 class Demo2 extends Demo{
	 int j;
	public void function(int i,int j) {
		this.j=this.j+j;
		this.i=this.i+i;
	}
 }
public class Inheritance1 {

	public static void main(String[] args) {
		Demo d1=new Demo();
		d1.function(5);
		System.out.println(d1.i+d1.j);
		Demo2 d2=new Demo2();
		d2.function(3);
		d2.function(5, 4);
System.out.println(d2.i+d2.j);
	}

}
