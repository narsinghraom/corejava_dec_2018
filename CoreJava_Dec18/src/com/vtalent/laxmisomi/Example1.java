package com.vtalent.laxmisomi;

import java.util.*;

class Student{
	
	private int StudentRoll;
	private String StudentName;
	private Double StudentYear;
	private String StudentBranch;
	
	static Student[] Array;
	static Scanner sc = new Scanner(System.in);


		public int getStudentRoll() {
			return StudentRoll;
		}
	
	
		public void setStudentRoll(int studentRoll) {
			StudentRoll = studentRoll;
		}
	
		public String getStudentName() {
			return StudentName;
		}

		public void setStudentName(String studentName) {
		StudentName = studentName;
	}

		public Double getStudentYear() {
		return StudentYear;
	}

		public void setStudentYear(Double studentYear) {
		StudentYear = studentYear;
	}

		public String getStudentBranch() {
		return StudentBranch;
	}

	public void setStudentBranch(String studentBranch) {
		StudentBranch = studentBranch;
	}


	public void insertData() {
		Student abc=new Student();
		System.out.println("enter number of students need to be inserted");
		int size=sc.nextInt();
		Array =new Student[size];
		
		for(int i=0; i<Array.length; i++) {
			System.out.println("enter student roll number");
			int roll=sc.nextInt();
			abc.setStudentRoll(roll);
			
			System.out.println("enter student name");
			sc.nextLine();
			String name=sc.next();
			abc.setStudentName(name);
			
			System.out.println("enter student year");
			Double year=sc.nextDouble();
			abc.setStudentYear(year);
			
			System.out.println("enter student branch");
			sc.nextLine();
			String branch=sc.next();
			abc.setStudentBranch(branch);
			Array[i] = abc;
		}
		
		
			
			System.out.println("roll number="+ abc.getStudentRoll()+ "" +"name=" + abc.getStudentName()+ "" + "year=" + abc.getStudentYear() +"branch=" + abc.getStudentBranch() );
	
	
		
	
	
	}
}

		public class Example1 {

			public static void main(String[] args) {
				
				Student a = new Student();
				for(;;) {
					Scanner s = new Scanner(System.in);
					System.out.println("Please select your choice: \r\n" +
							"1. insert Into Array.\r\n" + 
							"2. delete from my Array.\r\n" + 
							"3. Search an employee from my Array.\r\n" + 
							"4. Search All the employees from my Array with the help of name.\r\n" +
							"5. update All the employees from my Array .\r\n" +
							"6. Print All the employees from my Array.\r\n" + 
							"7. Exit.");
					int scan = s.nextInt();
					switch(scan) {
					case 1: a.insertData();
					break;
					/*case 2: a.delete();
					break;
					case 3: a.search();
					break;
					case 4: a.searchName();
					break;
					case 5: a.updateData();
					break;
			        case 6: a.printAll();
					break;*/
					case 7: 
					System.exit(0);
					default: System.out.println("Please give a valid Input: ");
					
				 
					
					}
				}
			}
		
}