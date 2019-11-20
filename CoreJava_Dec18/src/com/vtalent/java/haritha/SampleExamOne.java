package com.vtalent.java.haritha;

	public class SampleExamOne extends SampleExam1{

		public SampleExam1 sampleExam1(){
			super.sampleExam1();
			 x = x+(int)sampleExam1.a;
			 y = y+(int)sampleExam1.b;
			return sampleExam1;
		}
		public static void main(String[] args) {
			SampleExamOne s1 = new SampleExamOne();
			SampleExam1 se = s1.sampleExam1();
			System.out.println(se.x+se.y);
			System.out.println(s1.a+s1.b);
		}
	}

