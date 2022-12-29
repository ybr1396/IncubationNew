package today;

import java.util.Scanner;

public class Max{

	public static void main(String[] args) {
		Scanner ar = new Scanner(System.in);
		System.out.println("Enter the Size of elements: ");
		int size = ar.nextInt();
		System.out.println("Enter the value of array: ");
		int arr[] = new int[size];
		
		for (int i = 0; i < size; i++)
			arr[i] = ar.nextInt();
		    int j,arr_max;
		    arr_max= arr[0];
		       
		   for(j=arr.length-1;j>0;j--) {
			
			if(arr_max<arr[j]) {
				arr_max=arr[j];
				System.out.print("Maximum value of Array:"+arr_max);
				
			}
			
			
			}
		   
           
           
	}

}
