package com.vtalent.bhavani;





	public class Student {
	static	int rollNum;
		String Name;
	static int x=10;
		public Student(int rollNum, String Name) {
			this.rollNum = rollNum;
			this.Name = Name;

		}

		public String toString() {
			return Name + "" + rollNum;
		}

		public Student() {
			// TODO Auto-generated constructor stub
		}

		public static void main(String[] args) {
			Student s1 = new Student(101, "bhanu");
			Student s2 = new Student(102, "lavanya");
			System.out.println(s1.toString());
			System.out.println(s2);
			System.out.println();
	System.out.println(rollNum);
	System.out.println(Integer.toString(x));
	

		}
	}


