package com.vtalent.ram;

	class Employee {
		private int empId;
		private double empSalary;

		public void setEmpId(int empId) {
			this.empId = empId;
		}

		public void setEmpSalary(double empSalary) {
			this.empSalary = empSalary;
		}

		public int getEmpId() {
			return empId;
		}

		public double getEmpSalary() {
			return empSalary;
		}
	}

	class Test {
		public static void main(String[] args) {
			Employee emp = new Employee();
			emp.setEmpId(100);
			emp.setEmpSalary(20000);
			System.out.println("Id=" + emp.getEmpId());
			System.out.println("Salary=" + emp.getEmpSalary());

		}
	}
