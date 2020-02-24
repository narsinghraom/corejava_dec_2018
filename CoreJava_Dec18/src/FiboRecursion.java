
public class FiboRecursion {

	static int a = 0, b = 1, c;

	public static void main(String[] args) {
		System.out.print(a +" " +b);
		printFib(20);

	}

	public static void printFib(int i) {
		if (i >= 1) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;
			printFib(i - 1);
		}
	}
}
