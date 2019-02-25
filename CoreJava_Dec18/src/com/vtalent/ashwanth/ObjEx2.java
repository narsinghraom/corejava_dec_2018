package com.vtalent.ashwanth;

public class ObjEx2 {
static ObjEx2 oe=new ObjEx2();
int k;
public void function()
{
	System.out.println("non static func :"+k);
}
public static void main(String[] args) {
	ObjEx2 oe1=new ObjEx2();
	oe1.k=10;
	oe1.function();
	ObjEx2.oe.k=10;
	oe1.oe.k=10;
	System.out.println(oe1.oe.k);
}
}
