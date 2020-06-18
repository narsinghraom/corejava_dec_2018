package com.vtalent.corejava.alekya;
import java.util.Scanner;
public class Test2 {
	

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			EmployeeRecord selc=new EmployeeRecord();
		
			int n=1;
			while(n>0){
		     	System.out.println("1.insert");
		     	System.out.println("2.delete");
		     	System.out.println("3.update");
		     	System.out.println("4.search");
		     	System.out.println("5.searchAll");
		     	System.out.println("6.Exit");
			    System.out.println("enter your choice");
		         int ch=sc.nextInt();

					switch(ch)
		         {
		            case 1:
		            	selc.insert();
		                break;
		            case 2:
		                selc. delete();
		                break;
		            case 3:
		               selc.update();
		                break;
		            case 4:
			           selc.search();
			             break;
		            case 5:
				       selc.searchAll();
				          break;
		            case 6:
				        selc.exit();
				        n=0;
				        break;
					default:
		            	System.out.println("Invalid option");
		            	
		         }
			}
		    }
		 
		         }
	


