package com.vtalent.sanjana;

public class Demo {
int i,j;
static float f1,f2;
public void function1()
{
	i=5;
	j=7;
	
}
public static int function2(float f1)
{
	Demo.f1=f1+Demo.f1;
	f2=Demo.f1+f1;
	return(int)f1;
	
}

	public static void main(String[] args) {
Demo demo=new Demo();
demo.function1();
int k=function2((float)demo.i);
System.out.println(k);
System.out.println(demo.i+demo.j);
System.out.println(f1+f2);
	}

}
