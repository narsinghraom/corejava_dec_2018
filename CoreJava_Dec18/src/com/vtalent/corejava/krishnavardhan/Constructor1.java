package com.vtalent.corejava.krishnavardhan;

public class Constructor1 {
int m,n;
Constructor1 (){
	m=9;
	n=5;
}
Constructor1 (int m){
  this.m=this.m+m;
   n=n+m;
}
	Constructor1 (int m,int n){
		  this.m=this.m+m;
		  this.n=this.n+n;
		  }
	  public static void main (String [] args){
		Constructor1 c1 = new Constructor1 ();
		System.out.println(c1.m+c1.n);
		Constructor1 c2 = new Constructor1 (5);
		System.out.println(c2.m+c2.n);
		Constructor1 c3 = new Constructor1 (2,5);
		System.out.println(c3.m+c3.n);	
	  }
	  }


  
  
		  
	

