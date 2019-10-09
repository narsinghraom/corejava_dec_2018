package com.vtalent.java.srikarreddy;

public class Exceptions {
	int k;
	int[] arr=new int[2];
	String st;
	public void function() {
		try { 
		k=1/k;
		arr[2]=5;
		 char ch=st.charAt(0);
		}
	 
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
	}
	catch(NullPointerException e) {
		System.out.println(e); 
	}
	catch(Exception c) {
		System.out.println( c);
	}
		//finally{} 
	}
	public static void main(String[] args) {
		Exceptions c=new  Exceptions();
		c.function();
	}
	

}
