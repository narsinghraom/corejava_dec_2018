package com.vtalent.rakesh;

public class Threads extends Thread implements Runnable {
	static Threads t;

	public Threads(int i) {
		System.out.println("hi");
	}

	public Threads() {

	}

	public void doo() {
		int x = 10;
		System.out.println(x);
	}

	public void run() {
		System.out.println("thread is running...");
		int x = 10, y = 12, z = x + y;

		System.out.println(z);
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String args[]) {
		Threads t1 = new Threads(4);
		t1.setPriority(1);
		t1.start();
		Threads.yield();
		Threads t2 = new Threads();
		try {
			t2.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		t2.start();

		Threads t3 = new Threads();
		t3.setName("rakesh");
		t3.setPriority(MAX_PRIORITY);

		t3.doo();
		Threads t4 = new Threads();
		t4.setPriority(NORM_PRIORITY);
		t4.start();
		ThreadsChild t5 = new ThreadsChild();
		t5.setPriority(MAX_PRIORITY);
		t5.start();
		t3.checkAccess();
		t3.start();
		// t.start();
	}
}
