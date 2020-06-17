package com.vtalent.corejava.suma.thread;


public class ThreadExample extends Thread{


	public void run() {
		System.out.println("this is an run method called by start method");
		for(int i=0;i<=5;i++) {
			System.out.println(Thread.currentThread());
			System.out.println("Value of i = "+i);
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ThreadExample t1 = new ThreadExample();
		t1.setName("Thread1");
		t1.setPriority(MAX_PRIORITY);
		t1.start();
		ThreadExample t2 = new ThreadExample();
		t2.setName("Thread2");
		t2.setPriority(MIN_PRIORITY);
		t2.start();

	}

}

