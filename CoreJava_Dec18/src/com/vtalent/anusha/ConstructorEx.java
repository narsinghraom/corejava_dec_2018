package com.vtalent.anusha;

 class ConstructorEx {
	 int x;
	 int y;
	ConstructorEx() {
	
		x=5;
		y=7;
	}
	ConstructorEx(int x)
	{
		this.x=this.x+x;
		y=y+x;
	}
	ConstructorEx(int x,int y)
	{
	this.x=this.x+x;
	this.y=this.y+y;
	}
	//public void function()
	//{
	//System.out.println(x+y);
	//}
	public static void main(String[] args) {
		ConstructorEx c1=new ConstructorEx();
		ConstructorEx c2=new ConstructorEx(5);
		ConstructorEx c3=new ConstructorEx(2,5);
		//System.out.println(c1.x+c1.y+c2.x+c2.y+c3.x+c3.y);
		
	}
	

}

