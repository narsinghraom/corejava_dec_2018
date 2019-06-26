package com.vtalent.sneha;

public class AgeException extends Exception{
	public String toString(){
		return "age should be >18";
	}
}
class A{
	public boolean validateAge(int age){
		try{
			if (age<=18)
				throw new AgeException();
		
		else
				return true;
		
	
	}
	}

		
		public static void main (String []args){
			A s=new A();
			boolean flag=s.validateAge(25);
			
			}
		
	}


