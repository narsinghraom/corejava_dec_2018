package com.vtalent.sandeep;

public class Inheretence {
	float f1,f2;
	public void function(float f1){
		this.f1 =f1+f2;
		f2 = this.f1+f1;
		
	}

public float function(float f1,float f2){
	this.f1=this .f1+f1;
	this.f2=this.f2+f2;
	return(int)(f1+f2);
	
}

public void function(){
		System.out.println("f1+f2");
		System.out.println("f2+f2");
}	
}
 class  one extends Inheretence{

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
class test{
	public static void main(){
		Inheretence d1= new Inheretence();
		float f1=d1.function(2.5f,1.5f);
		((Inheretence) d1).function((long)f1);
		((Inheretence) d1).function(f1,f1);
		((Inheretence) d1).function(0);
		
		
	}
	
}


