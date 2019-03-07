package com.vtalent.ram;
class First
{
	int i,j;
	public void function(int i){
		this.i=i*i;
		this.j=this.i+i;
	}
}
class Second extends First
{
	int i;
	double d1;
	public void function(int i,double d1)
	{
		this.i=i*i;
		super.i=super.i+1;
		this.d1=d1;
		j=j+i;
	}
}
public class inherit {
public static void main(String[] args) {
	Second s1=new Second();
		s1.function(2);
	s1.function(3,2.5);
	System.out.println(s1.j);
	System.out.println(s1.d1);
}
}
