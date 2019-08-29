package com.vtalent.vinodreddy;

public class ObjextEx {
int i ;
ObjextEx oe = new ObjextEx(); /* nonstatic */ /* static */
public void function(int i) {

   oe .i =this.i+i;

}

public static void main(String[] args) {
	
	ObjextEx  oe1 =new ObjextEx();
	oe1.function(5);
	System.out.println(oe1.i);
	
} 
}
