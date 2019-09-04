package com.vtalent.java.mahesh;

public class ObjectEx1 {
	int i;
	ObjectEx1 oe;
		public ObjectEx1()
		{
		oe=new ObjectEx1();
		}
		public void function(int i)
		{
		this.i=i*i;
		}
		public static void main(String[] args)
		{
		ObjectEx1 oe=new ObjectEx1();
		oe.function(5);
		System.out.println(oe.i);
		}
}
