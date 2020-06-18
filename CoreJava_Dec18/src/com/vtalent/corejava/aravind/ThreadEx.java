package com.vtalent.corejava.aravind;

import com.vtalent.narsingh.threads.ThreadExample;

public class ThreadEx extends Thread {
	public void run() {
		System.out.println("run method is calling by start method");
		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread());
			System.out.println("Value of i = " + i);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		ThreadExample t1 = new ThreadExample();
		t1.setName("ThreadOne");
		t1.setPriority(MAX_PRIORITY);
		t1.start();
		ThreadExample t2 = new ThreadExample();
		t2.setName("ThreadTwo");
		t2.setPriority(MIN_PRIORITY);
		t2.start();

	}

}