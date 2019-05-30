package com.vtalent.naresh;


interface Abc{
//	int i; // Compile time error.
	public static final float pi=3.14f;
		int k=0;
		
		
		/*public void function(int x, int y) {
		
		}*/
		
//interface can same as abstract, it only accepts abstract methods with/without abstract keyword.	
		public  void function(int x, int y);
		 public abstract void function(int x);
		
				
		}
//interface Doesn't allow you to implement abstract methods it only allows you to specify functionality.  +99
/*
 * interface D254 extends Abc{ public void function(int x,int y) {
 * 
 * } }
 */
//class D123 implements Abc{ }

abstract class Bbc implements Abc{
	
}

class Abc1 extends Bbc{
	 public void function(int a, int b) {
		System.out.println(a+b);
	}
	public void function(int x) {
		System.out.println(x);
		
			
	 	}
	}




public class Interface1 {
	public static void main(String[] args) {
			Abc1 a1 =new Abc1();
			  a1.function(5);
			  a1.function(10, 5);
	}

}
