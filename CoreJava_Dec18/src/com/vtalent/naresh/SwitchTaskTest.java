package com.vtalent.naresh;

import java.util.Scanner;

public class SwitchTaskTest {
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Select an Option"+'\n'+"1.Prime Number"+'\n'+"2.Factorial"+'\n'+"3.Fibonacci Series"+'\n'+"4.Find Minium and Max Number for the Given Array{3,7,10,0,1}."+'\n'+"5.Find Above Array and Perform Merge Sort and Insertion Sort Techniques");
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
				int[] a= {5,13,2,14,7,6};
				st.insert(a);
			}
			else {
				
			}
			break;
		}

	}

}
