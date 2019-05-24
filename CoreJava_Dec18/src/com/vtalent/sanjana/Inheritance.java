package com.vtalent.sanjana;
class Demo5
{
	int x,y;
	public void fun(int x)
	{
		this.x=x+this.x;
		y=x+y;
	
	}
	public void fun(int x,int y)
	{
		this.x=this.x+x;
		this.y=this.y+x;
	}
}
class Demo2 extends Demo5
{
	int x;
	public void fun(int x)
	{
		this.x=this.x+x;
	}
}
class Demo3 extends Demo2
{
	public void fun()
	{
		System.out.println(x);
		System.out.println(y);
	}
	public void fun(int x,int y)
	{
		this.x=this.x+x;
		this.y=this.y+y;
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Demo5 demo1=new Demo3();
demo1.fun(2);
demo1.fun(5,2);
Demo2 demo2=new Demo3();
demo2.fun(3);
demo2.fun(3,2);
Demo3 demo3=new Demo3();
demo3.fun(3);
demo3.fun(4,3);
demo3.fun();
System.out.println(demo1.x+demo1.y);
System.out.println(demo2.x+demo2.y);
System.out.println(demo3.x+demo3.y);
	}

}
