package com.vtalent.saichand;

public class Thread2 extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(Thread.currentThread() + "" + i);
		}
	}

	public static void main(String args[]) {

		Thread2 te = new Thread2();
		te.start();
		Thread2 te1 = new Thread2();
		te1.start();
		te1.setName("sai chand");
	}
}
