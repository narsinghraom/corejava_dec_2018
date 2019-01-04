package com.vtalennt.Interfces;

public class DeskPhone implements Telephone {
	private int mynumber;
	private boolean isRinging;
DeskPhone(int phonenumber)
{
	this.mynumber=phonenumber;
}

	public void powerOn() {
		System.out.println("deskphone does not have the power button");
		
	}

	public void dial(int phonenumber) {
		System.out.println("now ringing"+phonenumber+"on deskphone");
		
	}

	public void answer() {
		if(isRinging)
			System.out.println("Answer the phone");
		isRinging=false;
			
		
	}

	public boolean callPhone(int phonenumber) {
		if(phonenumber==mynumber)
		{  isRinging=true;
		System.out.println("ring ring ring ");
		}
		else
		{
		isRinging=false;
		}
		return isRinging;
	}

	public boolean isRinging() {
		return isRinging;
	}

}
