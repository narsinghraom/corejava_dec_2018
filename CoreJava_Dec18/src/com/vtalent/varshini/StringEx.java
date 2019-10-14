package com.vtalent.varshini;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s1=new String("Abc");
     String s2="Abc";
     String s3="Abc";
     if(s1.equals(s2))
     {
    	 System.out.println("true");
     }
     else {
     System.out.println("false");
	}
     if(s2==s3) {
    	 System.out.println("true");
     }
     else {
    	 System.out.println("false");
     }
     if(s1==s3) {
    	 System.out.println("true");
    	 
     }
     else {
    	 System.out.println("false");
     }

}
}
