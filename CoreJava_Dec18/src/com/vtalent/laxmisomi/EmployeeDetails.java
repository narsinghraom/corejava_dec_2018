
package com.vtalent.laxmisomi;

import java.util.*;

import java.io.*;

class EmployeeBean implements Serializable {
	private int EmployeeId;
	private String EmployeeName;
	private double EmployeeSalary;
	private long EmployeeMobileNo;

	static EmployeeBean[] empArray;
	static Scanner sc = new Scanner(System.in);

	
	
	
    // to insert employee data
	
	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return EmployeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		EmployeeSalary = employeeSalary;
	}

	public long getEmployeeMobileNo() {
		return EmployeeMobileNo;
	}

	public void setEmployeeMobileNo(long employeeMobileNo) {
		EmployeeMobileNo = employeeMobileNo;
	}

	public void InsertData() throws Exception {

		EmployeeBean emp;
		int result = 0;
		System.out.println("please enter no of employeees to insert into Array");
		int length = sc.nextInt();
		empArray = new EmployeeBean[length];

// creating for loop to entire the employee details
		for (int i = 0; i < empArray.length; i++) {
			// creating object for employeebean class reference
			emp = new EmployeeBean();
			System.out.println("please enter employee id");
			int id = sc.nextInt();
			// to store the given id in object which is already given setter methods
			emp.setEmployeeId(id);

			System.out.println("please enter employee name");
			// to create space for antother word like lakshmi somisetty
			sc.nextLine();
			String name = sc.nextLine();
			emp.setEmployeeName(name);

			System.out.println("please enter employee salary ");
			double salary = sc.nextDouble();
			emp.setEmployeeSalary(salary);

			System.out.println("please Enter Employee MobileNo");
			long Mnumber = sc.nextLong();
			emp.setEmployeeMobileNo(Mnumber);

			empArray[i] = emp;

		}
		writeObjectInToFile();
		readFileToGetObject();
		
		

	}

	
	private void readFileToGetObject() throws  Exception {
		// TODO Auto-generated method stub
		
		
		FileInputStream f2=new FileInputStream("employeedetails.txt");
		ObjectInputStream oos2=new ObjectInputStream(f2);
		Object oos3= oos2.readObject();
		EmployeeBean emp=(EmployeeBean)oos3;
		System.out.println("name=" + emp.getEmployeeName() + "  " + "Id=" + emp.getEmployeeId() + "    " + "salary="
				+ emp.getEmployeeSalary() + "  " + "Mobile number" + emp.getEmployeeMobileNo());
		
		
		
		
		
	}

	private void writeObjectInToFile() throws Exception {
		
		// TODO Auto-generated method stub
		
		EmployeeBean emp=new EmployeeBean();
		File file=new File("employeedetails.txt");
		FileOutputStream f1=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(f1);
		oos.writeObject(emp);
		System.out.println("seriualization is done");
		
		
	}

	// to delete employee data 

	public void delete() {
		System.out.println("Enter an employeeId to be delete. ");
		int w = sc.nextInt();
	    int i, count=0;  
		for(i=0; i<empArray.length; i++) {
			if(empArray[i]!=null && empArray[i].EmployeeId == w){
				empArray[i]=null;
				count++;
				break;
			}
		}
		if(count == 0) {
			System.out.println("Employee Id Not Found..!!");
		} else {
			System.out.println("Employee id Deleted Successfully..!!");
			System.out.println("Now the New Array is : ");
			for(i=0; i<empArray.length; i++) {
				if(empArray[i] != null) {
					EmployeeBean ae2 = (EmployeeBean)empArray[i];
					System.out.println("Id="+ae2.EmployeeId +" "+"Salary="+ae2.EmployeeSalary +" "+"Mobile no="+ae2.EmployeeMobileNo);
				}
			}
		}
	}
	
	 
	  
	
	  //to search employee details with the help of name
	
	  public void searchName() {
		  
	  System.out.println("please enter the name to be searched"); 
	  String s=sc.next();
	  for(int i=0;i<=empArray.length-1;i++) {
		  if(empArray!=null) {
			  EmployeeBean abc=empArray[i];
			  if(abc!=null) { 
			  if(s.equals (abc.getEmployeeName())) {
	  System.out.println("EmployeeId=" + abc.getEmployeeId() + "EmployeeName=" +abc.getEmployeeName() + "EmployeeSalary=" + abc.getEmployeeSalary() + "EmployeeMobileNo=" + abc.getEmployeeMobileNo());
	  
			  }
			  else {
	  System.out.println("enter valid name");
	  } 
			  }
			  } 
		  }
	  }
	  
	 
	 
	  
	  //to search employee details with id
	
	  public void search() {
			System.out.println("Enter an employeeId to be search: ");
			int x = sc.nextInt();
			for (int i=0;i<empArray.length;i++) {
				if(empArray[i] != null) {
					EmployeeBean ae3 = (EmployeeBean)empArray[i];
					if(empArray[i].EmployeeId == x) {
						System.out.println("Id="+ae3.EmployeeId +" "+"Salary="+ae3.EmployeeSalary +" "+"Mobile no="+ae3.EmployeeMobileNo);
						System.out.println("Given employeeId is in the array. ");
						return;
					}
				}
			}
			System.out.println("Employee id not found. ");
		}
	  
	  //to search employee name with letter
	  
	  public void searchwithletter() {
			System.out.println("Enter letter to be search: ");
			char c = sc.next().charAt(0);
			for (int i=0;i<empArray.length;i++) {
				if(empArray[i] != null) {
					EmployeeBean ae4 =empArray[i];  
					if(ae4 != null)    {
						if(c==ae4.getEmployeeName().charAt(0)) {
						System.out.println("Id="+ae4.getEmployeeId() +" "+"Salary="+ae4.getEmployeeSalary() +" "+"Mobile no="+ae4.getEmployeeMobileNo() +" " + "name="+ae4.getEmployeeName());
						System.out.println("Given letter is in the array. ");
					}
				}
			}else {
			System.out.println("Employee's name letter not found. ");
			}
		}
	  }
		
	  // to update employee de tails
	  
	  public void updateData() {
		  if(empArray !=null)
		  {
			  System.out.println("enter your employee id which is need to update");
			  int j=sc.nextInt();
			  for(int i=0; i<empArray.length; i++) {
				EmployeeBean g=empArray[i];
				if(g !=null)
				{
					if (j==(g.getEmployeeId())) {
						System.out.println("Id="+g.EmployeeId +" "+"Salary="+g.EmployeeSalary +" "+"Mobile no="+g.EmployeeMobileNo + "Employee Name=" + g.EmployeeName);
					
					 
					System.out.println("Do you want to update the id" +g.getEmployeeId() +"yes/no");
					String l=sc.next();
					if(l.equals ("yes")) {
					System.out.println("enter id to update ");
						g.setEmployeeId(sc.nextInt());
						
					}
					
					System.out.println("Do you want to update employee name"+g.getEmployeeName() + " yes/no");
					String d=sc.next();
					if(d.equals ("yes")) {
						System.out.println("enter employee name to update");
						g.setEmployeeName(sc.next());
					}
					
					System.out.println("Do you want to update employee salary" +g.getEmployeeSalary() +" yes/no");
					String e=sc.next();
					if(e.equals("yes")) {
						System.out.println("enter employee salary to update");
						g.setEmployeeSalary(sc.nextDouble());
					}
					
					System.out.println("Do you want to updtae empployee mobile number"+g.getEmployeeMobileNo() +" yes/no");
					String f=sc.next();
					if(f.equals("yes")) {
						System.out.println("enter employee mobile number to update");
						g.setEmployeeMobileNo(sc.nextLong());
					}
					}
					
					}
				
			  }
		  }
	  }
        
		
		

	  // To print employee details 
		public void printAll() {
			for(int i=0;i<empArray.length;i++) {
				if(empArray[i] != null) {
					EmployeeBean ae4 = (EmployeeBean)empArray[i];
					System.out.println("Id="+ae4.EmployeeId +" "+"Salary="+ae4.EmployeeSalary +" "+"Mobile no="+ae4.EmployeeMobileNo+ "EmployeeName ="+ae4.EmployeeName);
				}
			}
			System.out.println("All the employee details printed successfully. ");
		}
			
	}


 
	 
	public class EmployeeDetails {

		public static void main(String[] args) throws Exception {
			
			EmployeeBean a = new EmployeeBean();
			for(;;) {
				Scanner s = new Scanner(System.in);
				System.out.println("Please select your choice: \r\n" +
						"1. insert Into Array.\r\n" + 
						"2. delete from my Array.\r\n" + 
						"3. Search an employee from my Array.\r\n" + 
						"4. Search All the employees from my Array with the help of name.\r\n" +
						"6. update All the employees from my Array .\r\n" +
						"5. search employee details with letters from my Array .\r\n" +

						"7. Print All the employees from my Array.\r\n" + 
						"8. Exit.");
				int scan = s.nextInt();
				switch(scan) {
				case 1: a.InsertData();
				break;
				case 2: a.delete(); 
				break;
				case 3: a.search();
				break;
				case 4: a.searchName();
				break;
				case 5: a.searchwithletter();
				break;
				
				case 6: a.updateData();
				break;
		        case 7: a.printAll();
				break;
				case 8: 
				System.exit(0);
				default: System.out.println("Please give a valid Input: ");
				
			 
				
				}
			}
		}
	}
