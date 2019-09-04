package com.vtalent.java.naveen;

public class Con4This {
	int i,j;
	 public Con4This(){
		 this(7);
		i=5;
		j=7;	
	}
	 public Con4This(int i){

		 this.i=this.i+i;//7
		j+=this.i;//7
	 }
	 public Con4This(int i,int j){
		 this();
		 this.i=this.i+i; //9
		this.j=this.j*j;//49
	 }
		public static void main(String[] args) {
			Con4This ct4=new  Con4This(4,7);
			System.err.println(ct4.i+ct4.j);//58

		}
}
