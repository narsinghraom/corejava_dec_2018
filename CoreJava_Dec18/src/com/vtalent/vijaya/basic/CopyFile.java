package com.vtalent.vijaya.basic;
	import java.io.File;
	import java.io.IOException;
	import java.nio.file.Files;
	import java.nio.file.Path;
	import java.nio.file.StandardCopyOption;
	import java.nio.file.attribute.BasicFileAttributes;
	import java.nio.file.attribute.FileTime;
	import java.util.Scanner;
	public class CopyFile {
		 static Scanner in=new Scanner(System.in);
		private static void copyFolder(File sourceFolder, File destinationFolder, String date) throws IOException
	    {
		
	        if (sourceFolder.isDirectory()) 
	        {
	            //Verify if destinationFolder is already present; If not then create it
	            if (!destinationFolder.exists()) 
	            {
	                destinationFolder.mkdir();
	                System.out.println("Directory created :: " + destinationFolder);
	            } 
	             
	            //Get all files from source directory
	            String files[] = sourceFolder.list();
	             
	            //Iterate over all files and copy them to destinationFolder one by one
	            for (String file : files) 
	            {
	                File srcFile = new File(sourceFolder, file);
	                File destFile = new File(destinationFolder, file);
	                 
	                //Recursive function call
	                copyFolder(srcFile, destFile, date);
	            }
	        }
	        else
				        {
				        	String fileName = sourceFolder.toString();
				            File myfile = new File(fileName);
				            Path path = myfile.toPath();
				            BasicFileAttributes fatr = Files.readAttributes(path, BasicFileAttributes.class);
				            FileTime s=fatr.creationTime();
				            String s2=s.toString();
				            String s3=s2.substring(0,10);
				            //System.out.println(s3);
				           
						            if(s3.equals(date)) {
						        		//System.out.println(sourceFolder+ " file is ctreated on " +fatr.creationTime()+"---"+s3 );	

									        	if(!destinationFolder.exists()){
									        		Files.copy(sourceFolder.toPath(), destinationFolder.toPath(), StandardCopyOption.REPLACE_EXISTING);
									        		System.out.println("File is already copied " + destinationFolder);	
														        	}else {
											        	//Copy the file content from one place to another 
											            
											           System.out.println("no file to copy ");
											           }
						        	}
				      }
	        
	    }    

	    public static void main(String[] args) throws IOException {
	    	 System.out.println("which date files do u want to copy (yyyy-mm-dd)");
	         String date=in.next();
	    	File src = new File("F:\\Folderone");
			   File dest = new File("F:\\Foldertwo");
			   copyFolder(src,dest,date);
	  
	       
	    }
	}


