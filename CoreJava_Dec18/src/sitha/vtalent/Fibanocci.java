package sitha.vtalent;

import java.util.*;

public class Fibanocci {
public static void main(String[] args){
	int i,t1=0,t2=1,n,sum;
	Scanner a=new Scanner(System.in);
	System.out.println("Enter a number");
	n=a.nextInt();
	
	for(i=1;i<=n;i++){
		System.out.print(t1 + "  " );
		sum=t1+t2;
		t1=t2;
		t2=sum;		
		
	}
	
}
}
