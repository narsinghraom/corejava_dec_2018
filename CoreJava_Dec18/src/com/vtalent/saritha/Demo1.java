package com.vtalent.saritha;

public class Demo1 {
int i,j;
static float f1,f2;
public void functionOne(){
	i=5;
	j=7;
}
public static int functionTwo(float f1){
	Demo1.f1=f1+Demo1.f1;
	f2=Demo1.f1+f1;
	return (int)f1;
}
public static void main(String []args){
	Demo1 demo=new Demo1();
	demo.functionOne();
	int k=functionTwo((float)demo.i);
	System.out.println(k);
	System.out.println(demo.i+demo.j);
	System.out.println(f1+f2);
	
	
}
}
