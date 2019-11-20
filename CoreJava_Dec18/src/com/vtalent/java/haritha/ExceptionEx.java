package com.vtalent.java.haritha;
import java.lang.*;
public class ExceptionEx {
	int k;
	int[] arr=new int[2];
	String st;
	public void function() {
		try {
			k=1/k;	   			 
		}catch(Exception e) { 
			  System.out.println("please enter or print k value");
			  }
		try {
			arr[2]=5;
			//System.out.println("no exception");
			
		}
		  catch(ArrayIndexOutOfBoundsException a) {
		  System.out.println("set array length first"); 
		  }
		  try {
			  char ch=st.charAt(0);

		  }
		  catch(NullPointerException np) {
		  System.out.println("enter string value first"); }
		 }
	public static void main(String[] args) {
		ExceptionEx e=new ExceptionEx();
		e.function();
		
	}

}