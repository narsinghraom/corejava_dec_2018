package com.vtalent.swamy;
class SampleOne {

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
public class InheritanceEx {
	
		public static void main(String[]args){
		SampleThree st1=new SampleThree();//1
		
		
		st1.function(25, 1.5f);
		st1.function((int)st1.l);
		st1.function(5);
		st1.function(st1.f1);
		st1.function(st1.f1,st1.f2);
		//st5.function(25, 1.5f);
		st1.function((int)st1.l);
		/*st5.function(5);
		st5.function(st5.f1);
		st5.function(st5.f1,st5.f1);
		System.out.println(st5.l);
		System.out.println(st5.i);*/
		st1.function(st1.f1);
		st1.function(st1.f1,st1.f2);
		System.out.println(st1.l);
		System.out.println(st1.f1);
		System.out.println(st1.f2);
		System.out.println(st1.i);
		/*System.out.println("==================");
		System.out.println(st5.f1);
		System.out.println(st5.f2);
		*/
		
		}
		
	}




