package com.vtalent.java.prashanth;

public class Excep1 {
	//Excep1 e3=new Excep1();
	
	static Excep1 e2;
	public static void main(String[] args) throws ArithmeticException {
     Excep1 e1=new Excep1();
    // System.out.println(e3);
		System.out.println(e1);
		System.out.println(e2);
	
		try {
		int data=50/0; //may throw exception 
		}
        
		catch(Exception e){	
			//System.out.println(e);
	
		System.out.println("rest of the code");
		}
	}

}
