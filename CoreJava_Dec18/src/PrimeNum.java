import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		
		 Scanner s = new Scanner(System.in); 
		 System.out.println("Enter a Number to which prime Number to be printed: ");
		  int n = s.nextInt();
		  int temp = 0;
		 /* for(int i =2; i<= n-1; i++) { if(n%i == 0) { temp = temp +1; } }
		 * System.out.println("==============================="); if(temp > 0)
		 * System.out.println(n +"-> is not a Prime Number"); else System.out.println(n
		 * +"=> is a Prime Number");
		 */
		for (int i=1; i<=n; i++) {
			for (int j = 2 ; j<=i-1; j++) {
				if(i%j == 0) {
						temp = temp + 1;
				}
			}
			if(temp == 0) {
				System.out.print(i +",");
			}
			else {
				temp = 0;
			}
		}
	}
}
