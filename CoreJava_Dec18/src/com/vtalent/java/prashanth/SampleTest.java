package com.vtalent.sreenivas;

public class SampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.SampleThree st=new SampleThree();
		SampleTwo st=new SampleThree();//2
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
