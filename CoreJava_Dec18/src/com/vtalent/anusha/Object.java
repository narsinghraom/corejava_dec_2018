package com.vtalent.anusha;

public class Object {
static Object ob=new Object();
 int k;
public void function()
{
	System.out.println(k);
}
public static void main(String[] args) {
	Object oe =new Object();
	oe.k=10;
oe.function();
Object.ob.k=10;
	//oe.ob.k=10;
	//System.out.println(oe.ob.k);
System.out.println(Object.ob.k);

}
}

