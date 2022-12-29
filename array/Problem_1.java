package array;
import java.util.*;
public class Problem_1 {
	public static void main(String[] args) {
		Scanner ar = new Scanner(System.in);
		System.out.println("Enter the Size of elements: ");
		int size = ar.nextInt();
		System.out.println("Enter the value of array: ");
		int arr[] = new int[size];
		for (int i = 0; i < size; i++)
			arr[i] = ar.nextInt();

		System.out.println("Enter the value of String: ");
		String arr1[] = new String[size];
		for (int j = 0; j < size; j++)
			arr1[j] = ar.next();

		System.out.println("Original numeric array : \n" + Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("Sorted numeric array : \n" + Arrays.toString(arr));

		System.out.println("Original string array : \n " + Arrays.toString(arr1));
		Arrays.sort(arr1);
		System.out.println("Sorted string array :\n " + Arrays.toString(arr1));
		ar.close();
	}
}
