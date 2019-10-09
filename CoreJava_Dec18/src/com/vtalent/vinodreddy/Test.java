package com.vtalent.vinodreddy;

 class EmployeeBean1 {
	
	private int employeeId;
	private double employeeSalary;
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
}
 class Test{
	public static void main(String[] args) {
		EmployeeBean1 empref =new EmployeeBean1()	;
	    empref.setEmployeeId(100);
	    empref.setEmployeeSalary(25000);
	    System.out.println("Id="+empref.getEmployeeId());
	    System.out.println("Id="+empref.getEmployeeSalary());

	    
	    
	}
	
}