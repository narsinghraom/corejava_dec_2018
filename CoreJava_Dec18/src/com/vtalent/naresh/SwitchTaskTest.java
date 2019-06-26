package com.vtalent.naresh;

import java.util.Scanner;

public class SwitchTaskTest {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		while(true) {
		System.out.println("Select an Option"+'\n'+"1.Prime Number"+'\n'+"2.Factorial"+'\n'+"3.Fibonacci Series"+'\n'+"4.Find Minium and Max Number for the Given Array{3,7,10,0,1}."+'\n'+"5.Find Above Array and Perform Merge Sort and Insertion Sort Techniques"+'\n'+"6.Exit");
		int p=sc.nextInt();
		SwitchTask st=new SwitchTask();
		switch(p){
		case 1:
			st.prime();	        
		break;	
			
		case 2:
			st.fact();
			break;
			
		case 3:
			st.fib();
			break;
			
		case 4:
			st.minmax();
			break;
			
		case 5:
			System.out.println("Choose the Type of Sort"+'\n'+"1.Insertion Sort"+'\n'+"2.Merge Sort");
			int x=sc.nextInt();
			if(x==1) {
				System.out.println("Enter the size of an array");
				int b=sc.nextInt();
				int[] a= new int[b];
				System.out.println("Enter the array values onr by one");
				for(int i=0;i<=a.length-1;i++) {
					a[i]=sc.nextInt();
				}
				st.insert(a);
			}
			else {
				
			}
			break;
			
		case 6:
			System.exit(0);
		
		default :
			System.out.println("Enter Valid Number");

		}
		
		
	}
		}

}
