package com.vtalent.java.vishnu;

public class SampleExam1 {
	static SampleExam1 sampleExam;
	static int x, y;
	private static SampleExam1 sampleExam1;
	double a, b;

	public static SampleExam1 sampleExam1() {
		sampleExam = new SampleExam1();
		sampleExam.a = 2.0;
		sampleExam.b = 3.0;
		x = (int) sampleExam.a;
		y = (int) sampleExam.b;
		return sampleExam;
	}

	public static void main(String[] args) {
		SampleExam1 sampleExam = sampleExam1();
		sampleExam.a = SampleExam.sampleExam.a + 2;
		sampleExam.b = SampleExam.sampleExam.b + 3;
		System.out.println(x + y);
		System.out.println(sampleExam.a + sampleExam.b);
	}

}
