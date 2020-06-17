package com.vtalent.tarun.basics;

import java.text.*;
import java.util.*;

public class SDFTest {

	public static void main(String[] args) throws Exception {
		SimpleDateFormat sdfin = new SimpleDateFormat("dd/MM/yyyy G");
		SimpleDateFormat sdfout = new SimpleDateFormat("yyyy-MM-dd G");
		Date d = sdfin.parse("19/05/1995 AD");
		System.out.println(d);
		String op = sdfout.format(d);
		System.out.println(op);
		
		
	}

}
