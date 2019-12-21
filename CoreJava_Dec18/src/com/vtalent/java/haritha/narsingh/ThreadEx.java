package com.vtalent.java.haritha.narsingh;

public class ThreadEx extends Thread{
	public void run() {
		for(int i =0;i<=10;i++) {
			System.out.println(Thread.currentThread()+"= " +i);
		}
	}
public static void main(String[] args) {
	ThreadEx t1 = new ThreadEx();
	t1.setName("First Thread");
	t1.setPriority(MAX_PRIORITY);
	ThreadEx t2 = new ThreadEx();
	ThreadEx t3 = new ThreadEx();
	t3.setName("Third Thread");
	t3.setPriority(MIN_PRIORITY);
	t1.start();
	t3.start();
	t2.start();
}
}
