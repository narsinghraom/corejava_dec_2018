package com.vtalent.swamy;

import java.util.Scanner;

public class EmployeeEx {
	static Scanner sc = new Scanner(System.in);
	static int size = sc.nextInt();
	public static EmployeeBeen[] emparry = new EmployeeBeen[size];

	public static int insert(EmployeeBeen eb) {
		int result = 0;
		if (null != eb && emparry != null) {
			for (int i = 0; i <= emparry.length - 1; i++) {
				if (emparry[i] == null) {
					emparry[i] = eb;
					System.out.println(emparry[i]);
					result++;
					break;
				}
			}
		}
		return result;
	}

	public static int delete(EmployeeBeen eb1) {
		int result = 0;
		if (emparry != null) {
			for (int i = 0; i <= emparry.length - 1; i++) {
				EmployeeBeen arrayData = null;
				arrayData = emparry[i];
				if (arrayData != null && arrayData.getEmpid() == eb1.getEmpid()) {
					emparry[i] = null;
					result++;
				}
			}
		}
		return result;
	}

	public static int searchById(EmployeeBeen eb2) {
		int result = 0;
		if (emparry != null) {
			for (int i = 0; i <= emparry.length - 1; i++) {
				EmployeeBeen arrayData = null;
				arrayData = emparry[i];
				if (emparry[i] != null && arrayData.getEmpid() == eb2.getEmpid()) {
					System.out.println(emparry[i]);
					result++;
				}
			}
		}
		return result;
	}
public static int searchbyName(EmployeeBeen eb3) {
int result =0;
	if(emparry!=null) {
		for(int i=0;i<=emparry.length-1;i++) {
			EmployeeBeen arrayData = null; 
			arrayData = emparry[i];
			if (emparry[i] != null && arrayData.getEmpname( ) .equalsIgnoreCase(eb3.getEmpname())) {
				System.out.println(emparry[i]);
				result++;
		}
	}}
	return result;
	
}
	public static int displayAll() {
		for (int i = 0; i <= emparry.length - 1; i++) {
			if (emparry[i] != null) {

				System.out.println(emparry[i]);

			}
		}
		return 0;
	}
	public static int update(EmployeeBeen eb) {
		int result=0;
	 for(int i=0;i<=emparry.length-1;i++) {
		 if(emparry==null) {
			 emparry[i]=eb;
			 result++;
		 }
	 }
		
		return result;
		
	}
}