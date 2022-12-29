package array;
import java.util.*;
public class Problem_3 {	
	static void rotate(int arr[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rotation: ");
		int n= sc.nextInt();
		for(int i=0;i<n;i++) {
		int j,last;
		last = arr[arr.length-1];
		for(j=arr.length-1;j>0;j--) {
			arr[j]=arr[j-1];
			}
		arr[0]=last;
		}sc.close();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		int arr[] = new int [size];
		System.out.println("Enter the elements of array: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Given array: ");
		System.out.println(Arrays.toString(arr));
		rotate(arr);
		System.out.println("Rotated array: ");
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
}
