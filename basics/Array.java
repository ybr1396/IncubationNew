package basics;

import java.util.*;

public class Array {
	static int subarray(int arr[], int n, int sum) {
		int temp, i, j;
		for (i = 0; i < n; i++) {
			temp = arr[i];
			for (j = i + 1; j <= n; j++) {
			if (temp == sum) {
			int a = j - 1;
			System.out.println("Sum found between indexes  " + i + " and " + a);
			return 1;
				}
		if (temp > sum || j == n)
		break;
		temp = temp + arr[j];}}
		System.out.println("No subarray found");
		return 0;
		}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of elements: ");
		int n = sc.nextInt();
		int[] array = new int[n];
		System.out.println("Enter the array elements: ");
		for (int i = 0; i < n; i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("Enter the value of sum: ");
		int sum = sc.nextInt();
		subarray(array, n, sum);
		sc.close();
	}
}
