package com.vtalent.tarun.basics;

import java.io.*;
import java.text.*;
import java.nio.file.*;
import java.nio.file.attribute.*;
import java.util.*;

public class CopyDir {
	static int noFileCopied;

	static Scanner in = new Scanner(System.in);

	private static int copyFolder(File sourceFolder, File destinationFolder, String date) throws IOException {

		if (sourceFolder.isDirectory()) {

			if (!destinationFolder.exists()) {
				
				destinationFolder.mkdir();
				System.out.println("Directory created :: " + destinationFolder);
			}
			String files[] = sourceFolder.list();
			for (String file : files) {
				File srcFile = new File(sourceFolder, file);
				File destFile = new File(destinationFolder, file);

				// Recursive function call
				copyFolder(srcFile, destFile, date);
			}
		} else {
			String fileName = sourceFolder.toString();
			File myfile = new File(fileName);
			Path path = myfile.toPath();
			BasicFileAttributes fatr = Files.readAttributes(path, BasicFileAttributes.class);
			FileTime s = fatr.creationTime();
			System.out.println(s);
			String s2 = s.toString();
			String s3 = s2.substring(0, 10);
			if (s3.equals(date)) {

				if (!destinationFolder.exists()) {
					Files.copy(sourceFolder.toPath(), destinationFolder.toPath(), StandardCopyOption.REPLACE_EXISTING);

					noFileCopied = 0;
				} else {

					noFileCopied = 1;
				}
			}
		}

		return noFileCopied;
	}

	public static void main(String[] args) throws IOException {

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		Date dateobj = new Date();
		String date = df.format(dateobj);
		File s;
		String str;
		System.out.println("Enter name of the file with SourceFolder Path: ");
		s = new File(str=in.next());
		if (s.createNewFile()) {
			System.out.println("--File is created--");
		}
		else {
			System.out.println("--File not created--");
		}
		
		File src = new File("E:\\MyFolder1");
		File dest = new File("E:\\MyFolder2");
		int i = copyFolder(src, dest, date);
		if (i == 1)
			System.out.println("---no files to copy ---");
		else
			System.out.println(" ---files to copied ---");

	}
}