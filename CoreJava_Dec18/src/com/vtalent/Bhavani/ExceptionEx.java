package com.vtalent.Bhavani;

public class ExceptionEx {
int[] array=new int[4];
String str;
public void function(){
	try {
		int i=1/array[0];
		char ch=str.charAt(0);
		array[4]=7;
	}
	//catch(ArithmeticException x)
	//{
		//System.out.println("Array values are not initilized");
	//}
	//catch(NullPointerException np){
		//System.out.println("please define string");
	//}
	catch(Exception e){
		System.out.println(e);
	}
}
public static void main(String[] args) {
	ExceptionEx ee=new ExceptionEx();
	ee.function();
}
}
