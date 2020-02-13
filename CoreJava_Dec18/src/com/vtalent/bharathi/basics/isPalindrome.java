package tasks;

import java.util.Scanner;

public class isPalindrome {
	
	static boolean isPalindro(String str) {
		int i=0;int j = str.length()-1;
		while(i<j) {
			if(str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
			
		}return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		if(isPalindro(s)) {
			System.out.println("yes");
			
		}else {System.out.println("no");}
	}
	

}
