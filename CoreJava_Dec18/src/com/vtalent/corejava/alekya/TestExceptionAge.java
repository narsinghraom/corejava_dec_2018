package com.vtalent.corejava.alekya;

public class TestExceptionAge {
	public static void main(String[] args){
		int age=26;//if we give25 and above op is you r eligble, less than 25age it will be op as you r not eligble this type we will use in otp is wrong
		if(age<25){
			try{
			throw new AgeException();
			}catch(AgeException e){
				e.printStackTrace();
			}
			
	}else{
		System.out.println("your r eligble");
		
	}
	}

}
