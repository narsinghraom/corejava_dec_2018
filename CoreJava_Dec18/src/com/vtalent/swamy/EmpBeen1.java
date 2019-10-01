package com.vtalent.swamy;

public class EmpBeen1 {
		private int employeeId;
		private double employeesalary;
		private long employeemobileno;

		public EmpBeen1(int employeeId, double employeesalary, long employeemobileno) {
			this.employeeId = employeeId;
			this.employeesalary = employeesalary;
			this.employeemobileno = employeemobileno;
		}
		public int getEmployeeId() {
			return employeeId;
		}
	/*	public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}*/
		public double getEmployeesalary() {
			return employeesalary;
		}
	/*	public void setEmployeesalary(double employeesalary) {
			this.employeesalary = employeesalary;
		}*/
		public long getEmployeemobileno() {
			return employeemobileno;
		}
		/*public void setEmployeemobileno(long employeemobileno) {
			this.employeemobileno = employeemobileno;
		}*/
		@Override
		public String toString() {
			return "Employee [employeeId=" + employeeId + ", employeesalary=" + employeesalary + ", employeemobileno="
					+ employeemobileno + "]";
		}

	}


