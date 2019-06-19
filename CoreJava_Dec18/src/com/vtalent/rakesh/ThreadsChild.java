package com.vtalent.rakesh;

public class ThreadsChild extends Threads {
	public void run() {
		System.out.println("child");
		String s = Thread.currentThread().getName();
		System.out.println(s);
		Thread.currentThread().setName("r");
		System.out.println(Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		ThreadsChild t1 = new ThreadsChild();
		t1.setPriority(MIN_PRIORITY);

		t1.start();

	}
}
