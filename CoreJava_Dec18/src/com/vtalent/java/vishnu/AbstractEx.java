package com.vtalent.java.vishnu;

 abstract class Calculation{
	public int add(int x, int y){
	 return x+y;
	}
 
	public int sub(int x,int y){
	 return x-y;
	}
	public int mul(int x,int y){
	 return x*y;
	}
	public abstract int div(int x, int y);
}
  class Calone extends Calculation{
	 public int div(int x, int y){
		 return x/y;
	 }
 }
	
	

public class AbstractEx {
	public static void main(String[] args) {
	Calone co=new Calone();
	System.out.println(co.add(5,6));
	System.out.println(co.sub(6,5));
	System.out.println(co.mul(5,6));
	System.out.println(co.div(500,5));
	
}
}
