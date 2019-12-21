package com.vtalent.java.vishnu;

public class EmployeebeanTask {

	static Employee[] empArray=new Employee[2];
	public static int insertData(Employee employee){
		int return=0;
		if(null!=employee&& empArray!=null){
			for(int i=0;i<=empArray.length.-1;i++){
				if(empArray[i]==null){
					empArray[i]=employee;
					return ++;
				}
			}
		}
		return result;
	
	}
}
public statuc int DeleteAnEmployee(int employeeId){
	int return 0;
	if (empArray!=null){
		for(int i=0;i<=empArray.length-1;i++){
			if(empArray[i]!=null){
				Employee emp=empArray[i];
				if(employeeId==emp.getEmployeeId()){                                                                                                                                                              
					empArray[i]=null;
					result ++;
				
				}
			}
		}
	}
	return result;
}
