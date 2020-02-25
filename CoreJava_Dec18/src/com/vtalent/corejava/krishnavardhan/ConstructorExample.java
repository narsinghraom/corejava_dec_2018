package com.vtalent.corejava.krishnavardhan;

public class ConstructorExample {
  int x,y; 
	 ConstructorExample (){
		   x=2;
		   y=5;
		    }
  ConstructorExample (int x){
	  this.x=this.x+x;
	  y=y+x;
  }	
  ConstructorExample (int x,int y){
	  this.x=this.x+x;
	  this.y=this.y+y;
	  }
  public static void main (String [] args){
	ConstructorExample c1 = new ConstructorExample ();
	System.out.println(c1.x+c1.y);
	ConstructorExample c2 = new ConstructorExample (5);
	System.out.println(c2.x+c2.y);
	ConstructorExample c3 = new ConstructorExample (2,5);
	System.out.println(c3.x+c3.y);	
  }
  }

