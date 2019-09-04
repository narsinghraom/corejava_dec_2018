package com.vtalent.vinodreddy;

class Single {
	int i ,j;
	 public void function (int i) {
		 this.i = this.i*i;
		 j =this.i;
	 }
}

class Second extends Single {
	int j ;
	public void function(int i ,int j) {
		this.j =this.j+j;
		this.i=this.i+i;
	}
}

 class Inheritance {
	public static void main(String[] args) {
		Single s1 = new Single();
		s1.function(5);
		System.out.println(s1.i+s1.j);
		Second s2 =new Second();
		s2.function(3);
		s2.function(5,4);
		System.out.println(s2.i+s2.j);
		
	}

}
