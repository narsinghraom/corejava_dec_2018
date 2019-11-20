package com.vtalent.java.venkatesh;

public class ExceptionEx {
int k;
int[] arr= new int[2];
String st;
public void function() {
	try{
		k=1/k;
		arr[2]=5;
		char ch=st.charAt(0);
}
	catch(ArrayIndexOutOfBoundsException ee) {
		System.out.println(ee);
	}
	catch(NullPointerException nl) {
		System.out.println(nl);
	}
	catch(Exception e) {
	System.out.println(e);
	}
//	finally {}
}
public static void main(String[] args) {
	ExceptionEx  c=new ExceptionEx();
	c.function();
}
}

