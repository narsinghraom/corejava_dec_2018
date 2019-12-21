package com.vtalent.java.vishnu;

public class SampleExam {
	static SampleExam sampleExam;
	static int x, y;
	double a, b;

	SampleExam() {
		sampleExam = new SampleExam();
		sampleExam.a = 2.0;
		sampleExam.b = 3.0;
		x = (int) sampleExam.a;
		y = (int) sampleExam.b;
	}

	public static void main(String[] args) {
		SampleExam sampleExam = new SampleExam();
		sampleExam.a = SampleExam.sampleExam.a + 2;
		sampleExam.b = SampleExam.sampleExam.b + 3;
		System.out.println(x + y);
	}
}
