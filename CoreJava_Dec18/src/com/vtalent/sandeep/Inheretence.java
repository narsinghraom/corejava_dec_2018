package com.vtalent.sandeep;

public class Inheretence {
	float f1,f2;
	public void function(float f1){
		this.f1 =f1+f2;
		f2 = this.f1+f1;
		
	}

    public int function(float f1,float f2)
    {
	this.f1=this .f1+f1;
	this.f2=this.f2+f2;
	return(int)(f1+f2);	
   }

public void function(){
		System.out.println("f1"+f1);
		System.out.println("f2"+f2);
}	
}
 class  One extends Inheretence{

	long l1,l2;
	float f1 ;
	public void function(long l1)
	{
	this.l1=l1+l1;
	l2=this.l1+l1;
	}
 
	public float Function(float f1,float f2)
	{
		this.f1 =this.f1+f1;
		this.f2 =this.f2+f2;
		super.f1=super.f1 +f1;
		return f1+f2;	
}
	
 }


