package com.vtalent.corejava.alekya;

public class ClassStructure {
	
	int x,y; 
	public ClassStructure() {
	 //default constructor
	 x=10;y=20;
	 } 
	
	public int methodOne()
	 { 
	 return x+y; 
	 } 
	
	public void methodDisplay()
	 { 
	 System.out.println("the adding of x,y value= " +methodOne());
	 } 
	public static void main(String[] args) {
	 
	 ClassStructure objRef=new ClassStructure();
	
	 objRef.methodDisplay();
	 objRef.methodOne();
	 
	 } 
     }

