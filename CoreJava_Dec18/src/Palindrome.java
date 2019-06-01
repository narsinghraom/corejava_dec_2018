import java.util.Scanner;


public class Palindrome {
	public static void main(String[] args)
	{
		Scanner input=new Scanner(System.in);
		String S1=new String(input.next());
		System.out.println("S1 is"+S1);
		String S2=new String();//created empty string
		//adding S1 into S2 in reverse order
	for(int i=S1.length()-1;i<=0;i--)
	{
		S2=S2 + S1.charAt(i);
		
	}
	System.out.println("S2 is"+S2);
	if(S2.equalsIgnoreCase(S1))
	{
		System.out.println("given String"+S1+"is a palindrome");
	}
	else
	{
		System.out.println("given String"+S1+"is not a palindrome");
	}

}
}
