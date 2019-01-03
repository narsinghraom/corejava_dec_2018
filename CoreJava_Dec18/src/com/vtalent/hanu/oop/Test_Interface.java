package com.vtalent.hanu.oop;

public class Test_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABCImpl i1= new ABCImpl();
		System.out.println(i1.function(5));
		System.out.println(i1.function(2,10));
		i1.dispaly();
		
		ABC ab= new ABCImpl();
		System.out.println(ab.function(5));
		System.out.println(ab.function(10,10));
		//ab.display();
	}

}
