package com.vtalent.sanjana;
interface Xyz1
{
	public void fun();
	public void fun(int x);
}
interface Example1
{
	public int fun(float f1);
	public float fun(int x,int y);
}
class ExampleImpl implements Example1
{
	float f1;
	int y=0;
	public int fun(float f1)
	{
		this.f1=this.f1+f1;
		return (int)(this.f1);
	}
	public float fun(int x,int y)
	{
		this.y=this.y+y;
		f1=f1+x;
		return (float)(x+y);
	}
}
class Example2 extends ExampleImpl implements Xyz1
{
	int x=2;
	public float fun(int x,int y)
	{

		this.x=this.x+x;
		this.y=this.x+y;
		return (float)(this.x+this.y);
	}
	public void fun()
	{
		System.out.println(x+y);
	}
	public void fun(int x)
	{
		System.out.println(x*y);
	}
}

public class Example {

	public static void main(String[] args) {

ExampleImpl e1=new ExampleImpl();
int k=e1.fun(e1.fun(2,3));
System.out.println(k);
System.out.println(e1.y);
	}

}
