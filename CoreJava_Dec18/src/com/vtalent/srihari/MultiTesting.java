
package com.vtalent.srihari;

public class MultiTesting {
	public static void main(String[] args) {

		OverThreadd t = new OverThreadd();
		Thread.currentThread().setPriority(7);
		OverThread1 t1 = new OverThread1();
		t.start();
		t1.start();
	}

}

class OverThreadd extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0)
				System.out.println("thread1--" + i);
		}

	}
}

class OverThread1 extends Thread {
	public void run() {
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 1)

				System.out.println("thread2--" + i);
		}
	}
}