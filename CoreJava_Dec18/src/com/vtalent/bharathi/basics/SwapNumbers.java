package tasks;

public class SwapNumbers {
	public static void main(String[] args) {
	 String num1 = "456789";
	 String num2 = "123";
	 num1 = num1+num2;
	 System.out.println("before Swap "+num1);
	 num2 =num1.substring(0, num1.length()-num2.length());
	 num1 = num1.substring(num2.length());
	 System.out.println("After Swaping "+num1+num2);
	 
	 
	}

}
