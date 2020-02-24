package com.vtalent.mallikarjun.basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmpArrayListTest {
	public static void main(String[] args) {
		List<EmpArrayList> list=new ArrayList<EmpArrayList>();
		
		EmpArrayList emp=new EmpArrayList();
		emp.empId=101;
		emp.empName="ABC";
		emp.empSalary=20000;
		
		EmpArrayList emp1=new EmpArrayList();
		emp1.empId=102;
		emp1.empName="DEF";
		emp1.empSalary=21000;
		
		list.add(emp);
		list.add(emp1);
		System.out.println(list);
		System.out.println();
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			EmpArrayList e=(EmpArrayList)itr.next();
			System.out.println("Id="+e.empId+" name="+e.empName+" salary="+e.empSalary);
		}
		System.out.println();
		for(EmpArrayList e:list) {
			System.out.println("Id="+e.empId+" name="+e.empName+" salary="+e.empSalary);
		}
		}
}
