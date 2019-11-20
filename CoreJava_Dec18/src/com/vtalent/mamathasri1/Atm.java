package com.vtalent.mamathasri1;

	import java.util.Scanner;
	class Atm {
		
		private int balance, pin;
		private String mobile;
		 public int getBalance() {
		      return balance;
		   }
		 public String getMobile() {
		     return mobile;
		   }

		   public int getPin() {
		      return pin;
		   }
		   
		   public void setBalance( int newBalance) {
			      balance = newBalance;
			   }

			   public void setPin(int newPin) {
			      pin = newPin;
			   }
			   public void setMobile(String newMobile) {
					// TODO Auto-generated method stub
					mobile=newMobile;
				}



		void atm()
		{ 
			
			int withdraw=0, deposit=0;
			
			int n;
			System.out.println("WELCOME TO ICICI BANK ATM");
			Scanner s = new Scanner(System.in);
			while(true)
			{
				System.out.println("Please enter ur 4 digit PIN: \n");
				pin=s.nextInt();
				int pin_check = 1234;
				if( pin_check==pin)
				{
					//String s1="8096462779";
					
					while(true)
					{
						System.out.println("Verify ur 10 digit mobile number 80***79: ");
						String s2=s.next();
						if(mobile.equals(s2)==true)
  						{
							System.out.println("Ur mobile number is verified U can proceed now");
							break;
						}
						else
						{
							System.out.println("incorrect mobile number");
						}
					}

					System.out.println("Choose 1 for Withdraw");
					System.out.println("Choose 2 for Deposit");
					System.out.println("Choose 3 for Check Balance");
					System.out.println("Choose 4 for MiniStatement");
					System.out.println("Choose 5 for EXIT");
					System.out.print("Choose the operation you want to perform:");
					n = s.nextInt();
					switch(n)
					{
					case 1:
						System.out.print("\n Enter money to be withdrawn:");
						withdraw = s.nextInt();
						if(withdraw%100!=0)
						{
							System.out.println("\n Enter multiples of hundred");
						}
						else if(balance >= withdraw)
						{
							balance = balance - withdraw;
							System.out.println("\n Please collect your money");
						}

						else
						{
							System.out.println("\n Insufficient Balance");
						}
						System.out.println("");
						break;

					case 2:
						System.out.print("\n Enter money to be deposited:");
						deposit = s.nextInt();
						balance = balance + deposit;
						System.out.println("\n Your Money has been successfully depsited");
						System.out.println("");
						break;

					case 3:
						System.out.println("\n Balance : "+balance);
						System.out.println("");
						break;

					case 4:
						System.out.println("MINISTATEMENT\n");
						System.out.println("Ur current balance is: "+balance);
						System.out.println("Ur deposited amount is: "+deposit);
						System.out.println("Ur withdrawn amount is: "+withdraw);
						break;


					case 5:
						System.exit(0);
						s.close();
					}
				}
				else
				{
					System.out.println("U entered in correct pin PLEASE TRY AGAIN");
				}
			}
		}
		
		
	}




class Encapsulation {

	public static void main(String[] args) {
	Atm a = new Atm();
		  a.setBalance(5000);
	      a.setPin(1234);
	      a.setMobile("8096462779");
	      System.out.println("Please enter ur 4 digit PIN: \n" +a.getBalance());
	      a.atm();
	}
}