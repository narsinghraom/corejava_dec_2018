package com.vtalent.sathyam.basics;
class Emp
{
	int eid;
	static int salary;
static	String company;
	public void show()
	{
		System.out.println(eid+":"+salary+":"+company);
		
	}
	
}

public class StaticDemo {
	
	public static void main(String[] args) {
		
		
		Emp navin=new Emp();
		
		navin.eid=8;
		navin.salary=4000;
		Emp.company="sathyam";
		
		
		Emp rahul=new Emp();
				rahul.eid=9;
		Emp.salary=5000;
		Emp.company="sathyam";
		Emp.company="nikitha";
		navin.show();
		rahul.show();
		
	}

}
