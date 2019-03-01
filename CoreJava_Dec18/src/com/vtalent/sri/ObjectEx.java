package com.vtalent.sri;

public class ObjectEx1 {
	static ObjectEx1 oe=new ObjectEx1();
	int k;
	public void function(){
		System.out.println(k);
	}
	public static void main(String [] args){
		ObjectEx1 oe1=new ObjectEx1();
		oe1.k=10;
		oe1.function();
	System.out.println(oe1.k);

	}

}
