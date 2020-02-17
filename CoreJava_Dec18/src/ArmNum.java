import java.util.*;

public class ArmNum {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int t1 = n;
		int leng = 0;
		while (t1 != 0) {
			t1 =t1/10;
			leng = leng + 1;

		}
		int t2 = n, rem, arm = 0;
		while (t2 != 0) {
			rem = t2 % 10;
			int mul = 1;
			for (int i = 0; i <= leng; i++) {
				mul = mul * rem;
			}
			arm = arm + mul;
			t2 =t2/10;
		}
		if (arm == n)
			System.out.println("Arm Num");
		else
			System.out.println("Not a Arm Num");
	}

}
