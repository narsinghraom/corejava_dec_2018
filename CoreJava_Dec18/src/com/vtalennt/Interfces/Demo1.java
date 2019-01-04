package com.vtalennt.Interfces;

public class Demo1 {

	public static void main(String[] args) {
		Telephone ts;
		ts=new DeskPhone(123456);
		ts.powerOn();
		ts.dial(1234567);
		ts.answer();
		ts.isRinging();
		ts.callPhone(123456);
		
		
	ts=new MobilePhone(123456);
	ts.dial(123456);
	ts.callPhone(123456);
	ts.powerOn();
	ts.isRinging();
	ts.answer();
		

	}

}
