package com.vtalent.saranyanc;

public class Object {
	Object oe =new  Object();
	int k;
	public void function(){
		System.out.println(k);
	}
	public static void main (String[] args){
		Object oe1=new Object();
		oe1.k=10;
		oe1.function();
		oe1.oe.k=10;
		System.out.println(oe1.oe.k);
		
		
		
	}

}
