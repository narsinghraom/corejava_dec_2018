package com.vtalent.corejava.alekya;


 class Abcdefg {
	
		int x;
		public void function(int x){
			this.x=this.x+x;
		}
		public void function(){
			System.out.println(x);
		 }
 }
		class Ab extends Abcdefg { 
	 
		int x,y;
		public void function(int x,int y){
			this.x=this.x+x;
			this.y=this.x+y;
		}
		public void function(int  x){
			this.x=this.x+x;
		 }	
		}
		class Abcde{
			public static void main(String[] args){
				Ab a=new Ab();
				a.function();
				a.function(2);
				a.function(2,3);
				System.out.println(a.x);
				System.out.println(a.y);
		
			}
			}			
		

		

	
		


		

