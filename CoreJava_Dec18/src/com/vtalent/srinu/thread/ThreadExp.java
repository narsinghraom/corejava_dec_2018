package com.vtalent.srinu.thread;

public class ThreadExp extends Thread{


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
		ThreadExp t1 = new ThreadExp();
		t1.setName("Thread1");
		t1.setPriority(MAX_PRIORITY);
		t1.start();
		ThreadExp t2 = new ThreadExp();
		t2.setName("Thread2");
		t2.setPriority(MIN_PRIORITY);
		t2.start();

	}

}

