package com.vtalent.varshini;

    class SampleExam {
	static SampleExamOne sampleExam;
	static int x,y;
	double a,b;
	public SampleExamOne sampleExam(){
		sampleExam = new SampleExamOne();
		sampleExam.a=2.0;
		sampleExam.b=3.0;
		x=(int)sampleExam.a;
		y=(int)sampleExam.b;
		return sampleExam;
	}
}

public class SampleExamOne extends SampleExam{

	public SampleExamOne sampleExam(){
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
