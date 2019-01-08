
package com.vtalent.vijay.oops;

 class Outer 
 {
	 private int i;
void m1(int i)
{
	this.i=i+i;
	System.out.println(this.i);
	
}
class Inner
{
	
	 public void m2(float f)
	{
		//this.i=(int)f+this.i;
		
		
		
	}
}
public static void main(String[] args)
{
	 
 Outer o =new Outer();
o.m1(5);

Outer.Inner oi=o.new Inner();
oi.m2(2.5f);

}
}