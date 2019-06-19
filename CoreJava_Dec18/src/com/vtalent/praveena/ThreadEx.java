package com.vtalent.praveena;

public class ThreadEx{
	

public static void main(String[]args) throws Exception
{
	Thread1 TE1=new Thread1();
	TE1.setName("First Thread");
	//TE1.setPriority(Thread.MAX_PRIORITY);//Priority will be 10
	TE1.start();
	System.out.println(TE1.isAlive());

	try
	{
		Thread.sleep(500);
	}
	catch(Exception e)
	{
		
	}
	TE1.join();
	System.out.println(TE1.isAlive());


	Thread2 TE2=new Thread2();
	TE2.setName("Second Thread");
	//TE2.setPriority(TE1.getPriority()+1);//Priority will be 11
	//TE2.setPriority(Thread.NORM_PRIORITY);
	TE2.start();
	System.out.println(TE2.isAlive());
	try{
		Thread.sleep(500);
	}
	catch(Exception e){
		
	}
	TE2.join();
	System.out.println(TE2.isAlive());


	
	Thread3 R=new Thread3();
	Thread TE3=new Thread(R);
	TE3.setName("Third Thread");
	//TE3.setPriority(Thread.MIN_PRIORITY);//Priority will be 1
	TE3.start();
	System.out.println(TE3.isAlive());


	
}
}
class Thread1 extends Thread
{
	public void run()
	{
		//System.out.println("Created Thread1 by Extending Thread class");

		for(int i=0;i<=5;i++)
		{
			//System.out.println(i);
			System.out.println("hi");
			try{
				Thread.sleep(1000);;
			}
			catch(Exception e){
				
			}
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
				//System.out.println("Created Thread2 by Extending Thread class");

				for(int i=0;i<=5;i++)
				{
					//System.out.println(i);
					
					//System.out.println(Thread.currentThread()+"  "+i);

					System.out.println("Hello");
					try{
						Thread.sleep(1000);;
					}
					catch(Exception e){
						
					}
					
				}
				}
			
		}
class Thread3 implements Runnable
{
	public void run()
	{
		//System.out.println("Created Thread3 by implementing Runnable Interface ");
	for(int i=5;i<=0;i++)
	{
		System.out.println(i);
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			
		}
		//System.out.println(Thread.currentThread()+"  "+i);
		/*if(i==3)
		{
			System.out.println("Active count of the thread3 is"+" "+Thread.activeCount());
		}*/
	}
	}
}
