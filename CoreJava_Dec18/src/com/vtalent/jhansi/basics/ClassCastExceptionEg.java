package com.vtalent.jhansi.basics;

class ClassCastExceptionEg1
{

		
}
public class ClassCastExceptionEg extends ClassCastExceptionEg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("ClassCastExceptionEg");// TODO Auto-generated constructor stub
		ClassCastExceptionEg c1=new ClassCastExceptionEg();
		ClassCastExceptionEg1 c2=new ClassCastExceptionEg1();
		try {
			c1=(ClassCastExceptionEg) c2;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
