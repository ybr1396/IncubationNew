package basics;
import java.util.*;
public class Sumofarray {
private static void sum(int[] arr) {	
	}
static void sum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Elements: ");
		int size = sc.nextInt();
		int i,sum=0;
		int arr[]= new int[size];
		for(i=0;i<arr.length;i++) {
	    arr[i]=sc.nextInt();
	    sum+=arr[i];
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of Elements: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		int sum =0;
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
			sum+=arr[i];
			System.out.print("Enter the value of array: ");
			System.out.println(Arrays.toString(arr));
			sum(arr);
			System.out.println("Sum of the given array: " + sum);
		}
	}
}
