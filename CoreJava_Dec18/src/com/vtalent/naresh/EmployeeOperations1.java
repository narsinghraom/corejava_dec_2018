package com.vtalent.naresh;
import java.util.*;

public class EmployeeOperations1 {
	Employee emp;
	static List<Employee> emparray = new ArrayList<Employee>();
	Scanner sc = new Scanner(System.in);
	public static void insertData(Employee emp) {
		if(emparray!=null) {
		emparray.add(emp);
		}
		System.out.println("Successfully Inserted");
	}	

public void PrintAll() {
	for(Employee emp1:emparray) {
		if(emp1.getLoanAmount()==0.0) {
			System.out.println("Employ id- "+emp1.getEmployId()+'\n'+"Employ Name- "+emp1.getEmployname()+'\n'+ "Employ Package- "+emp1.getEmployPackage()+'\n'+ "Employ Salary- "+emp1.getEmploySalary()+'\n'+ "Employ Pf(2%)- "+emp1.getEmployPf());
			System.out.println("Loan Amount-N/A"+'\n'+"EMI-N/A"+'\n'+"Tenure-N/A");
			 
		}
		else{
			System.out.println("Employ id- "+emp1.getEmployId()+'\n'+"Employ Name- "+emp1.getEmployname()+'\n'+ "Employ Package- "+emp1.getEmployPackage()+'\n'+ "Employ Salary- "+emp1.getEmploySalary()+'\n'+ "Employ Pf(2%)- "+emp1.getEmployPf());
		System.out.println("Loan Amount-"+emp1.getLoanAmount()+'\n'+"EMI-"+emp1.getEmi()+'\n'+"Tenure-"+emp1.getTenure()+'\n'+"Take Home Salary-"+emp1.getTakeHome());  
		 emp1.date();
		  
		}
		//System.out.println("Employ id- "+emp2.getEmployId()+'\n'+"Employ Name- "+emp2.getEmployname()+'\n'+ "Employ Package- "+emp2.getEmployPackage()+'\n'+ "Employ Salary- "+emp2.getEmploySalary()+'\n'+ "Employ Pf(2%)- "+emp2.getEmployPf());
	}
}

public void search() {
	System.out.println("Enter the id to search");
		int i=sc.nextInt();
		for(Employee emp2:emparray) {
				if(i==emp2.getEmployId()) {
					System.out.println("Employ id- "+emp2.getEmployId()+'\n'+"Employ Name- "+emp2.getEmployname()+'\n'+ "Employ Package- "+emp2.getEmployPackage()+'\n'+ "Employ Salary- "+emp2.getEmploySalary()+'\n'+ "Employ Pf(2%)- "+emp2.getEmployPf());
				}
					else {
						System.out.println("Enter Valid id");
					}
				
		}
}

public void delete() {
	System.out.println("Enter the id to delete");
	int i=sc.nextInt();
	int index=0;
	for(Employee emp2:emparray) {
		if(i==emp2.getEmployId()) {
			emparray.remove(index);
			System.out.println("--Deleted--");
		}

		index++;
}

}
 public void update() {
	System.out.println("Enter the id to update");
	int i=sc.nextInt();
	for(Employee emp2:emparray) {
		if(i==emp2.getEmployId()) {
			System.out.println("Enter the New Package ");
				emp2.setEmployPackage(sc.nextDouble());
				System.out.println("Updated Successful");
}
}
}


public void employLoan(Employee emp2, double salary ) {
	
	try {
		if(salary<20000) {
			throw new EmployeeLoan();
		}
		else {
			double loanamount=salary*5;
			emp2.setLoanAmount(loanamount);
			System.out.println("Congrats:) You're Eligible for a Loan of Amount of "+loanamount+" with a interest rate of 14% per Annum(12 Months)"+'\n'+"Would you like to opt for a Loan"+'\n'+" Type- Yes/No" );
			String s=sc.next();
			if(s.equalsIgnoreCase("yes")) {
				
				
				System.out.println("Enter Tenure Period");
				int tenure=sc.nextInt();
				emp2.setTenure(tenure);
			  double i=(((0.14*tenure)/12))*loanamount;
			  double emi=(i+loanamount)/tenure;
			  emp2.setEmi(emi);
					
			System.out.println("your Loan is Under Process Thank You");	
			}
			else if(s.equalsIgnoreCase("no")) {
				System.out.println("Thank You");
			}
			
			else {
				System.out.println("Enter Valid Id");
			}
		}
	}
	catch(EmployeeLoan e) {
		System.out.println(e);
	}
	
}

public void employeeLoanMain() {
if(emparray!=null) {
System.out.println("Enter Employee id to check Loan Eligibility");
int a=sc.nextInt();
for (Employee emp2:emparray) {
 if (a == emp2.getEmployId()) {
EmployeeOperations1 eo1=new EmployeeOperations1();
eo1.employLoan( emp2, emp2.getEmploySalary());
}

}
}
else {
System.out.println("Insert some data first");
}
}


}



	