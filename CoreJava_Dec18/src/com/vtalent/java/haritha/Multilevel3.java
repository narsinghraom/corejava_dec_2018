package com.vtalent.java.haritha;
class Sem1{
	int sub1;
	int sub2;
	public int marks(int sub1,int sub2) {
		this.sub1=68;
		this.sub2=77;
		return this.sub1+this.sub2;
	}
}
class Sem3 extends Sem1{
int sub3;
int sub4;
	public int marks1(int sub3,int sub4) {		this.sub3=90+sub3;
	this.sub4=86+sub4;
	return this.sub3+this.sub4;
	}	
	
	public int marks1(int sub1) {
		this.sub1 = 20 + sub1;
		super.sub1 = super.sub1 + sub1;
		return super.sub1 + this.sub1;
	}
}
class Avg extends Sem3{
	int total,total1;
	float f,f1;
	public float function() {
		total=marks(2,3);
		total1=marks1(4);
		f=(total+total1)/2;
		return f;
	}
}


public class Multilevel3 {

	public static void main(String[] args) {
		Avg a=new Avg();
		a.function();
		System.out.println(a.f);
		System.out.println(a.sub1+a.sub2);
		System.out.println(a.sub2+a.sub3);
		
	}

}
