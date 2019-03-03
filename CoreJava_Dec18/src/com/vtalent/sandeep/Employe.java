package com.vtalent.sandeep

import java. util. Scanner;

public class Employe {
 static Employe[]EmpArray;
 static Scanner input = new Scanner(System.in);
 public int insertEmployeFromArray(){
	 int tempid = input.nextInt ();
	 for(int i=0;i<=EmpArray.length-1;i++);
	 int i =0;
	 Employe emp =EmpArray[i];
   if(emp.getEmpId()==tempid){
		 EmpArray[i]=null;
		 return i+1;
   }
 return i;


	return 0;
}
public static void main(String[]args){

boolean flag = false;
if (flag){
	System.out.println("executing data");
}
else{
	System.out.println("invalid Id");
}
}
}
	











 
