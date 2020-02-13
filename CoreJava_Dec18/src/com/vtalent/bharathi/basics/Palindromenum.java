package tasks;

import java.util.Scanner;

public class Palindromenum {
	
	static int oneDigit(int num) {
		
		if(num>0 && num<10) {
			return 1;
		
	}else {return 0;
	}
	}
	
	static void isPalindrome (int num){
	 int temp = num;
	 int rem;
	 int sum =0;
	 while(num>0) {
	 rem=num%10;
	 sum=sum*10+rem;
	 num = num/10;
	 }
	 if(sum == temp) {
		 System.out.println("yes");
	 }
	 
	 else { System.out.println("no");}
	 }
	 
	 
	 
	 
		
			
		
		
	
	
	public static void main(String[] args) {
		System.out.println("Enter the numberr");
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		//System.out.println(s.le);
		isPalindrome(s) ;
	}

}
