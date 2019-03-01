package com.vtalent.chandu;

public class Prime {
<<<<<<< HEAD:CoreJava_Dec18/src/com/vtalent/ram/Prime.java
	
		public static void main(String[] args){
			int n=19;
			boolean prime=true;
			for(int i=2;i<n;i++){
				if(n%i==0){
					prime=false;
					break;
				}
				
			}
		if(prime){
			System.out.println( n + " is a prime number");
			
		}
		else{
			System.out.println( n + " is a not prime number");
			
		}
		}
	}


=======
	 public static void main(String args[]){    
		  int i,m=0,flag=0;      
		  int n=5;//it is the number to be checked    
		  m=n/2;      
		  if(n==0||n==1){  
		   System.out.println(n+" is not prime number");      
		  }else{    ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
		   for(i=2;i<=m;i++){      
		    if(n%i==0){      
		     System.out.println(n+" is not prime number");      
		     flag=1;      
		     break;      
		    }      
		   }      
		   if(flag==0)  { System.out.println(n+" is prime number"); }  
		  }//end of else  
		}    
}
>>>>>>> caf8bd5f38995d644862727805380292631cc51b:CoreJava_Dec18/src/com/vtalent/chandu/Prime.java
