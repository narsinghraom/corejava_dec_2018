package com.vtalent.saranyanc;

public class Fab {
	int t1=0,t2=1,c,n,i;
	public void function(int n){
		System.out.println(this.t1);
		System.out.println(this.t2);
		for (i=1;i<=n;i++)
		{
		c=t1+t2;
		t1=t2;
		t2=c;
		
	System.out.println(this.c);
	//*System.out.println(this.t1);
	//*System.out.println(this.t2);
		}
	}
	public static  void main(String[] args){
	Fab f=new Fab();
	f.function(5);
	
	
		
		
		
	
	}

	}
