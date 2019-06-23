package com.vtalent.naresh;

public class ThreadExample1 extends Thread  {
	public void run() {
		String[] s1= {"Oliver","Barry","Hanna","Cisco","Harrison_Wells","Kara"};
			for(String s2:s1) {
				System.out.println(s2);
				System.out.println(Thread.currentThread()+s2 );
			}
	}
	public static void main(String[] args) {
			ThreadExample1 te =new ThreadExample1();
				te.setName("DC Heros");
					System.out.println("Stating the thread...");
					te.start();
						System.out.println("Thread Started..... ");
						System.out.println("Thread Started and running..... ");	
	}

}
