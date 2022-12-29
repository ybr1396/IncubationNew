package basics;

import java.util.*;

public class Rotation {
	static void rotate(int arr[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rotation: ");
		int n = sc.nextInt();
		for (int i = 0; i < n%arr.length; i++) {
			int j, last;
			last = arr[arr.length - 1];
			for (j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = last;
		}
		System.out.println();
		sc.close();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++)
			arr[i] = sc.nextInt();
		System.out.println("Original array: ");
		System.out.println(Arrays.toString(arr));
		rotate(arr);
		System.out.println("Rotated array: ");
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}












//int x = arr[arr.length - 1], i;
//for (i = arr.length - 1; i > 0; i--) {
//	arr[i] = arr[i - 1];
//}
//	arr[0] = x;		
//}
