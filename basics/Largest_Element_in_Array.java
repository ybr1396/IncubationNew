package basics;
import java.util.*;
public class Largest_Element_in_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		System.out.println("Enter the elements of array: ");
		int arr[] = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Largest elements in array: ");
		int max = arr[0];
		for (int i = 0; i < size; i++) {
			if (arr[i] > max) {
				max = arr[i];	
			}
		}
		System.out.println(max);
	}
}
