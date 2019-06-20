package com.vtalent.saichand;

public class Thread1 implements Runnable {
	public void run() {

		for (int i = 0; i < 5; i++)
			System.out.println(i);
	}

	public static void main(String args[]) {
		Thread1 t1 = new Thread1();
		Thread t = new Thread(t1);
		t.start();
		Thread t2 = new Thread(new Thread1());
		t2.start();
	}
}