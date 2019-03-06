package com.vtalent.ram;
class Third
{
	int i,j;
	public void function(int i){
		this.i=i*i;
		this.j=this.i+i;
	}
}
class Fourth extends First
{
	int i;
	double d1;
	public void function(int i,double d1)
	{
		this.i=i*i;
		super.i=super.i+1;
		this.d1=d1;
		j=j+1;
	}
}
public class inherit2 {
public static void main(String[] args) {
	Third f1=new Third();
	//f1.function(3,2.5);
	f1.function(2);
	First f2=new Second();
	//f2.function(2,3.5);
}
}


