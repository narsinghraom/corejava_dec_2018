package com.vtalent.java.lokesh;

public class SampleExam {
	static SampleExam sampleExam;
	static int x,y;
	double a,b;
	public SampleExam sampleExam(){
		sampleExam = new SampleExam();
		sampleExam.a=2.0;
		sampleExam.b=3.0;
		x=(int)sampleExam.a;
		y=(int)sampleExam.b;
		return sampleExam;
	}
}

public class SampleExamOne extends SampleExam{

	public SampleExam sampleExam(){
		super.sampleExam();
		 x = x+(int)sampleExam.a;
		 y = y+(int)sampleExam.b;
		return sampleExam;
	}
	public static void main(String[] args) {
		SampleExamOne s1 = new SampleExamOne();
		SampleExam se = s1.sampleExam();
		System.out.println(se.x+se.y);
		System.out.println(s1.a+s1.b);
	}
}




}
