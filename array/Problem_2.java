package array;

import java.util.Scanner;

public class Problem_2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Size of the element: ");
	int size = sc.nextInt(); 
	System.out.println("Enter the values of array: ");
		int arr[] = new int [size];
		int sum = 0;
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();}
		for(int j:arr)
		sum+=j;
		System.out.println("Enter sum of the array:\n" + sum);
		sc.close();
}
}
