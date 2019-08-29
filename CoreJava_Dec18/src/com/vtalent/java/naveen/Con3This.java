package com.vtalent.java.naveen;

public class Con3This {

	int i,j;
	 public Con3This(){
		
		i=5;
		j=7;
	}
	 public Con3This(int i){
		 
		 this.i=this.i+i;//
		 j+=this.i;//
	 }
	 public Con3This(int i,int j){
		 this.i=this.i+i;//
		 this.j*=j;//
	 }
		public static void main(String[] args) {
			Con2This ct2=new Con2This(5);
			System.out.println(ct2.i+ct2.j);

		}


}
