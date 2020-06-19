package com.vtalent.vamshi.basics;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DateTimeFormatter di = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
LocalDateTime now = LocalDateTime.now();
System.out.println(di.format(now));
	
	}

}
