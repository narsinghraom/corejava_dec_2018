package com.vtalent.praveena;

public class ThreadEx{
	

public static void main(String[]args) throws Exception
{
	Thread1 TE1=new Thread1();
	TE1.setName("First Thread");
	TE1.setPriority(Thread.NORM_PRIORITY);//Priority will be 10
	TE1.start();
	System.out.println(TE1.isAlive());
	try{Thread.sleep(500);}catch(Exception e){	}
	//System.out.println(TE1.isAlive());
	TE1.join();


	Thread2 TE2=new Thread2();
	TE2.setName("Second Thread");
	//TE2.setPriority(TE1.getPriority()+1);//Priority will be 11
	TE2.setPriority(Thread.MIN_PRIORITY);
	TE2.start();
	System.out.println(TE2.isAlive());
	try{Thread.sleep(500);}	catch(Exception e){	}
	//System.out.println(TE2.isAlive());
	TE2.join();
	
	Thread3 R=new Thread3();
	Thread TE3=new Thread(R);
	TE3.setName("Third Thread");
	TE3.setPriority(Thread.MAX_PRIORITY);//Priority will be 1
	TE3.start();
	System.out.println(TE3.isAlive());
	TE3.join();
	System.out.println("Bye");

	
	//TE1.join();
	//TE2.join();
	//TE3.join();
	System.out.println(TE1.isAlive());
	System.out.println(TE2.isAlive());
	System.out.println(TE3.isAlive());
}
}
class Thread1 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("hi");
			try{Thread.sleep(1000);;}catch(Exception e){}
			if(i==4)
			{
				Thread.yield();//Moving thread to runnable state from running state
			}
		}
	}	
}
class Thread2 extends Thread
{
			public void run()
			{
				for(int i=0;i<5;i++)
				{
					//System.out.println(Thread.currentThread()+"  "+i);
					System.out.println("Hello");
					try{Thread.sleep(1000);}catch(Exception e){}
				}
				}
		}
class Thread3 implements Runnable
{
	public void run()
	{
	for(int i=5;i>=0;i--)
	{
		System.out.println(i);
		try{Thread.sleep(1000);}catch(Exception e){	}
		
	}
	}
}
