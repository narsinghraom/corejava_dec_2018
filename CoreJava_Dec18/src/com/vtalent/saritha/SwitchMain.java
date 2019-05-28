package com.vtalent.saritha;
import java.util.Scanner;
public class SwitchMain {
	
	 static	Scanner sc1=new Scanner(System.in);
	 		public void prime() {
	 			System.out.println("Enter a number to Check Whether it is prime or not.");
				int q=sc1.nextInt();
				int m=q/3; 
				int f=0;
				if(q==0||q==1){  
					   System.out.println(q+" is not prime number");      
					  }
				
				else {
					for(int i=2;i<=m;i++) {
						if(q%i==0) {
							System.out.println(q+" is not a prime Number");
							f=1;
							break;
						}
					}
				if(f==0) {
					System.out.println(q+" is a Prime Number");
				}
				}
				
	 		}			
			
	 		public void fact() {
				System.out.println("Enter a Number to get Factorial of that Number");
				 int z, fact=1;
					  z=sc1.nextInt();
					for(int i=1;i<=z;i++) {
						fact=fact*i;
					}
					System.out.println(fact);
	 		}
			
	public void fib() { 		
				int n,n1,x;
				n=0; n1=1;
				System.out.println("Enter a number");
				x=sc1.nextInt();
					for( int i=1;i<=x;i++) {
						int t=n+n1;
						System.out.print(n+" ");
							n=n1;
							n1=t;
							
					}
	}
	 		
	public void minmax() {
				int[] a= {3,7,10,0,1};
				int min = a[0];
				for(int i=1;i<a.length;i++){
					if(a[i] < min){
						min = a[i];
					}
			}
				int max=a[0];
				for(int i=1;i<=a.length-1;i++ ) {
					if(a[i] > max) {
						max=a[i];
					}
				}
				
				System.out.println("Minimum Value:"+min);
				System.out.println("Maximum Value:"+max);
				
				

	}

			/* public void sort() {
				  public int[] insert(int[] a){
					  int i,j,k,temp;
					  System.out.println("Values in Array Before Sorting");
					  a=sc1.nextInt();
					  for(int z=0;z<a.length;z++) {
						  System.out.print(a[z]+" ");

					  }
					  for(i=1;i<a.length;i++) {
						  k=a[i];
						  j=i-1;
						  while(j>=0 && k<a[j]) {
							  temp=a[j];
							  a[j]=a[j+1];
							  a[j+1]=temp;
							  j--;
						  }
					  }
					  System.out.println('\n'+"Values in Array After Sorting");
					  for(int z=0;z<a.length;z++) {
						  System.out.print(a[z]+" ");

					  }


					  return a;*/

				  


			  
			}


