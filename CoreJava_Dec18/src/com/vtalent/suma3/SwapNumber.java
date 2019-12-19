package com.vtalent.suma3;

public class SwapNumber {
	
	//int a,b;
	//static int a=10;
	//static int b=15;
	
	
public static void main( String [] args) {
	
	int a=10; int b=15;


	System.out.println("--Before Swap--");
	System.out.println( "First Number=" +a);
	System.out.println("Second Number=" +b);
	
	/*logic1 : by using operators + & - 
	a=a-b; // a=10-15= -5
	b=a+b; // b=10+15 = 25
    a=b-a; // b=25-10 =15*/
	
	//logic 2: by using / and *
	
	a=a*b;
	b=a/b;
	a=a/b;
	
	
	System.out.println("--After Swap--");
	System.out.println("First Number=" +a);
	System.out.println("Second Number=" +b);

}
}