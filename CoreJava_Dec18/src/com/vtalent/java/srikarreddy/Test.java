package com.vtalent.java.srikarreddy;


	class Single{
		int i,j;
		public void function(int i) {
			this.i=this.i*i;
			j=this.i;
		}}
	class  Second extends Single{
		int j;
		public void function(int i,int j) {
			this.j=this.j+j;
			this.i=this.i+i;
		}
	}
	class Third extends Second{
		int  q;
		public void function(int q, int i,int j ) {
			this.q=this.q+q;
			this.i=this.i+i;
			this.j=this.j+j;
		}}
		public class Test {
	 public static void main(String[] args) {
		Single s1=new Single();
		s1.function(5);
		System.out.println(s1.i+s1.j);
		Second s2=new Second();
		s2.function(3);
		s2.function(5,4);
		System.out.println(s2.i+s2.j);
		Third s3=new Third();
		s3.function(2 );
		 
		s3.function(5,3,4);
		System.out.println (s3.q+s3.i+s3.j);
	 
		
	}
		
	 
	

}
