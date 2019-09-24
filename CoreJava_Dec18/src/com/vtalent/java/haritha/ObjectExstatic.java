package com.vtalent.java.haritha;

public class ObjectExstatic {
	int i;
	static ObjectExstatic oe=new ObjectExstatic();
	public void function(int i) {
		oe.i=i+this.i;
	}
 public static void main(String[] args) {
	 ObjectExstatic oe1=new ObjectExstatic();
	 oe1.function(5);
	 System.out.println(oe1.i);
 }
}
	