package com.vtalent.naresh;

/*	abstract class contain abstarct Keyword
		we cannot create object for abstract class cz JVM doesn't 
			provide Default constructor for partially implemented structers(classes(abstract))*/
abstract class Calculator{
	public int add(int x, int y) {
		return x+y;
	}
	
	public int sub(int x, int y) {
		return x-y;
	}
	
	  abstract int mul(int x, int y);
	public abstract int div(int x, int y);
}

/*
 * when we extend abstract class we must implement the all abstract methods
 * present in the extended class(it may be a concrete class(regular class)/ abstract class you use)
 */

//abstract class Calculator1 extends Calculator{

//while implementing abstract methods we must declare public to method 
//  if we declared public at abstract declaration time.	 
	  class Calculator1 extends Calculator{
	   int mul(int x, int y) {
		return x*y;
	}
	
	public  int div(int x, int y) {
		return x/y;
	}
} 

public class Abstract1   {
	public static void main(String[] args) {
		Calculator1 c1= new Calculator1();
			System.out.println("ADD(10,10):  "+c1.add(10, 10));
			System.out.println("Sub(10,10):  "+c1.sub(10, 10));
			System.out.println("Mul(10,10):  "+c1.mul(10, 10));
			System.out.println("Div(10,10):  "+c1.div(10, 10));
			
	}

}



abstract  class D55{} 
abstract class D44{}

//class B145 extends D55,D44  {}

