package com.vtalent.omprakash;

public class RunnableExample implements Runnable{
	public static void main(String [] args) {
	RunnableExample r1=new RunnableExample();
	Thread t1=new Thread(r1);
	t1.start();
	}
    public void run() {
	System.out.println("this is run method");
   }
	
}