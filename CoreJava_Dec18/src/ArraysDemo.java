import java.util.Arrays;
import java.util.Scanner;

public class ArraysDemo {

	public static void main(String[] args) {
		// int [][] a = {{10,20,30,40},{50,60},{70,80,90}};
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no. of elements in array: ");
		n = s.nextInt();
		int[] b = new int[n];
		System.out.println("Enter all the elements into array:");
		for (int i = 0; i < n; i++) {
			b[i] = s.nextInt();

		}
		System.out.println("Given array: ");
		for (int i : b) {

			System.out.print(i + " ");
		}
		System.out.println();
		//int[] b = { 36, 19, 29, 12, 5, 75, 86, 11, 9, 6, 44 };

		//int temp;
		int temp =0;
		for (int i = 0; i < b.length; i++) {
			int flag = 0;
			//for (int j = 0; j < b.length - 1 - i; j++) {
			for (int j = i+1; j < b.length; j++) {	
			//ascending order
				/*
				 * if (b[j] > b[j + 1]) { temp = b[j]; b[j] = b[j + 1]; b[j + 1] = temp; flag =
				 * 1;
				 * 
				 * }
				 */			
			//descending order:
			if (b[i]<b[j]) {
				temp = b[i];
				b[i] = b[j];
				b[j] = temp;
				flag = 1;
			}
			}
			if (flag == 0) {
				break;
			}
		}
		//System.out.println("Given array in ascending order: ");
		System.out.println("Given array in descending order: ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

		/*
		 * System.out.println(a); System.out.println(a[0]); System.out.println(a[0][0]);
		 * System.out.println(a.length); System.out.println(a[0].length);
		 * System.out.println(b); System.out.println(b[0]); System.out.println(b[0][0]);
		 * //System.out.println(a[0][0].length);
		 */
		// ===================================================================================
		/*
		 * Arrays.sort(b); System.out.printf("Modified arr[] : %s",Arrays.toString(b));
		 */
	}
}
