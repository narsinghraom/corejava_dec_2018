package com.vtalent.sathyam.basics;

public class Swaping {
	public static void main(String[] args) {
        int a=5, b=10;
        System.out.println("--Before swap--");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        int temporary = a;
        a=b;
      b = temporary;
        System.out.println("--After swap--");
        System.out.println("a = "+ a);
        System.out.println("b = " +b);
    }
}






