package com.vtalent.java.prashanth;

public class Excep2 {

	public static void main(String[] args) {
		
		
			try {
			int data=50/0; //may throw exception 
			
		
			}
			catch(Exception e1){	
			int data=50/2;
				System.out.println(data);
				System.out.println(e1);
		
			}
			finally{
				System.out.println("Finally block is executed ");
			}
			System.out.println("rest of the code");
		}


}
