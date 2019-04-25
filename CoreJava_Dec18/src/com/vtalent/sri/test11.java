package com.vtalent.sri;
 class Abc2 {
int i,j;
static float f1,f2;
Abc2(){
	i=5;
	j=7;
}
public int function(int i){
	this.i=i+this.i;
	return i+this.j;
}
public float function(int i,int j){
	this.i=this.i+i;
	this.j=this.j+j;
	f1=i;
	f2=j;
	return f1+f2;
}			
}
	class Xyz extends Abc2{
		int j;
		Xyz(){
			super();
			j=5;
			
			super.i=super.i+i;
			super.j=super.j+j;
		}
		public float function(int i,int j)
		{
			super.function(i,j);
			this.j=this.j+i;
			super.i=super.i+i;
			super.j=super.j+this.j;
			Abc2.f1=Abc2.f1+j;
			Abc2.f2=Abc2.f2+i;
			return Abc2.f1;
		}
	}
	class Mnr extends Xyz{
		int i;
		public int function(int i){
			this.i=super.i+i;
			this.j=this.j+i;
			return i;
		}
		public double function(double d1){
			Abc2.f1=Abc2.f1+(float)d1;
			Abc2.f2=Abc2.f2+(float)d1;
			return Abc2.f1+Abc2.f2;
		}
	}
	class test11
	{
		public static void main(String[] args) {
			Abc2 abc2=new Abc2();
			int k=abc2.function(5);
			Xyz xyz=new Xyz();
			float f1=xyz.function(k,(int)abc2.function(k,k));
			Mnr mnr=new Mnr();
			k=mnr.function(k+1);
			f1=(float)mnr.function(Abc2.f1+Abc2.f2);
			System.out.println(k);
			System.out.println(f1);			
			
			Abc2 abc21=new Xyz();
			k=(int)abc21.function((int)f1,(int)Abc2.f1);
			Abc2.f1=abc2.function(k);
			System.out.println(k);
			System.out.println(f1);
			System.out.println(Abc2.f2);
			System.out.println(abc2.i);
			System.out.println(abc2.j);
			System.out.println(abc2.f1);
			System.out.println(abc2.f2);
			System.out.println(Abc2.f1);
			
			
			
		}
	}
