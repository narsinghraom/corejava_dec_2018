package com.vtalent.suma3;

public class Switch {
	
	/* switch case */

	public static void main(String args[]) {
		int n=4; // afr T condition remaining also values also print to avoid this will use break stmt
		
		switch(n) 
		
		   {
						case 1: 
							    System.out.println("One");
								break;
						case 2: 
							    System.out.println("Two");
						        break;
						case 3: 
							    System.out.println("Three");
						        break;
						case 4: 
							    System.out.println("Four");
						        break;
						case 5: 
							    System.out.println("Five");
						        break;
						default: 
							     System.out.println(" Nothing will print");  
						         break;
		   }
		
	}

}

//note : can we use string in switch yes we cn use 1.7 below 1.7 versions not support 
