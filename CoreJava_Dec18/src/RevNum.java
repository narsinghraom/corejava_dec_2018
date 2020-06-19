import java.util.*;
public class RevNum {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a num: ");
		int  n = s.nextInt();
		int rem, rev = 0;
		while(n != 0) {
			rem = n % 10;
			rev = rev *10 + rem;
			n /=10;
			
		}
		System.out.println("===============");
		System.out.println("Reverse of given number is: " +rev);
	}

}
