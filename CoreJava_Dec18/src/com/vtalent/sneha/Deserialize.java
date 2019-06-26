package com.vtalent.sneha;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;

 class EmpDetails implements Serializable {
	 
	String name;
	 int id;
	 EmpDetails(String name,int id){
		 this.name=name;
		 this.id=id;
		 
	 }
	
}

public class Deserialize {
	public static void main(String args[]){
		try{
			FileInputStream fin=new FileInputStream("D://sneha.txt");
			ObjectInputStream in=new ObjectInputStream(fin);
			EmpDetails e2=(EmpDetails)in.readObject();
			in.close();
			fin.close();
			System.out.println(e2.name+"   "+e2.id);
			
			
			
		}catch(Exception e){
		e.printStackTrace();
		
	}
	}
}
 