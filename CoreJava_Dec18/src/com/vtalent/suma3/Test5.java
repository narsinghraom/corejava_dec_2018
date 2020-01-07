package com.vtalent.suma3;

class First1 {

	int i,j;
	public void function(int i)
	{
		this.i=this.i+i;
		j=i*i;
	}

}
class Second2 extends First1 
{

	int i;
	public void function(int i,int j)
	{
		this.i=i+j;
		this.j=i+j+this.j;
	}
}

public class Test5
{
	public static void main(String[] args) 
	{
		First1 f = new First1();
		f.function(5);
		System.out.println(f.i);
		System.out.println(f.j);
		Second2 s = new Second2();
		s.function(3);
		s.function(f.i, f.j);
		System.out.println(s.i);
		System.out.println(s.j);

	}
}