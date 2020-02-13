package tasks;

import java.util.Scanner;
import java.util.Arrays;

public class Armstrong {
	public static void main(String[] args) {
		System.out.println("enter num");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		isArmStrong(num);
		
	}

	 static void isArmStrong(int num) {
		// TODO Auto-generated method stub
		 int temp = num;
		int sum =0;
		int rem;
		while(num>0) {
			rem =num%10;
			sum+=(rem*rem*rem);
			num = num/10;
		}
		if(sum == temp) {System.out.println("arm");}
		else {System.out.println("not arm");
			
		}
		
		 
		
	}

}
