package com.vtalent.amreen;

public class Threads1 implements Runnable {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}

	}

	public static void main(String[] args) {
		Threads1 t = new Threads1();

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		t1.start();
		t2.start();

	}

}
