package com.vtalent.swamy;

import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class CollectionEmp  implements Serializable{

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Scanner sc =new Scanner(System.in);
		String s="no";
do {
	System.out.println("1:insert data");
	System.out.println("2:update");
	System.out.println("3:Delete");
	System.out.println("4:search by id");
	System.out.println("5:print all");
	System.out.println("6:exit");
	System.out.println("please enter U R Option");
	int i=sc.nextInt();
	switch(i) {
	case 1:System.out.println("insert data");
	CollectionEmEX.insert();
	break;
	case 2:System.out.println("update data");
	break;
	case 3:System.out.println("Delete data");
	CollectionEmEX.delete();
	break;
	case 4:System.out.println("search data");
	CollectionEmEX.search();
	break;
	case 5:System.out.println("print data");
	CollectionEmEX.printall();
	break;
	case 6:System.out.println("exit");
	System.exit(0);
	break;
	}
	System.out.println("Do you want to continue.(yes/no)");
	s=sc.next();
}while(s.equals("yes"));
	
System.out.println("Application Terminated***..***");
	}

}
