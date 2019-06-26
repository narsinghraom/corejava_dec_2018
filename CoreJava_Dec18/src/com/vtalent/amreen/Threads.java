package com.vtalent.amreen;

public class Threads extends Thread {

	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + "" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Threads t = new Threads();

		t.setName("thread 1 - ");

		t.start();
		Threads t1 = new Threads();

		t1.setName("thread 2 - ");
		t1.start();

	}
}
