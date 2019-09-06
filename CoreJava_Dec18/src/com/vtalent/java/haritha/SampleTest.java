package com.vtalent.java.haritha;


class SampleOne{

	float f1,f2;
	public void function(float f1)
	{
		this.f1=f1+f2;
	}
	public void function(float f1,float f2)
	{
		this.f1=this.f1+f1;
		this.f2=this.f2+f2;
	}
}
class SampleTwo extends SampleOne
{
	int i;
	float f1;
	public void function(int i)
	{
		this.i=i+i;
	}
	public void function(float f1)
	{
		this.f1=f1+super.f1;
	}
}
class SampleThree extends SampleTwo
{
	long l;
	float f1;
	public void function(long l,float f1)
	{
		this.l=l;
	}
}
public class SampleTest {

	public static void main(String[] args) {

		SampleThree st5=new SampleThree();
		st5.function(25, 1.5f);
		st5.function(5);
		st5.function(st5.f1);
		st5.function(st5.f1,st5.f1);
		System.out.println(st5.l);
		System.out.println(st5.i);
		System.out.println("==================");
		System.out.println(st5.f1);
		System.out.println(st5.f2);
		

	}

}
