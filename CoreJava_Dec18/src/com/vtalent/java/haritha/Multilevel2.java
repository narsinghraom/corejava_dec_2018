package com.vtalent.java.haritha;

class Student{
	int studentId;
	public void setstudentId(int studentId) {
		this.studentId=studentId;
		
	}
	public int getStudentId()
	{
		return this.studentId;
	}
}
class Sem2 extends Student{
	int sub1;
	int sub2;
	int sub3;
	public int function(int sub1,int sub2,int sub3) {
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		return sub1+sub2+sub3;

	}
	
}
class Total extends Sem2{

	int total;
	public void function(int total) {
		this.total=sub1+sub2+sub3;
	
	}
	
}
public class Multilevel2 {
	
	public static void main(String[] args) {
		Total t1=new Total();
		t1.setstudentId(123);
		t1.function(95,88,100);
		t1.function(t1.total);
		System.out.println(t1.total);
		System.out.println(t1.getStudentId());
		System.out.println(t1.sub1);
		System.out.println(t1.sub1+t1.sub2);
	}
		
	}


