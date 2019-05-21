package com.vtalent.raju;

public class Maxmin {
	public static void main(String[] args) {
		int R[]= {3,7,10,0,1};
		int max = 0,min=R[0];
		/*
		 * for (int i = 1; i < R.length; i++) { if(max<R[i]) { max=R[i]; }
		 * 
		 * } System.out.println("maximum elemet is" + max);
		 */
		
		  for (int i = 1; i < R.length; i++) { if(min>R[i]) { min=R[i]; }
		  
		  }
		  
		  System.out.println("Minimum elemet is" + max); }
		 }




