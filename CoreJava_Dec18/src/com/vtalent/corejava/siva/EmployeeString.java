package com.vtalent.corejava.siva;

import java.util.Scanner;

class EmployeeInfo {
	private int emp_Id;
	private double emp_salary;
	private long mobile_no;
	private String emp_name;
	private String city; 

	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}

	public void setEmp_salary(double emp_salary) {
		this.emp_salary = emp_salary;
	}

	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}
public void setemp_name(String emp_name )
{
	this.emp_name=emp_name;
}
public void setCity(String city)
{
	this.city=city;
}
public String getCity() {
	return city;
}
public String getemp_name()
{
	return emp_name;
}
	public int getEmp_Id() {
		return emp_Id;
	}

	public double getEmp_salary() {
		return emp_salary;
	}

	public long getMobile_no() {
		return mobile_no;
	}

}

class EmployeeOperation {
	static EmployeeInfo[] einfoArray;
	Scanner sc = new Scanner(System.in);

	public void insertEmployee() {
		System.out.println("enter the number of employee stored");
		int size = sc.nextInt();
		EmployeeOperation.einfoArray = new EmployeeInfo[size];

		for (int i = 0; i <= size - 1; i++) {
			EmployeeInfo empinfo = new EmployeeInfo();
			System.out.println("employee data: " + (i + 1));
			System.out.println("enter the emp_Id");
			empinfo.setEmp_Id(sc.nextInt());
			System.out.println("enter the employee_salary");
			empinfo.setEmp_salary(sc.nextDouble());
			System.out.println("enter the employee mobile number");
			empinfo.setMobile_no(sc.nextLong());
			System.out.println("enter the employee name");
			empinfo.setemp_name(sc.next());
			System.out.println("enter the city");
			empinfo.setCity(sc.next());
			System.out.println("empid : " + empinfo.getEmp_Id() + " ; empsalary: " + empinfo.getEmp_salary()
					+ " ; mobileno:" + empinfo.getMobile_no()+
					"; employee name: " +empinfo.getemp_name()+" ; city "+empinfo.getCity());
			if (einfoArray != null) {
				for (int j = 0; j <= einfoArray.length - 1; j++) {
					if (einfoArray[j] == null) {
						einfoArray[i] = empinfo;
						break;
					}
				}
				

			} else {
				System.out.println("Already Inserted");
			}
		}
	}

	public void deleteEmployee() {
		EmployeeInfo emp1;
		if (einfoArray != null) {
			for (int i = 0; i <=einfoArray.length - 1; i++) {
				emp1 = einfoArray[i];
				System.out.println(emp1.getEmp_Id());
			}
			System.out.println("enter the employee id");
			int x = sc.nextInt();
			for (int i = 0; i <= einfoArray.length - 1; i++) {
				emp1 = einfoArray[i];
				if(emp1!=null) {
				if (x==emp1.getEmp_Id()) {
					einfoArray[i] = null;
					System.out.println("Deleted");
					EmployeeString.z=EmployeeOperation.einfoArray.length;
					break;
				
				}
				}
			}
		} else {
			System.out.println("insert the data");
		}
	}

	public void updateEmployee() {
		EmployeeInfo emp1;
		if (einfoArray != null) {
			for (int i = 0; i <= einfoArray.length - 1; i++) {
				emp1 = einfoArray[i];
				System.out.println(emp1.getEmp_Id());
			}
			System.out.println("enter the employee id");
			int x = sc.nextInt();
			for (int i = 0; i <= einfoArray.length - 1; i++) {
				emp1 = einfoArray[i];
				if (x==emp1.getEmp_Id()) {
					System.out.println("enter the new salary");
					emp1.setEmp_salary(sc.nextDouble());
					System.out.println("enter the new mobile");
					emp1.setMobile_no(sc.nextLong());
					System.out.println("empid: " + emp1.getEmp_Id() + " empsalary: " + emp1.getEmp_salary()
							+ " Mobileno: " + emp1.getMobile_no()+
							" employee name: "+emp1.getemp_name()+
							" city :"+emp1.getCity());
				}
			}

		} else {
			System.out.println("insert the data ");
		}
	}

	public void sreachEmployee() {
		EmployeeInfo emp1;
		if (einfoArray != null) {
			for (int i = 0; i <= einfoArray.length - 1; i++) {
				emp1 = einfoArray[i];
				System.out.println(emp1.getEmp_Id());
			}
			System.out.println("enter the employee id to sreach");
			int x = sc.nextInt();
			for (int i = 0; i <= einfoArray.length - 1; i++) {
				emp1 = einfoArray[i];
				if (x==emp1.getEmp_Id()) {
					System.out.println(" empsalary: " + emp1.getEmp_salary() + " mobileno: " + 
				emp1.getMobile_no()+" employee name: "+emp1.getemp_name()+
				" city : "+emp1.getCity());
				}

			}

		} else {
			System.out.println("insert the data");
		}
	}

	public void selectAllData() {
		if (einfoArray != null) {
			for (int i = 0; i <= einfoArray.length - 1; i++) {
				EmployeeInfo emp1 = einfoArray[i];
				if (einfoArray[i] == null) {
					//System.out.println("i won't print data");
				} else {
					System.out.println(" empId: " + emp1.getEmp_Id() + " empsalary: " + emp1.getEmp_salary()
							+ " mobileno: " + emp1.getMobile_no()+
							" employee name: "+emp1.getemp_name()+" city: "+emp1.getCity());
				}
			}
		} else {
			System.out.println("insert data");
		}
	}

	public void exit() {

	}
}
public class EmployeeString  {
	static int z=0;
	
	public static void main(String[] args) {
		
		// Employee emp = new Employee();
		EmployeeOperation empo = new EmployeeOperation();
		while (true) {
			System.out.println("select the option");
			System.out.println("1:inset an employee");
			System.out.println("2:delete an employee");
			System.out.println("3:update an employee");
			System.out.println("4:sreach an employee");
			System.out.println("5:select all data");
			System.out.println("6:exit");
			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();
			switch (option) {
			case 1:
				empo.insertEmployee();
				System.out.println("insertion is successfully");
				break;
			case 2:
				empo.deleteEmployee();
				System.out.println("employee data deleted");
				break;
			case 3:
				empo.updateEmployee();
				System.out.println("employee data updated successfully");
				break;
			case 4:
				empo.sreachEmployee();
				break;
			case 5:
				empo.selectAllData();
				break;
			case 6:
				empo.exit();
				System.out.println("exit");
				break;
			default:
				System.out.println("invalid option");

			}

		}
	}

}



