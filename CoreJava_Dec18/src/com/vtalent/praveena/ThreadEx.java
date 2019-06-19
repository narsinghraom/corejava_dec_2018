package com.vtalent.praveena;

public class ThreadEx{
	

public static void main(String[]args)
{
	Thread1 TE1=new Thread1();
	TE1.setName("First Thread");
	TE1.setPriority(Thread.MAX_PRIORITY);//Priority will be 10
	TE1.start();
	System.out.println("thread1 has started");

	Thread2 TE2=new Thread2();
	TE2.setName("Second Thread");
	//TE2.setPriority(TE1.getPriority()+1);//Priority will be 11
	TE2.setPriority(Thread.NORM_PRIORITY);
	TE2.start();
	System.out.println("thread2 has started");
	
	Thread3 R=new Thread3();
	Thread TE3=new Thread(R);
	TE3.setName("Third Thread");
	TE3.setPriority(Thread.MIN_PRIORITY);//Priority will be 1
	TE3.start();
	System.out.println("thread3 has started");

	
}
}
class Thread1 extends Thread
{
	public void run()
	{
		System.out.println("Created Thread1 by Extending Thread class");

		for(int i=0;i<=5;i++)
		{
			//System.out.println(i);
			System.out.println(Thread.currentThread()+"  "+i);
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
				System.out.println("Created Thread2 by Extending Thread class");

				for(int i=0;i<=5;i++)
				{
					//System.out.println(i);
					
					System.out.println(Thread.currentThread()+"  "+i);

					try{
						Thread.sleep(100);;
					}
					catch(Exception e){
						System.out.println("Exception");
						
					}
					
				}
				}
			
		}
class Thread3 implements Runnable
{
	public void run()
	{
		System.out.println("Created Thread3 by implementing Runnable Interface ");
	for(int i=0;i<=5;i++)
	{
		System.out.println(Thread.currentThread()+"  "+i);
		if(i==3)
		{
			System.out.println("Active count of the thread3 is"+" "+Thread.activeCount());
		}

	}
	}
}
