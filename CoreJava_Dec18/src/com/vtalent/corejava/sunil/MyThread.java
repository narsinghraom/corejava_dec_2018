package com.vtalent.corejava.sunil;

public class MyThread extends Thread {
	
	  public void run() {  
		  System.out.println("a");
		  System.out.println("b");
	  System.out.println("c");
	  System.out.println("d"); 
	  System.out.println("e"); 
	  }
	  
	 

 class MyThread1 extends Thread{ 
	public void run() {
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		System.out.println("D");
		System.out.println("E");
	}
	}

	public static void main(String[] args) {
		
		  MyThread mt=new MyThread();
		  MyThread mt1=new MyThread();
		 
		MyThread mth1 = new MyThread();
		MyThread mth2 = new MyThread();
		
		  mt.start(); 
		  mt1.start();
		 
		mth1.start();
		mth2.start();

		System.out.println("main thread is completed");

	}
}
