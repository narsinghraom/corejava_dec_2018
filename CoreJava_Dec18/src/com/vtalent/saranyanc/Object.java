package com.vtalent.saranyanc;

public class Object {
	static Object oe=new  Object();
	static Object oe1=new  Object();
	
	  int k;
	 int j;
	 public   void function(){
		 Object.oe.k=2;
	Object.oe.j=5;
	Object.oe1.k=2;
	Object.oe1.j=5;
	
	}
public static void main (String[] args){
		 Object oe2=new Object();
		 oe2. function();
	 System.out.println(Object. oe.k);
		System.out.println(Object.oe.j);
		 System.out.println(Object.oe1.k);
			System.out.println(Object.oe1.j);		
	}

}
