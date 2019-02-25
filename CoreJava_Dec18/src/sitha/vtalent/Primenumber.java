package sitha.vtalent;

public class Primenumber {
	public static void main(String[] args){
		int n=20;
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


	
