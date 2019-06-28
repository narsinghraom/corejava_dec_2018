package com.vtalent.bhavani;

public class add {
public static int add(int q,int w){
	int e=q+w;
	int a=0;
	System.out.println(e);
	return add(4);
	
}
public static int add(int a){
	System.out.println(a);
	return a;
	
}
public static void main(String[] args) {
	int c=add(2,6);
	System.out.println(c);
}
}
