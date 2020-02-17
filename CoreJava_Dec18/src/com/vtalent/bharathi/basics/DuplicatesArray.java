package tasks;

import java.util.Arrays;

public class DuplicatesArray {
	public static void main(String[] args) {
		int [] arr= {1,4,1,5,17,8,9,8,200,1};
		Arrays.sort(arr);
		Arrays.setAll(arr,null);
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}

}
