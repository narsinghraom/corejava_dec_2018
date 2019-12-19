package com.vtalent.jhansi.basics;
public class ThisExample11 {
	int x,y;
	ThisExample11()
	{
		this(2);
		x=5;
		y=7;
	}
ThisExample11(int x)
{
	this.x=this.x+x;
	y=y+x;
}
ThisExample11(int x,int y)
{   this();
	this.x=this.x+x;
	this.y=this.y+y;
}
public static void main(String[] args)
{
	/*ThisExample11 t1=new ThisExample11();
	System.out.println(t1.x);
	System.out.println(t1.y);
	ThisExample11 t2=new ThisExample11(5);
	System.out.println(t2.x);
	System.out.println(t2.y);*/
	ThisExample11 t3=new ThisExample11(5,6);
	System.out.println(t3.x);
	System.out.println(t3.y);
	
	
}
}
