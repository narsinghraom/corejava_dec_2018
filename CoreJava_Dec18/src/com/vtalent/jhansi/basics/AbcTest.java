package com.vtalent.jhansi.basics;

public class AbcTest {
	public static void main(String[] args) {
		/*
		 * AbcImpl abc=new AbcImpl(); abc.k=5; abc.function(abc.k);
		 * abc.function(abc.k,abc.k); abc.function();
		 */	
		Abc1 abc=new AbcImpl();
		//abc.k=5;
		abc.function(2);
		abc.function(2, 3);
		
		

	}


}
