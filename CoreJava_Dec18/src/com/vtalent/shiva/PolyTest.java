package com.vtalent.shiva;

public class PolyTest {
public static void main(String[] args) {
	Polymorphism3 p3=new Polymorphism3();
	int k=p3.function(5);
	k=p3.function(k, k);
	System.out.println(k);
	System.out.println(p3.x+p3.y);
	Polymorphism2 p2=new Polymorphism3();
	k=p2.function(k);
	k=p2.function(k, k);
	System.out.println(k);
	System.out.println(p2.x+p2.y);
	Polymorphism1 p1=new Polymorphism3();
	k=p1.function(k);
	//k=p1.function(k,k);//
	System.out.println(k);
	System.out.println(p1.x+p1.y);
	
}
}
