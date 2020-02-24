import java.util.*;

public class RecursionFact {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = s.nextInt();
		System.out.println("Factorial of " + x  +" " +"is: " +fact(x));
	}
	public static int fact(int n) {
		if (n <= 1)
			return 1;
		else
			return n * fact(n - 1);
	}
}
