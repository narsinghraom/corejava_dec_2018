package com.vtalent.shiva;


import java.lang.*;
import java.nio.file.FileSystemException;
public class Exception {
	public static void main(String[] args) {
		
	try {
		int i=20,j=0,k;
		k=i/j;
		k=20/0;
		System.out.println(k);
	}
	catch(ArithmeticException a) {
		System.out.println(a);
		
	}
		System.out.println("you can not divide by zero");
   }
}
	
