package com.vtalent.mahadev1;

public class EmployeeOperations {
	static Employee[] empArray;
	public static void insertData(Employee emp)
	{
		if(empArray!=null)
		{
			for (int i=0;i<=empArray.length-1;i++){
				if(empArray[i]==null){
					empArray[i]=emp;
					break;
				}
				 
			}
		}
	}
}
	


