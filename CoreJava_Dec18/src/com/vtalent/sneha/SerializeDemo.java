package com.vtalent.sneha;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 class EmpDetails implements Serializable {
	 String name;
	 int id;
	 EmpDetails(String name,int id){
		 this.name=name;
		 this.id=id;
		 
	 }
	
}

public class SerializeDemo {
	public static void main(String args[]){
		EmpDetails e1=new EmpDetails("sneha",51);
		try{
			FileOutputStream fout=new FileOutputStream("D://sneha.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(e1);
			out.close();
			fout.close();
			System.out.println("success");
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
			
		}
	}}

