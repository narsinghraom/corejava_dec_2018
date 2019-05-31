package com.vtalent.naresh;


class Poly1 {
		float f1,f2;
		Poly1(){
			f1=1.5f;
			f2=2.5f;
		}
		public void function(float f1){
			this.f1=f1+f1;
			f2=this.f1+f1;
			System.out.println(this.f1+"  "+this.f2 );
		}
		
		public float function(float f1,float f2){
			this.f1=this.f1+f1;
			this.f2=this.f2+f2;
			return (int)(f1+f2);
		}
		public void function(){
			System.out.println("f1  "+f1);
			System.out.println("f2  "+f2);
		}

	}




  class Poly2 extends Poly1{
	long l1,l2;
	float f1;
	Poly2(){
		super();
		f1=super.f1;
		l1=(long)f2;
	}
	public void function(long l1){
		this.l1=l1+l2;
		l2=this.l1+l1;
	}
	public float function(float f1,float f2){
		f1=super.function(f1,f2);
		this.f1=this.f1+f1;
		this.f2=this.f2+f2;
		super.f1=super.f1+f1;
		return f1+f2;
	}

}



  class Poly3 extends Poly2{
	Poly3(){
		super();
	}
	public void function(long l1){
		//l1=super.function(l1);
		this.l1=this.l1+l1;
	}

}



public class Polymorphism {

	public static void main(String[] args) {
		
		Poly1 p1=new Poly1();
		Poly2 p2=new Poly2();
		Poly3 p3=new Poly3();
		Poly1 p4=new Poly3();
		Poly1 p5=new Poly2();
		Poly2 p6=new Poly3();
	//	Poly2 p7=new Poly1();
		//Poly3 p8 = new Poly2();
		float f1=p6.function(2.5f, 1.5f);//5.5
		System.out.println(f1);
		p6.function((long)f1);
		p6.function(f1);
		p6.function();
		System.out.println(p6.f1);
		System.out.println(p6.f2);
		System.out.println(p6.l1);
		System.out.println(p6.l2);
		/*
		 * sop(p1.l1); sop(p1.l2);
		 * 
		 * float f2=p2.function(2.5f, 1.5f); System.out.println(p2.f1); sop(p2.f2);
		 * sop(p2.l1); sop(p2.l2); System.out.println(p3.f1); sop(p3.f2); sop(p3.l1);
		 * sop(p3.l2);
		 */
	}

}
	
	