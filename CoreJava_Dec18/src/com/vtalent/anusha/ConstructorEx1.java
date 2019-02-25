package com.vtalent.anusha;

 class ConstructorEx1 {

			 int x;
			 int y;
	 ConstructorEx1() {
		 //this(3);
				x=5;
				y=7;
			}
	ConstructorEx1(int x)
			{
		this(7,5);
				this.x=this.x+x;
				y=y+x;
			}
	 ConstructorEx1(int x,int y)
			{
		 this();
			this.x=this.x+x;
			this.y=this.y+y;
			}
			public void function()
			{
			System.out.println(x+y);
			}
			public static void main(String[] args) 
			{
				ConstructorEx1 c1=new ConstructorEx1();
				ConstructorEx1 c2=new ConstructorEx1(5);
				ConstructorEx1 c3=new ConstructorEx1(4,4);
				//System.out.println(x+y);
				c2.function();
				
			}
			


	}
