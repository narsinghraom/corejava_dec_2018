package com.vtalent.sanjana;

public class Test {
int x,y;
Test()
{
	x=5;
	y=7;
	
}
Test(int x)
{
	this.x=this.x+x;
	y=y+x;
	
}
Test(int x,int y)
{
	this.x=this.x+x;
	this.y=y+y;
	
}
public static void main(String args[])
{
	Test t1=new Test();
	Test t2=new Test(5);
	Test t3=new Test(5,5);
	System.out.println(t1.x+t1.y);
	System.out.println(t2.x+t2.y);
	System.out.println(t3.x+t3.y);

}

}
