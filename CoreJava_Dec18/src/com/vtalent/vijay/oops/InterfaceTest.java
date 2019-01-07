package com.vtalent.vijay.oops;

public class InterfaceTest {
	

		public static void main(String[] args) {
			AbcImpl abc=new AbcImpl();
			System.out.println(abc.function(2));
			System.out.println(abc.function(2,5));
			abc.display();
			
			
	Abc abc1=new AbcImpl(); 
	System.out.println(abc1.function(2));
	System.out.println(abc1.function(2,5));
	//abc1.display();
		}

	}



