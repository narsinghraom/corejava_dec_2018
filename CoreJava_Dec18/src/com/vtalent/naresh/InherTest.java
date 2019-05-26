package com.vtalent.naresh;


class First{
int i,j;
	public void funtion(int i) {
		this.i=this.i+i;
		j=this.j+j;
		System.out.println("Void Type is Called");
	}
}

/*class Second extends First{
	int j;
	public void function(int i,int j) {
		this.j=this.j+j;
		super.j=super.j+this.j;
		//System.out.println(super.j);
			this.i=this.i+i; 
			
		
	} 
	public	void function(int i, int j) {
		
	} 
	
}*/
	class Third extends First{
		public int function(int i) {
			System.out.println("int Type is Called");
			return i*i;
		}
		
		class Four extends First{
			
			public int function(int i) {
				return 1;
			}
		}		/*public void function(int i, int j) {
				System.out.println("method overridden");
			} */
		}
	




public class InherTest {
	public static void main(String[] args) {
		First f=new First();
		f.funtion(5);
		/*
		 * Second s= new Second(); s.function(5, 5); s.funtion(7);
		 */ 
		
		Third d= new Third();
		d.function(15);
		int k=d.function(10);  
		System.out.println(k);
		
		//System.out.println(s.j);
		//System.out.println(s.i);
	}

}
