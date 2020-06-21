package com.vtalent.srinu.thread;


public class RunnableExp implements Runnable{

	public static void main(String[] args) {

		RunnableExp r1 = new RunnableExp();
		Thread t1 = new Thread(r1);
		t1.start();
	}

	public void run() {
		System.out.println("This is run method");
		
	}

}
