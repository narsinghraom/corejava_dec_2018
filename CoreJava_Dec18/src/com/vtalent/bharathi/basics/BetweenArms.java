package tasks;

import java.util.Scanner;

public class BetweenArms {
	public static void main(String[] args) {

			System.out.println("enterfrst num");
			Scanner sc = new Scanner(System.in);
			int num1 = sc.nextInt();
			System.out.println("enter the second num");
			int num2 = sc.nextInt();
			int temp;
			System.out.println("arm numbers between "+num1+" "+num2);
			while(num1<num2) {
				temp =isArmStrong(num1);
				if(temp == num1) 
					System.out.println(num1);
					num1++;
				
			}
			
	}
			 static int isArmStrong(int num1) {
					// TODO Auto-generated method stub
					int sum =0;
					int rem;
					while(num1!=0) {
						rem =num1%10;
						sum+=(rem*rem*rem);
						num1 = num1/10;
					}
					return sum;
					
					
				}
	}


