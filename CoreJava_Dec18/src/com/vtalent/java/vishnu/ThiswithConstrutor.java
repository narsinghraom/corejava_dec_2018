package com.vtalent.java.vishnu;

public class ThiswithConstrutor {

int i,j;
 

ThiswithConstrutor()
 {
	 i=5;
	 j=7;
	 
} 
ThiswithConstrutor(int i)
 {
 this.i=this.i+i;
 j=j+this.i;
 }
 ThiswithConstrutor(int i,int j)
 {
	 this();
	 this.i=this.i+i;
	 this.j=this.j*j;
	 
 }
public static void main(String []args){
	 ThiswithConstrutor e1=new  ThiswithConstrutor();
	ThiswithConstrutor e2=new  ThiswithConstrutor(2);
	 ThiswithConstrutor e3=new  ThiswithConstrutor(3,5);
	System.out.println(e1.i+e1.j);
	System.out.println(e2.i+e2.j);
	System.out.println(e3.i+e3.j);
}
 	
}
