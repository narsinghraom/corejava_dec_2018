package com.vtalent.corejava.alekya;
abstract class Bike1{  
	   Bike1(){System.out.println("bike is created");}  
	   abstract void run();  
	   void changeGear(){System.out.println("gear changed");}  
	 }  
	//Creating a Child class which inherits Abstract class  
	 class Honda extends Bike1{  
	 void run(){System.out.println("running safely..");}  
	 }  
	//Creating a Test class which calls abstract and non-abstract methods  
	 class TestAbstraction2{  
	 public static void main(String args[]){  
	  Bike1 obj = new Honda();  
	  obj.run();  
	  obj.changeGear();  
	 }  
	}  
