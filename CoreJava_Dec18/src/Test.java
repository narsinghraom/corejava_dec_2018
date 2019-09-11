class EmployeeBean {
private int employeeId;
private double employeeSalary;
public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
}
public void setemployeeSalary(int employeeSalary) {
this.employeeSalary = employeeSalary;
}
public int getEmployeeId(){
	return this.employeeId;
}
public double getEmployeeSalary() {
	return this.employeeSalary;
}
}
class Test{
	public static void main(String[] args) {
EmployeeBean empref= new EmployeeBean()	;
empref.setEmployeeId(150);
empref.setemployeeSalary(15000);
System.out.println("Id=" +empref.getEmployeeId());
System.out.println("salary="+empref.getEmployeeSalary());	} 

}



