package com.vtalent.saritha;
import java.util.Scanner;
public class SwitchTask{
static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Select an Option"+'\n'+"1.Prime Number"+'\n'+"2.Factorial"+'\n'+"3.Fibonacci Series"+'\n'+"4.Find Minium and Max Number for the Given Array{3,7,10,0,1}."+'\n'+"5.Find Above Array and Perform Merge Sort and Insertion Sort Techniques");
		int p=sc.nextInt();
		SwitchMain sm=new SwitchMain();
		switch(p){
		case 1:
			sm.prime();		        
		break;	
			
		case 2:
			sm.fact();
			break;
			
		case 3:
			sm.fib();
			break;
			
		case 4:
			sm.minmax();
			break;
		}
	}
}
	/*case 5:
			System.out.println("Choose the Type of Sort"+'\n'+"1.Insertion Sort"+'\n'+"2.Merge Sort");
			int a=sc.nextInt();
			if(a==1) {
				int[] a= {5,13,2,14,7,6};
				sm.insert(a);
			}
			else {

			}
			break;
	
		}*/
	

