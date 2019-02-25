package com.vtalent.ashwanth;
import java.util.*;

public class Swap {
public static void main(String[] args) {
Scanner s =new Scanner(System.in);
System.out.println("enter x:");
	int x=s.nextInt();
	System.out.println("enter y :");
	int y=s.nextInt();
	System.out.println("after swap :");
	x=x+y;//10+20=30
	y=x-y;//30-20=10
	x=x-y;
	System.out.println("x:"+x+" Y:"+y);
	
	
}
}
