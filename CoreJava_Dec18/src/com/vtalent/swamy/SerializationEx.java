package com.vtalent.swamy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationEx implements Serializable {
 int id ;
/* transient*/ double salary; //transient keyword hide original data show some dedault values.
 public static void   Serialization() throws IOException {
	 SerializationEx se=new SerializationEx ();
	 se.id=101;
	se.salary=1676787;
	 File file =new File("c:/swami/file.txt");
	 FileOutputStream fos=new FileOutputStream(file);
	 ObjectOutputStream oos =new ObjectOutputStream(fos);
	 oos.writeObject(se);
	 System.out.println("sucess");
 }
 public static void   deSerialization() throws IOException, ClassNotFoundException {

 File file =new File("c:/swami/file.txt");
 FileInputStream fis=new FileInputStream(file);
 ObjectInputStream ois =new ObjectInputStream(fis);
  Object o=ois.readObject();
  SerializationEx s=(SerializationEx)o;
  System.out.println("Id="+s.id);
  System.out.println("salary="+s.salary);
}
 public static void main(String[] args) throws IOException, ClassNotFoundException {
	// Serialization();
	deSerialization();
}
 }
