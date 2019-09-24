package com.vtalent.prashanth;

class SampleOne1 {
	float f1,f2;
	public void function(float f1) {
		this.f1=f1+f2;
	}
	public void function(float f1,float f2) {
		this.f1=this.f1+f1;
		this.f2=this.f2+f2;
	}
}

class SampleTwo1 extends SampleOne1 {
	int i;
	float f1;
	public void function(int i) {
		this.i=i+i;
	}
	public void function(float f1) {
		this.f1=f1+super.f1;
	}
}
class SampleThree1 extends SampleTwo1 {
	long l;
	float f1;
	public void function(long l,float f1) {
		this.l=l;
	}
}

public class SampleTest {

	public static void main(String[] args) {
		//1.SampleThree st=new SampleThree();
		SampleTwo1 st=new SampleThree1();//2
		//1.st.function(25, 1.5f);
		//1.st.function((int)st.l);
		st.function(5);
		st.function(st.f1);
		st.function(st.f1,st.f2);
		//1.System.out.println(st.l);
		System.out.println(st.f1);
		System.out.println(st.f2);
		System.out.println(st.i);
	}

}
