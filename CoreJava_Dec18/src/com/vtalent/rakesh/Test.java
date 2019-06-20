package com.vtalent.rakesh;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.setTime(new Date());
		Format f = new SimpleDateFormat("dd-MMMM-yyyy");
		System.out.println(f.format(date.getTime()));
		date.add(Calendar.MONTH, 2);
		System.out.println(f.format(date.getTime()));
	}
}