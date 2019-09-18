package com.vtalent.java.vishnu;

class SampleOne {

	float f1,f2;
	public void function(float f1)
	{
		this.f1=f1+f2;
		System.out.println(f1);
		
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


public class Sampleinheritance {
	public static void main(String[]args){
		SampleThree st5=new SampleThree();//1
		
		
		/*st.function(25, 1.5f);
		st.function((int)st.l);
		st.function(5);
		st.function(st.f1);
		st.function(st.f1,st.f2);*/
		st5.function(25, 1.5f);
		//st1.function((int)st.l);
		st5.function(5);
		st5.function(st5.f1);
		st5.function(st5.f1,st5.f1);
		System.out.println(st5.l);
		System.out.println(st5.i);
		/*st1.function(st.f1);
		st1.function(st.f1,st.f2);
		System.out.println(st.l);
		System.out.println(st.f1);
		System.out.println(st.f2);
		System.out.println(st.i);*/
		System.out.println("==================");
		System.out.println(st5.f1);
		System.out.println(st5.f2);
		
		
		}
		
	}


