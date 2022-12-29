package today;

import java.util.Scanner;

public class Min {

	public static void main(String[] args) {
		Scanner ar = new Scanner(System.in);
		System.out.println("Enter the Size of elements: ");
		int size = ar.nextInt();
		System.out.println("Enter the value of array: ");
		int arr[] = new int[size];
		
		for (int i = 0; i < size; i++)
			arr[i] = ar.nextInt();
		    int j,arr_min;
		    arr_min= arr[arr.length-1];
		       
		   for(j=0;j<arr.length;j++) {
			
			if(arr[j]<=arr_min) {
				arr_min=arr[j];
				System.out.print("Minimum value of Array:"+arr_min);
				
			}
			
			

	}

}
}