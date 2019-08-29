package com.vtalent.java.prashanth;


	public class Student{  
		int rollno;  
		String name;  
		float fee;  
		Student(int rollno,String name,float fee){  
		rollno=rollno; 
		System.out.println(rollno);
		name=name;  
		System.out.println(name);
		fee=fee;  
		System.out.println(fee);
		}  
		void display(){System.out.println(rollno+" "+name+" "+fee);}  
		}  
		class TestThis1{  
		public static void main(String args[]){  
		Student s1=new Student(111,"ankit",5000f);  
		//Student s2=new Student(112,"sumit",6000f);  
		s1.display();  
		//s2.display();  
		}
		} 

