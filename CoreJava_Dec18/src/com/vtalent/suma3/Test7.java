package com.vtalent.suma3;

class First3
{
	int x,y;
	public int function(int x) 
	{
		this.x=this.x+x;
		y=y+x;
		return x;
	}
}
class Second3 extends First3
{
	int y;
	public int function(int y)
	{
		this.y=this.y+y;
		x=x+y;
		return y;
	}
	public int function(int x,int y) 
	{
		this.x=this.x+x;
		this.y=this.y+y;
		return x+y;
	}
	}
class Third3 extends Second3
{
	int x;
	public int function(int x,int y) 
	{
		this.x=this.x+x;
		this.y=this.y+y;
		return x+y;
	}
	}
public class Test7{

	public static void main(String[] args) 
	{
		Third3 t1=new Third3();
		int k=t1.function(5);
		k=t1.function(k,k);
		System.out.println(k);
		System.out.println(t1.x+t1.y);
		Second3 s1=new Third3();
		k=s1.function(k);
		k=s1.function(k, k);
		System.out.println(k);
		System.out.println(s1.x+s1.y);
		First3 f1=new  Third3();
		k=f1.function(k);
		//k=f1.function(k,k);
		System.out.println(k);
		System.out.println(f1.x+f1.y);
		
		}

}

