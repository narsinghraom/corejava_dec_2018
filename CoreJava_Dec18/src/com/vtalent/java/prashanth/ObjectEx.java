package com.vtalent.java.prashanth;

public class ObjectEx {
	int i=0;
	//Object oe=new Object(); this is error here we get stackover flow error
	static ObjectEx oe=new ObjectEx();
	public void function(int i) {
		oe.i=i+this.i;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectEx oe1=new ObjectEx();
		oe1.function(5);
		System.out.println(oe1.i);

	}

}
