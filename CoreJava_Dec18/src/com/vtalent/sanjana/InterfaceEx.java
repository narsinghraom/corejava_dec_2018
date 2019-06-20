package com.vtalent.sanjana;

public class InterfaceEx {

	public static void main(String[] args) {
	
Abcd abc1=new MnrImpl();
abc1.fun(2);
abc1.fun(2,3);
Mnr mnr1=new MnrImpl();
mnr1.fun(2);
mnr1.fun(2,3);
	}}
interface Xyz
{
	public void fun();
	public void fun(int x);
}
interface Abcd
{
	public void fun(int x);
	public void fun(int x,int y);
	
}
interface Mnr extends Abcd,Xyz
{
	
}
class AbcImpl implements Abcd
{
	int x;
	int y;
	public void fun(int x)
	{
		this.x=this.x+x;
	}
	public void fun(int x,int y)
	{
		this.x=this.x+x;
		this.y=this.y+y;
	}
}
class MnrImpl extends AbcImpl implements Mnr
{
	public void fun() {
		System.out.println(x+y);
	}
}

