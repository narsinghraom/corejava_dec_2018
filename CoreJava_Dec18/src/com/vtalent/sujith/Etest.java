package src.com.vtalent.sujith;


import java.util.Scanner;

public class Etest {

public static void main(String[] args) {
	
	while(true) {
		System.out.println("0. Insert employee data");
		System.out.println("1. Display employee data");
		System.out.println("2.Update employee data");
		System.out.println("3.single employee data");
		System.out.println("4.deleted employee data");
		System.out.println("5. Exit");
		
		Scanner input=new Scanner(System.in);
		System.out.println("enter your choice");
		int choice=input.nextInt();
		
	
	 switch(choice) {   
       case 0:	            
    	  //EmpArray.insertData();	
    	   Emp emp=new Emp();
    	   System.out.println("enter employee data");
    	   System.out.println("enter employee id");
    	   emp.setId(input.nextInt());
    	   System.out.println("enter employee mobile number");
    	   emp.setMobile(input.nextLong());
    	   System.out.println("enter employee salary");
    	   emp.setSalary(input.nextFloat());
           System.out.println("inserted ");  
           EmpArray.insertData(emp);
           
           break;
       case 1:
    	   EmpArray.display();
           System.out.println("all employees displayed");
           break;
       case 2:
    	   
   		System.out.println("enter employee id");
   		int id=input.nextInt();
       	  EmpArray.update(id);
       	  break;
       case 3:  
      		System.out.println("enter employee id");
      		int id1=input.nextInt();
          	  EmpArray.singleEmployee(id1);
          	  break;
       case 4:  
     		System.out.println("enter employee id");
     		int id2=input.nextInt();
         	  EmpArray.delete(id2);
         	  break;
       case 5:
    	   System.exit(0);
    	   break;
       default:
          System.out.println("invalid condition");
	}
	}
}
}
