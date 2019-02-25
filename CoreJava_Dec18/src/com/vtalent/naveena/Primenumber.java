package com.vtalent.naveena;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");//enter number for to check
		int n=scn.nextInt();
		/*for(int i=1;i<=n;i++){ //for one number
			//code for prime number
			if(n%i==0){
				count++;
			}
		}*/
		for (int i=1;i<=n;i++){
			count=0;
			for(int j=1;j<=i;j++){
				if(i%j==0){
					count++;
				}
			}
		}
if(count==2){
	System.out.println(+ n +" is Prime Number");
}else{
	System.out.println(+ n +" is not a Prime Number");
}
	}

}
