
package com.vtalent.anusha;

public class This {
int a,b;
public void function1(int a ,int b)
{
this.a=a+b;
this.b=a*b;
}
public static void main(String[] args) {
	This d=new This();
	d.function1(2, 5);
	System.out.println(d.a+d.b);
}
}
