package com.vtalent.omprakash;

public class ThreadExample extends Thread {
	public void run(){
		System.out.println("this is a run  method called by the start method" );
		for(int i=0;i<=5;i++) {
			System.out.println(Thread.currentThread());
		System.out.println("Value of i= "+i);
		}
		try {
			sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
	}	
		public static void main(String[] args) {
			ThreadExample t1=new ThreadExample();
			t1.run();
			t1.setName("thread One");
			t1.setPriority(MAX_PRIORITY);
			
					
			ThreadExample t2=new ThreadExample();
			t2.run();
			t2.setName("thread Two");
			t2.setPriority(MIN_PRIORITY);
			
		}
	

}
