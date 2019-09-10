package com.vtalent.java.naveen;

public class InheritanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InherSampleThree st=new InherSampleThree();
		st.function(25, 1.5f);
		st.function(5);
		//st.function(2.5f);
		st.function(st.f1);
		st.function(st.f1, st.f2);
		System.out.println(st.l);//  25
		System.out.println(st.i);//10
		System.out.println("    na       ");
System.out.println(st.f1);//0.0
System.out.println(st.f2);//0.0

	}

}
