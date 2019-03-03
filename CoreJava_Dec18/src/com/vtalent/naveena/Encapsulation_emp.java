
package com.vtalent.naveena;
public class Encapsulation_emp {
public static void main(String[] args) {
Test emp = new Test();
emp.setEmpId(100);
emp.setEmpSalary(25000.0);
System.out.println("Id =" + emp.getEmpId());
System.out.println("Salary =" + emp.getEmpSalary());
}
}
class Test{
		// TODO Auto-generated method stub
		private int empId;
		private double empSalary;
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public void setEmpSalary(double EmpSalary) {
			this.empSalary = empSalary;
		}
		public int getEmpId() {
			return this.empId;
		}
		public double getEmpSalary() {
			return this.empSalary;
		}
	}