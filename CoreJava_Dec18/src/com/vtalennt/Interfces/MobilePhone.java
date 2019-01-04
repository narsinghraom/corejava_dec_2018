package com.vtalennt.Interfces;

public class MobilePhone implements Telephone {
	private int mynumber;
	private boolean isRinging;
	private boolean powerOn=false;
	MobilePhone(int mynumber)
	{
		this.mynumber=mynumber;
	}


	public void powerOn() {
		powerOn=true;
		System.out.println("my mobile phone is power on");
		
	}

	public void dial(int phonenumber) {
		if(powerOn)
		System.out.println("now ringing"+phonenumber+"on mobilephone");
		else
			System.out.println("my mobile phone is switched off");
		
	}

	public void answer() {
		if(isRinging)
			System.out.println("Answer the mobilephone");
		isRinging=false;
			
		
	}

	public boolean callPhone(int phonenumber) {
		if(phonenumber==mynumber&&powerOn)
		{  isRinging=true;
		System.out.println("melody ring");
		}
		else
		{
		isRinging=false;
		System.out.println("mobile phone not on or number different");
		}
		return isRinging;
	}

	public boolean isRinging() {
		return isRinging;
	}

}


