package practice;

import java.util.*;

public class RoughArea10 {
	public static boolean contains(int[] arr,int item)
	{
		for(int n:arr) {
			if(item==n) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Size of the element");
        int Size = sc.nextInt();
        int sum = 0;
        double average = 0;
        int[] arr1 = new int[Size];
        System.out.println("Enter the elements of array1:");
        for(int i =0 ;i<Size;i++) 
        {
        	arr1[i] = sc.nextInt();
        } 
        for(int i =0 ; i<arr1.length;i++) {
        	sum = sum + arr1[i];
        	 average = sum/arr1.length;	
        }
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println("The sum is "+ sum); 
        System.out.println("Average value is "+ average);
        System.out.println(contains(arr1,90));      
	}
}
