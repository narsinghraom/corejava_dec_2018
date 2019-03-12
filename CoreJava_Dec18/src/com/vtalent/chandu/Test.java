package com.vtalent.chandu;

class Abc {
static float f1,f2;
int i,j;
Abc(){
	i=5;
	j=7;
}
public int function(int i){
	this.i=i*this.i;
	return i+this.j;
}
public float function(int i , int j){
	this.i=this.i+i;
	this.j=this.j+j;
	f1=i;
	f2=j;
	return f1+f2;
}
}
class Xyz extends Abc{
	int j;
	Xyz(){
		super();
		j=5;
		super.i=super.i+j;
		super.j=super.j+j;
	}
	public float function(int i , int j){
		super.function (i,j);
		this.j=this.j+j;
		super.i=super.i+i;
		super.j=super.j+this.j;
		Abc.f1=Abc.f1+j;
		Abc.f2=Abc.f2+i;
		return  Abc.f1;
	}
}
class Pqr extends Xyz{
	int i;
	public int function (int i){
		this.i=super.i+i;
		this.j=this.j+i;
		return i;
	}
	public double function (double d1){
		Abc.f1=Abc.f1+(float)d1;
		Abc.f2=Abc.f2+(float)d1;
		return Abc.f1+Abc.f2;
	}
}
class Test{
	public static void main(String[] args) {
		Abc abc = new Abc();
		int k=abc.function(5);
				Xyz xyz = new Xyz();
		 float f1=xyz.function(k,(int)abc.function(k,k));
		 Pqr pqr = new Pqr();
		 k=pqr.function(k+1);
		 f1 =(float) pqr.function (Abc.f1+Abc.f2);
		 System.out.println(k);
		 System.out.println(f1);
		 Abc abc1 = new Xyz();
		 k=(int) abc1.function((int)f1 , (int)Abc.f1);
		 System.out.println(k);
		 System.out.println(f1);
		 System.out.println(Abc.f2);
		System.out.println(abc.i);
		System.out.println(abc.j);
		System.out.println(abc.f1);
		System.out.println(abc.f2);
		System.out.println(Abc.f1);
	}
}
