package com.vtalent.java.vishnu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeEx implements Serializable {
int id;
double salary;
 static void serialie() throws IOException{
	SerializeEx se=new SerializeEx();
se.id=100;
se.salary=2688;
 File f=new File("D:\\vish.txt");
FileOutputStream fos= new FileOutputStream(f);
ObjectOutputStream oos=new ObjectOutputStream(fos);
 oos.writeObject(se);

System.out.println("done");
}
public static void deserialize() throws IOException, ClassNotFoundException{
	 File f=new File("D:\\vish.txt");
	FileInputStream fis= new FileInputStream(f);
	ObjectInputStream ois=new ObjectInputStream(fis);
	 Object o=ois.readObject();
	 SerializeEx  s=(SerializeEx)o;
	 System.out.println("id="+s.id);
	 System.out.println("salary="+s.salary);
}
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//serialie();
		deserialize();
	}

}
