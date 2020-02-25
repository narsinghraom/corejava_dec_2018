package com.vtalent.corejava.aravind;

public class FibSeries {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();//starting time for the program	
		int n1=0, n2=1, n3=0, count = 50; //intializing the variables 
		System.out.println(n1+" "+n2);
	
	for(int i=0; i<count; ++i) { //iterating through upto Nth value 
		n3 = n1+n2;						//add corresponding last two values
		System.out.println(" "+n3);
		n1=n2;
		n2=n3;
		
		}
	long end = System.currentTimeMillis();
	long time = end - start;
	System.out.println("Total time is" +" "+ time +" "+"Ms");
	}
	

}
