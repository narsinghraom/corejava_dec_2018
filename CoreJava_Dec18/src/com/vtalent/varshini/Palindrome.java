package com.vtalent.varshini;


public class Palindrome {
	 
	   public static void main(String args[])  
	   {  
		 int r,temp,sum=0;
		 int n=454;
		 temp=n;
		 while(n>0) {
			 r=n%10;
			 sum=(sum*10)+r;
			 n=n/10;
		 }
	   
	   if(temp==sum)
	   {
		   System.out.println("palind rome");
	   } 
	   else {
		   System.out.println("not palind ");
	   }
}

		   
		   
		   
		   
		   
		   
		   
		/*
		 * String original, reverse = ""; Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter a string/number to check if it is a palindrome");
		 * original = sc.nextLine(); int length = original.length(); for ( int i =
		 * length - 1; i >= 0; i-- ) reverse = reverse + original.charAt(i); if
		 * (original.equals(reverse))
		 * System.out.println("Entered string/number is a palindrome."); else
		 * System.out.println("Entered string/number isn't a palindrome.");
		 */	    
	}  

