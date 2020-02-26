package com.vtalent.corejava.avinash;

public class ConstructorEx3 {
int a,b;
ConstructorEx3()
{
	a=10;
	b=30;
}
ConstructorEx3(int x,int y)
{
	a=x;
	b=y;
}
public static void main(String[]args)
{
	ConstructorEx3 avi=new ConstructorEx3();
	System.out.println(avi.a+"\n"+avi.b);
	ConstructorEx3 gav=new ConstructorEx3(4,4);
	System.out.println(gav.a+"\n"+gav.b);
}
}
