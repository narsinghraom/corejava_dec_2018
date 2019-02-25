package com.vtalent.saranyanc;

public class Fact {
	
	int i,n,f=1;
	public void function(int  n){
		if(n!=0)
		{
			for(i=1;i<=n;i++)
			{
				this.f=this.f*this.i;
				//*System.out.println(this.f);
				
			}
			
		}
		System.out.println(this.f);
		//*System.out.println(f);
	}
		public static void main(String[] args){
			Fact fact=new Fact();
			fact.function(10);
			
			
			
		}
			
		}
			
			
			
		
	
	
		
	
	


