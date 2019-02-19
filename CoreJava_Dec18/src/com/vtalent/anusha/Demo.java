
package com.vtalent.anusha;

public class Demo {
int a,b;
public void function1(int a ,int b)
{
this.a=a+b;
this.b=a*b;
}
public static void main(String[] args) {
	Demo d=new Demo();
	d.function1(2, 5);
	System.out.println(d.a+d.b);
}
}
