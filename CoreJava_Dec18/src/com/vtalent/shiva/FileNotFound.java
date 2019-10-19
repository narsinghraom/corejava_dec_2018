package com.vtalent.shiva;

import java.io.FileNotFoundException;
import java.io.FileReader;

class FileNotFound{
		public static void main(String[] args)
		{
		    try
		    {
		        FileReader file = new FileReader("somefile.txt");
		    }
		    catch (FileNotFoundException e)
		    {
		        
		        System.out.println(e);
		    }
		    System.out.println("friends");
		}
	}

