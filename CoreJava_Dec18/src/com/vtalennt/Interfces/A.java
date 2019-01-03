package com.vtalennt.Interfces;

public interface A {
	public void sum(int i);
	public void sum(int i,int j);
	

}
 interface B{
	public void mul(int i);
	public void div(int i,int j);
	
}
 interface c extends A,B{
	 
 }
interface d {
	public void sum(int i,int j);
	public void div(int i,int j);
}
class m1 implements A
{

	public void sum(int i) {
		System.out.println("sum:"+(i*i));
	}

	public void sum(int i, int j) {
		System.out.println("sum:"+(i*j));
	}
	public void sub(int i,int j)
	{
		System.out.println("sub:"+(i-j));
	}
	
}
class m2 extends m1 implements A,B
{

	public void mul(int i) {
	System.out.println("mul:"+(i*i));
		
	}

	public void div(int i, int j) {
System.out.println("div:"+(i/j));
		
	}
	
}
class m3 extends m2 implements c
{
	
}
class m4 extends m3 implements d
{
	
}
